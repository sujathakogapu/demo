
package com.example.fileexamples;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class EmployeeUnmarshalExample {
	public static void main(String[] args) {
		try {
			// xml -> java object (unmarshalling) -> read operation
			File xmlFile = new File("C:\\Users\\Sujatha\\Documents\\employees.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(XEmployee.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			XEmployee employeeDetails = (XEmployee) jaxbUnmarshaller.unmarshal(xmlFile);
			// Now you can access the Java objects
			for (XEmployeeDetail employees : employeeDetails.getEmployees()) {
				System.out.println("ID: " + employees.getId());
				System.out.println("FirstName: " + employees.getFirstName());
				System.out.println("LastName: " + employees.getLastName());
				System.out.println("Email: " + employees.getEmail());
				System.out.println("Department: " + employees.getDepartment());
				System.out.println("Position: " + employees.getPosition());
				System.out.println("Salary: " + employees.getSalary());
				System.out.println();
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
