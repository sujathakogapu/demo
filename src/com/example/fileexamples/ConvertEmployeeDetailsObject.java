package com.example.fileexamples;

	import java.util.ArrayList;
	import java.util.List;

	public class ConvertEmployeeDetailsObject {
		private int id;
		private String firstName;
		private String lastName;
		private String position;
		private String department;
		private int salary;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getPosition() {
			return position;
		}

		public void setPosition(String position) {
			this.position = position;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}
		public static void main(String[] args) {
			ConvertEmployeeDetailsObject obj=new ConvertEmployeeDetailsObject();
			obj.setId(1);
			obj.setFirstName("John");
			obj.setLastName("Doe");
			obj.setPosition("SoftwareEngineer");
			obj.setSalary(75000);
			obj.setDepartment("Engineering");
			ConvertEmployeeDetailsObject obj1=new ConvertEmployeeDetailsObject();
			obj1.setId(2);
			obj.setFirstName("Jane");
			obj.setLastName("Smith");
			obj.setPosition("Marketing Specialist");
			obj.setSalary(60000);
			obj.setDepartment("Marketing");
			ConvertEmployeeDetailsObject obj2=new ConvertEmployeeDetailsObject();
			obj1.setId(3);
			obj.setFirstName("David");
			obj.setLastName("Johnson");
			obj.setPosition("Financial Analyst");
			obj.setSalary(68000);
			obj.setDepartment("Finance");
			ConvertEmployeeDetailsObject obj3=new ConvertEmployeeDetailsObject();
			obj1.setId(4);
			obj.setFirstName("Emily");
			obj.setLastName("Brown");
			obj.setPosition("Human Resources Manager");
			obj.setSalary(80000);
			obj.setDepartment("Human Resources");
			ConvertEmployeeDetailsObject obj4=new ConvertEmployeeDetailsObject();
			obj1.setId(5);
			obj.setFirstName("Michael");
			obj.setLastName("Williams");
			obj.setPosition("Data Scientist");
			obj.setSalary(82000);
			obj.setDepartment("Data Science");
			ConvertEmployeeDetailsObject obj5=new ConvertEmployeeDetailsObject();
			obj1.setId(6);
			obj.setFirstName("Olivia");
			obj.setLastName("Martinez");
			obj.setPosition("Sales Representative");
			obj.setSalary(55000);
			obj.setDepartment("Sales");
			ConvertEmployeeDetailsObject obj6=new ConvertEmployeeDetailsObject();
			obj1.setId(7);
			obj.setFirstName("William");
			obj.setLastName("Jones");
			obj.setPosition("Product Manager");
			obj.setSalary(90000);
			obj.setDepartment("Product Management");
			ConvertEmployeeDetailsObject obj7=new ConvertEmployeeDetailsObject();
			obj1.setId(8);
			obj.setFirstName("Sophia");
			obj.setLastName("Anderson");
			obj.setPosition("Quality Assurance Engineer");
			obj.setSalary(70000);
			obj.setDepartment("Engineering");
			ConvertEmployeeDetailsObject obj8=new ConvertEmployeeDetailsObject();
			obj1.setId(9);
			obj.setFirstName("James");
			obj.setLastName("Taylor");
			obj.setPosition("Customer Support Specialist");
			obj.setSalary(58000);
			obj.setDepartment("Customer Support");
			ConvertEmployeeDetailsObject obj9=new ConvertEmployeeDetailsObject();
			obj1.setId(10);
			obj.setFirstName("Ava");
			obj.setLastName("Brown");
			obj.setPosition("Graphic Designer");
			obj.setSalary(62000);
			obj.setDepartment("Creative");
			List<ConvertEmployeeDetailsObject>employees=new ArrayList<ConvertEmployeeDetailsObject>();
			employees.add(obj);
			employees.add(obj1);
			employees.add(obj2);
			employees.add(obj3);
			employees.add(obj4);
			employees.add(obj5);
			employees.add(obj6);
			employees.add(obj7);
			employees.add(obj8);
			employees.add(obj9);
			
			
			
		}
		
	    
	    

	}

