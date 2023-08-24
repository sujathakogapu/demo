package com.example.fileexamples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConvertXmlFileToExcelFile {
    public static void main(String[] args) {
        String xmlFilePath = "C:\\Users\\Sujatha\\Documents\\library.xml";
        String excelFilePath = "C:\\Users\\Sujatha\\Documents\\outputLibrary.xlsx";
        convertXmlToExcel(xmlFilePath, excelFilePath);
    }

    public static void convertXmlToExcel(String xmlFilePath, String excelFilePath) {
        try {
            File xmlFile = new File(xmlFilePath);
            JAXBContext jaxbContext = JAXBContext.newInstance(Library.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Library library = (Library) jaxbUnmarshaller.unmarshal(xmlFile);

            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Books");

            // Create column headers
            Row headerRow = sheet.createRow(0);
            String[] columnNames = {
                "Book Id", "Title", "Author", "Publication-year", "Genere", "Availability",
                "Status", "DueDate", "Borrower"
            };

            // Populate the header row with column names
            for (int i = 0; i < columnNames.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(columnNames[i]);
            }

            int rowIndex = 1;

            for (LibraryId book : library.getBooks()) {
                Row row = sheet.createRow(rowIndex++);
                row.createCell(0).setCellValue(book.getId());
                row.createCell(1).setCellValue(book.getTitle());
                row.createCell(2).setCellValue(book.getAuthor());
                row.createCell(3).setCellValue(book.getPublicationYear());
                row.createCell(4).setCellValue(book.getGenre());

                // Check if availability information exists
                LibraryAvailability availability = book.getAvailability();
                Cell availabilityCell = row.createCell(5);
                if (availability != null) {
                    availabilityCell.setCellValue("Available");
                    row.createCell(6).setCellValue(availability.getStatus());
                    row.createCell(7).setCellValue(availability.getDueDate());
                    row.createCell(8).setCellValue(availability.getBorrower());
                } else {
                    availabilityCell.setCellValue("Not Available");
                }
            }

            try (FileOutputStream outputStream = new FileOutputStream(excelFilePath, true)) {
                workbook.write(outputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("XML data converted to Excel successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}