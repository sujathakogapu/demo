package com.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileFindAndDelete {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Sujatha\\Documents\\expenses.xlsx";
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