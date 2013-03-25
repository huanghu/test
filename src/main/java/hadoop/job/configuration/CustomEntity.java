package hadoop.job.configuration;

import hadoop.job.tools.Constant;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableUtils;

public class CustomEntity implements WritableComparable<Object> {

	private String value1;
	private String value2;
	private int id;
	
	private static final byte [] EMPTY_BYTES = new byte[0];
	
	byte[] bytes = new byte[0];
	int length;
	
	private static ThreadLocal<CharsetEncoder> ENCODER_FACTORY =
	    new ThreadLocal<CharsetEncoder>() {
	      protected CharsetEncoder initialValue() {
	        return Charset.forName("UTF-8").newEncoder().
	               onMalformedInput(CodingErrorAction.REPORT).
	               onUnmappableCharacter(CodingErrorAction.REPORT);
	    }
	};
	
	public CustomEntity() {
		bytes = EMPTY_BYTES;
	}

	/** Construct from a string. 
	 */
	public CustomEntity(String string) {
		set(string);
	}
	
	/** Construct from another text. */
	public CustomEntity(Text utf8) {
		set(utf8);
	}
	
	/** Construct from a byte array.*/
	public CustomEntity(byte[] utf8)  {
		set(utf8);
	}
	
	public void set(String string) {
		try {
			ByteBuffer bb = encode(string, true);
		    bytes = bb.array();
		    length = bb.limit();
		}catch(CharacterCodingException e) {
			throw new RuntimeException("Should not have happened " + e.toString()); 
		}
	}

	/** Set to a utf8 byte array*/
	public void set(byte[] utf8) {
		set(utf8, 0, utf8.length);
	}
		  
	/** copy a text. */
	public void set(Text other) {
		set(other.getBytes(), 0, other.getLength());
	}

	/**
	 *Set the Text to range of bytes
	 * @param utf8 the data to copy from
	 * @param start the first position of the new string
	 * @param len the number of bytes of the new string
	 */
	public void set(byte[] utf8, int start, int len) {
		setCapacity(len, false);
		System.arraycopy(utf8, start, bytes, 0, len);
		this.length = len;
	}
	
	public void write(DataOutput out) throws IOException {
	    WritableUtils.writeVInt(out, length);
		out.write(bytes ,0 ,length);
	}

	public void readFields(DataInput in) throws IOException {
	    int newLength = WritableUtils.readVInt(in);
	    setCapacity(newLength, false);
		in.readFully(bytes ,0 ,newLength);
		length  = newLength;
		
		String string = new String(bytes);
		String[] strings = string.split(Constant.SEPARATE_SYMBOL);
		System.out.println("str1 " + string);
		id = Integer.parseInt(strings[0]);
		value1 = strings[1];
		value2 = strings[2];
	}
	
	public static ByteBuffer encode(String string)
		throws CharacterCodingException {
	    return encode(string, true);
	}
	
	public static ByteBuffer encode(String string, boolean replace)
	    throws CharacterCodingException {
	    CharsetEncoder encoder = ENCODER_FACTORY.get();
	    if (replace) {
	      encoder.onMalformedInput(CodingErrorAction.REPLACE);
	      encoder.onUnmappableCharacter(CodingErrorAction.REPLACE);
	    }
	    ByteBuffer bytes = 
	      encoder.encode(CharBuffer.wrap(string.toCharArray()));
	    if (replace) {
	      encoder.onMalformedInput(CodingErrorAction.REPORT);
	      encoder.onUnmappableCharacter(CodingErrorAction.REPORT);
	    }
	    return bytes;
	}
	
	private void setCapacity(int len, boolean keepData) {
	    if (bytes == null || bytes.length < len) {
	      byte[] newBytes = new byte[len];
	      if (bytes != null && keepData) {
	        System.arraycopy(bytes, 0, newBytes, 0, length);
	      }
	      bytes = newBytes;
	    }
	}

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getValue1() {
		return value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}

	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}

	public byte[] getBytes() {
		return bytes;
	}

	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
