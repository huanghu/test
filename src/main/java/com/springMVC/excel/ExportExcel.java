package com.springMVC.excel;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

/**
 * 生成和下载 excel 实现
 * @author huanghu
 * @date 2013-11-20
 * @param <T>
 */
public class ExportExcel extends AbstractExcelView{
	@Override
	protected void buildExcelDocument(Map<String, Object> model,
			HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		HSSFSheet sheet = workbook.createSheet();
		sheet.setDefaultColumnWidth(12);
		
		HSSFCell cell = getCell(sheet, 0, 0);
		setText(cell, "Spring Excel test");
		
//		HSSFCellStyle dateStyle = workbook.createCellStyle();
		cell = getCell(sheet, 1, 0);
		cell.setCellValue("日期：2013-11-20");
		
		getCell(sheet, 2, 0).setCellValue("测试1");
		getCell(sheet, 2, 1).setCellValue("测试2");
		
		HSSFRow sheetRow = sheet.createRow(3);
		for (int i = 0; i < 10; i++) {
			sheetRow.createCell(i).setCellValue(i * 10);
		}
	}

}