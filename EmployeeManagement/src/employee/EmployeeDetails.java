package employee;
import java.util.*;
public class EmployeeDetails {	
	
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
		   Employee emp = new Employee(empName, empPhoneNumber,empDesignation,empGender);
           emp.setBasicPay(emp.getEmpDesignation());
//		   emp.idGen++;
//		   emp.setId(emp.idGen);
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
