package employee;
import java.util.*;
public class EmployeeDetails {
	
	private double setSalary(String empDesignation) {
		double salary = 0 ;
	   if(empDesignation.equalsIgnoreCase("Software Trainee")) {
	       salary = 12000 ;
	     }
	   else if(empDesignation.equalsIgnoreCase("Software Developer")) {
	       salary = 20000 ;
	     }
	   else if(empDesignation.equalsIgnoreCase("Project Manager")) {
	       salary = 30000 ;
	     }
	  return salary;
	}	
	public void addEmployee() {
		   Scanner sc = new Scanner(System.in);
		   String empName = null , empGender = null , empPhoneNumber = null , empDesignation = null;
		   System.out.println("Enter the Employee Name: ");
		   empName = sc.next();
		   System.out.println("Enter the Employee Gender: ");
		   empGender = sc.next();
		   System.out.println("Enter the Employee Phone Number: ");
		   empPhoneNumber = sc.next();
		   System.out.println("Enter the Employee Designation: ");
		   empDesignation = sc.next() ;
		   double salary = setSalary(empDesignation);
		   
		   Employee emp = new Employee(empName, empPhoneNumber,empDesignation,empGender, salary);

		   
		   // database updation .................... 
		   sc.close();
		   
	   }
	
	public void searchEmployee() {
		
		
		Scanner sc = new Scanner(System.in);
		int empId ;
		System.out.println("Enter Employee ID");
		empId = sc.nextInt() ;
		// Database Work......................................................................
		sc.close();
		
	}
}
