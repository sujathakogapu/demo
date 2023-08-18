package com.example.fileexamples;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileExample {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Sujatha\\Documents\\expenses.xlsx";
        //readExcel(filePath);
        excelWrite(filePath, "2023-07-20", "Academy", "Fee",150);
    }

    	public static void readExcel(String filePath) {
    		try (FileInputStream fis = new FileInputStream(new File(filePath)); XSSFWorkbook wb = new XSSFWorkbook(fis)) {
    			XSSFSheet sheet = wb.getSheetAt(0);
    			Iterator<Row> itr = sheet.iterator();
    			while (itr.hasNext()) {
    				Row row = itr.next();
    				Iterator<Cell> cellIterator = row.cellIterator();
    				while (cellIterator.hasNext()) {
    					Cell cell = cellIterator.next();
    					switch (cell.getCellType()) {
    					case Cell.CELL_TYPE_STRING:
    						System.out.print(cell.getStringCellValue() + "\t\t");
    						break;
    					case Cell.CELL_TYPE_NUMERIC:
    						if (DateUtil.isCellDateFormatted(cell)) {
    							SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    							System.out.print(dateFormat.format(cell.getDateCellValue()) + "\t\t");
    						} else {
    							System.out.print(cell.getNumericCellValue() + "\t\t");
    						}
    						break;

    					default:
    					}
    				}
    				System.out.println("");
    			}
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}
    	public static void excelWrite(String filePath, String date, String category, String description, int amount) {
    		try (Workbook workbook = new XSSFWorkbook()) { // Create a new Excel workbook
    			Sheet sheet = workbook.createSheet("Sheet1"); // Create a new sheet

    			Row headerRow = sheet.createRow(0);
    			headerRow.createCell(0).setCellValue("Date");
    			headerRow.createCell(1).setCellValue("Category");
    			headerRow.createCell(2).setCellValue("Description");
    			headerRow.createCell(3).setCellValue("Amount");

    			Row dataRow = sheet.createRow(1);
    			dataRow.createCell(0).setCellValue(date);
    			dataRow.createCell(1).setCellValue(category);
    			dataRow.createCell(2).setCellValue(description);
    			dataRow.createCell(3).setCellValue(amount);

    			try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
    				workbook.write(fileOut); // Write the workbook content to the file
    			}

    			System.out.println("Excel file created successfully.");
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}
        
}
