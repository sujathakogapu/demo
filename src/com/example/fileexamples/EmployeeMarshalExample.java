
	package com.example.fileexamples;
	import java.io.FileReader;
	import java.io.FileWriter;
	import javax.xml.bind.JAXBContext;
	import javax.xml.bind.Marshaller;
	import javax.xml.bind.Unmarshaller;

	public class EmployeeMarshalExample {
		 public static void main(String[] args) {
		        try {
		            JAXBContext context = JAXBContext.newInstance(XEmployee.class);
		            Unmarshaller unmarshaller = context.createUnmarshaller();
		            XEmployee employeeDetails = ( XEmployee) unmarshaller.unmarshal(new FileReader("C:\\Users\\Sujatha\\Documents\\employees.xml"));

		            XEmployeeDetail newEmp = new XEmployeeDetail();
		            newEmp.setId(110);
		            newEmp.setFirstName("sujatha");
		            newEmp.setLastName("kogapu");
		            //newEmp.setEmail("ksuji1422gmail.com");
		            newEmp.setDepartment("coding");
		            newEmp.setPosition("student");
		            newEmp.setSalary(10000);
		            

		            employeeDetails.addEmployee(newEmp);

		            Marshaller marshaller = context.createMarshaller();
		            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		            marshaller.marshal(employeeDetails, new FileWriter("C:\\Users\\Sujatha\\Documents\\employees.xml"));

		            System.out.println("New employee added and XML updated.");
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }

	}

