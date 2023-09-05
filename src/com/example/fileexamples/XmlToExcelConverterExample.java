package com.example.fileexamples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XmlToExcelConverterExample {
    public static void main(String[] args) {
        String xmlFilePath = "C:\\Users\\Sujatha\\Documents\\library.xml";
        String excelFilePath = "C:\\Users\\Sujatha\\Documents\\outputLibrary.xlsx";
        convertXmlToExcel(xmlFilePath, excelFilePath);
    }

    public static void convertXmlToExcel(String xmlFilePath, String excelFilePath) {
        try {
        	//xml input file is represented as a file object using the provided file path
            File xmlFile = new File(xmlFilePath);
            //jaxbcontext is created by using Library.class
            JAXBContext jaxbContext = JAXBContext.newInstance(Library.class);
            //unmarshaller(read) xml data convert into java object
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            //xml data from the file is unmarshaller into a Library object
            Library library = (Library) jaxbUnmarshaller.unmarshal(xmlFile);
            //creat excel workbook and sheet

            Workbook workbook = new XSSFWorkbook();
            //a new sheet named "Books" is created within the workbook
            Sheet sheet = workbook.createSheet("Books");

            // Create column headers is created within the "Books" sheet
            Row headerRow = sheet.createRow(0); 
            //columns names are defined in an  string array
            String[] columnNames = {
                "Book Id", "Title", "Author", "Publication-year", "Genere",
                "Availability", "Status", "DueDate", "Borrower"
            };

            // Populate the header row with column names
            for (int i = 0; i < columnNames.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(columnNames[i]);
            }
            // a counter called rowIndex is initialized to 1

            int rowIndex = 1;
            // for each book in the library, a new row is created within the "Books" sheet to hold the books details

            for (LibraryId book : library.getBooks()) {
                Row row = sheet.createRow(rowIndex++);
                //create a row cells and set the from LibraryId 
                row.createCell(0).setCellValue(book.getId());
                row.createCell(1).setCellValue(book.getTitle());
                row.createCell(2).setCellValue(book.getAuthor());
                row.createCell(3).setCellValue(book.getPublicationYear());
                row.createCell(4).setCellValue(book.getGenre());

                // Check if availability information exists
                //the cell indicating availability status is set to "Available"
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
            try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
                workbook.write(outputStream);
                outputStream.close(); // Close the stream after writing
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("XML data converted to Excel successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}