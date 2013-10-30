package hadoop.common;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.Properties;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class CommonUtil {

	public static final String NAME_STARTTIME = "_STARTTIME";
	public static final String NAME_TEMPSTARTTIME = "_TEMPSTARTTIME";
	public static final String NAME_BATCHNO = "_BATCHNO";
	public static final String NAME_S_LOCK = "S_LOCK";
	public static final String NAME_E_LOCK = "E_LOCK";
	public static final String NAME_MULTI_TIME = "_MULTI_STARTTIME";
	public static final String NAME_TEMP_MULTI_TIME = "_TEMP_MULTI_STARTTIME";

	public static Path getStartTimePath(String wfPath) {
		return getPath(wfPath, NAME_STARTTIME);
	}

	public static Path getTempStartTimePath(String wfPath) {
		return getPath(wfPath, NAME_TEMPSTARTTIME);
	}

	public static Path getBatchPath(String wfPath) {
		return getPath(wfPath, NAME_BATCHNO);
	}

	public static Path getSLockPath(String wfPath) {
		return getPath(wfPath, NAME_S_LOCK);
	}

	public static Path getELockPath(String wfPath) {
		return getPath(wfPath, NAME_E_LOCK);
	}

	public static Path getMultiTimePath(String wfPath) {
		return getPath(wfPath, NAME_MULTI_TIME);
	}

	public static Path getTempMultiTimePath(String wfPath) {
		return getPath(wfPath, NAME_TEMP_MULTI_TIME);
	}

	public static Path getPath(String wfPath, String fileName) {
		Path path = null;
		if (wfPath.endsWith(fileName)) {
			path = new Path(wfPath);
		} else {
			path = new Path(wfPath, fileName);
		}
		return path;
	}

	public static void writeOozieDate(Map<String, String> prop) throws Exception {

		if (prop != null && prop.size() > 0) {
			File file = new File(System.getProperty("oozie.action.output.properties"));
			Properties props = new Properties();

			for (String key : prop.keySet()) {
				String value = prop.get(key);
				if (CommonUtil.isNotEmpty(value)) {
					props.setProperty(key, value);
				}
			}

			OutputStream os = new FileOutputStream(file);
			props.store(os, "");
			os.close();
		}
	}

	/**
	 * 工作流传过来的列分隔符,有可能是特殊字符,用八进制或者十六进制表示
	 * @throws IOException 
	 */
	public static String decode(String str) throws IOException {
		String re = str;
		if (str != null && str.startsWith("\\")) {
			str = str.substring(1, str.length());
			String[] chars = str.split("\\\\");
			byte[] bytes = new byte[chars.length];
			for (int i = 0; i < chars.length; i++) {
				if (chars[i].equals("t")) {
					bytes[i] = 9;
				} else if (chars[i].equals("r")) {
					bytes[i] = 13;
				} else if (chars[i].equals("n")) {
					bytes[i] = 10;
				} else if (chars[i].equals("b")) {
					bytes[i] = 8;
				} else {
					bytes[i] = Byte.decode(chars[i]);
				}
			}
			try {
				re = new String(bytes, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				throw new IOException(str, e);
			}
		}
		return re;
	}

	public static String getCutingString(byte[] bytes, int length, String charEncoding) throws UnsupportedEncodingException {
		String newString = new String(bytes, 0, length, charEncoding);
		byte[] newBytes = newString.getBytes(charEncoding);
		if (newBytes.length > length) {
			return getCutingString(newBytes, length - 1, charEncoding);
		}
		return newString;
	}

	public static String getCutingString(byte[] bytes, int firstIndex, int length, String charEncoding) throws UnsupportedEncodingException {
		String newString = new String(bytes, firstIndex, length, charEncoding);
		byte[] newBytes = newString.getBytes(charEncoding);
		if (newBytes.length > length) {
			return getCutingString(newBytes, 0, length - 1, charEncoding);
		}
		return newString;
	}

	public static boolean isEmpty(String str) {
		return str == null || str.length() == 0;
	}

	public static boolean isNotEmpty(String str) {
		return !CommonUtil.isEmpty(str);
	}

	public static boolean isNotBlank(String str) {
		return str != null && str.trim().length() > 0;
	}

	public static boolean isDigital(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * 获得　ＨＤＦＳ　文件系统
	 */
	private static FileSystem fs = null;

	public static FileSystem getFileSystem() throws IOException {
		Configuration config = new Configuration();
		if (null == fs) {
			fs = FileSystem.get(config);
		}
		return fs;
	}

	/**
	 * 如果${src}为空，设置为${value}
	 * @author huanghu
	 */
	public static String setNullValue(String src, String value) {
		String srcValue = src;
		if (isEmpty(src)) {
			srcValue = value;
		}
		return srcValue;
	}

	public static String[] parseYearMonth(String batchNum) throws Exception {
		if (null == batchNum) {
			throw new Exception("The batch-number is null.");
		}
		String year = batchNum.substring(2, 6);
		String month = batchNum.substring(6, 8);

		return new String[] { year, month };
	}

	/**
	 * 
	 * @param filePath
	 * @param content
	 * @throws IOException
	 * 需要保证这个文件路径是不存在的，否则就覆盖
	 */
	public static void writeToHdfs(Path filePath, String content,boolean ifOver) throws IOException {
		FSDataOutputStream out = null;
		try {
			FileSystem fs = CommonUtil.getFileSystem();
			out = fs.create(filePath, ifOver, 0);
			String gnsStr = content.toString();
			out.write(gnsStr.getBytes(), 0, gnsStr.length());
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}

	/**
	 * Check 路径是否为空
	 * @throws IOException 
	 */
	public static boolean checkPathExist(Path path) throws IOException {
		boolean ifExist = true;
		FileSystem fs = getFileSystem();
		if (!fs.exists(path)) {
			ifExist = false;
		}
		return ifExist;
	}
	
	/**
	 * 删除路径
	 * @throws IOException 
	 */
	public static boolean deletePath(Path path) throws IOException{
		FileSystem fs = getFileSystem();
		boolean rb = false;
		if(fs.exists(path)){
			rb = fs.delete(path, true);
		}
		return rb;
	}
	
	/**
	 * move path
	 * @throws Exception 
	 * @throws  
	 */
	public static void movePath(Path sourcePath ,Path targetPath) throws Exception{
		FileSystem fs = getFileSystem();
		if(checkPathExist(sourcePath)){
			deletePath(targetPath);
			fs.rename(sourcePath, targetPath);
		}else{
			throw new Exception("sourcePath "+sourcePath+" does not exist,please check!");
		}
	}
	

}
