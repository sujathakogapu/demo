package com.example.fileexamples;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileExample {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Sujatha\\Documents\\expenses.xlsx";
       readExcel(filePath);
      //excelWrite(filePath, "2023-07-21", "Tea", "Fee","$2");
       //findRows(String searchText, int columnNo);
     //deleteRows(String searchText, int columnNo);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a search text: ");
        String searchText = scanner.nextLine();

        int columnNo = 1; // Column index (0-based) to search in

        List<Integer> matchingRowNumbers = findRows(filePath, searchText, columnNo);

        System.out.println("Number of matching rows: " + matchingRowNumbers.size());

        if (matchingRowNumbers.isEmpty()) {
            System.out.println("No matching rows found.");
        } else {
            System.out.print("Confirm deletion (yes/no): ");
            String confirmation = scanner.nextLine(); // Read user's confirmation
            if (confirmation.equalsIgnoreCase("yes")) {
                deleteRows(filePath, matchingRowNumbers);
                System.out.println("Rows deleted successfully.");
            }
        }

        scanner.close();
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
    						System.out.print(cell.getStringCellValue()+" | ");
    						break;
    					case Cell.CELL_TYPE_NUMERIC:
    						if (DateUtil.isCellDateFormatted(cell)) {
    							SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    							System.out.print(dateFormat.format(cell.getDateCellValue()) + " | ");
    						} else {
    							System.out.print(cell.getNumericCellValue() + " | ");
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
    	public static void excelWrite(String filePath, String date, String category, String description, String amount) {
    		try (FileInputStream fis = new FileInputStream(new File(filePath)); XSSFWorkbook wb = new XSSFWorkbook(fis)) { // Create a new Excel workbook
    			Sheet sheet = wb.getSheetAt(0); // Create a new sheet

    			
    			Row dataRow = sheet.createRow(sheet.getLastRowNum()+1);
    			dataRow.createCell(0).setCellValue(date);
    			dataRow.createCell(1).setCellValue(category);
    			dataRow.createCell(2).setCellValue(description);
    			dataRow.createCell(3).setCellValue(amount);

    			try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
    				wb.write(fileOut); // Write the workbook content to the file
    			}

    			System.out.println("Excel file created successfully.");
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}
    	public static List<Integer> findRows(String filePath, String searchText, int columnNo) {
            List<Integer> matchingRowNumbers = new ArrayList<>();

            try (FileInputStream fis = new FileInputStream(filePath);
                 Workbook workbook = new XSSFWorkbook(fis)) {

                Sheet sheet = workbook.getSheetAt(0);
                Iterator<Row> rowIterator = sheet.iterator();

                int currentRow = 0;
                while (rowIterator.hasNext()) {
                    Row row = rowIterator.next();
                    Cell cell = row.getCell(columnNo);
                    if (cell != null) {
                        String cellValue = cell.getStringCellValue();
                        if (cellValue.contains(searchText)) {
                            matchingRowNumbers.add(currentRow);
                        }
                    }
                    currentRow++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            return matchingRowNumbers;
        }

        public static void deleteRows(String filePath, List<Integer> rowNumbers) {
            try (FileInputStream fis = new FileInputStream(filePath);
                 Workbook workbook = new XSSFWorkbook(fis)) {

                Sheet sheet = workbook.getSheetAt(0);
                for (Integer rowNumber : rowNumbers) {
                    Row row = sheet.getRow(rowNumber);
                    if (row != null) {
                        sheet.removeRow(row);
                    }
                }

                try (FileOutputStream fos = new FileOutputStream(filePath)) {
                    workbook.write(fos);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }