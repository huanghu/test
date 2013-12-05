package com.springMVC.download;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownLoad {
	public void downloadExcel(HttpServletResponse response ,HttpServletRequest request) {
		try {
			response.setContentType("text/html;charset=UTF-8");  
			request.setCharacterEncoding("UTF-8");
			BufferedInputStream bis = null;  
	        BufferedOutputStream bos = null;  
	        
	        //下载文件的路径
	        String downLoadPath = "";
	        long fileLength = new File(downLoadPath).length();
	        //下载的文件在下载框中的名称
	        String outputExcelName = "main_data.xls";
	        
	        response.setContentType("application/octet-stream; charset=UTF-8");  
	        response.setHeader("Content-disposition", "attachment; filename=" + new String(outputExcelName.getBytes("utf-8"), "ISO8859-1"));  
	        response.setHeader("Content-Length", String.valueOf(fileLength));  

	        bis = new BufferedInputStream(new FileInputStream(downLoadPath));  
	        bos = new BufferedOutputStream(response.getOutputStream());  
	        byte[] buff = new byte[2048];  
	        int bytesRead;  
	        while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {  
	        	bos.write(buff, 0, bytesRead);  
	        }  
	        bis.close();  
	        bos.close(); 
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
