package employee;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
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
		try {
			
			Driver con = new Driver();
			Operations op = new Operations(con.getDatabaseConnection());
			ResultSet rs =  op.getEmployeeFromTable(empId);
			Employee.printEmp(rs);
			con.close();
			System.out.println("Employee added....");
		    } 
			catch (Exception e){		
				System.out.println("Error in connecting database.....");	
		    }
		
		// Database Work......................................................................
		
		sc.close();
		
	}
}
