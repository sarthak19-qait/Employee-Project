package employee;

import java.util.Scanner;

public class EmployeeAttendance {

     public void updateAttendance() {
    	 
    	 Scanner scan = new Scanner(System.in);
    	 int empId ;
    	 double empWorkingHours;
    	 System.out.println("Enter Employee ID");
    	 empId = scan.nextInt() ;
    	 System.out.println("Enter Working hours of Empl");
    	 empWorkingHours = scan.nextDouble();
    	 
    	 // Database .......   emp object ->>>>>>>>>>>>>>  att  
    	 
    	 if(empWorkingHours>=8) {
    		 // += 1
    	 }
    	 else if(empWorkingHours>=5) {
    		 // += 0.5
    	 }
    	 scan.close();
     }
     public void viewAttendance() {
    	 Scanner scan = new Scanner(System.in);
    	 int empId ;
    	 System.out.println("Enter Employee ID");
    	 empId = scan.nextInt() ;
    	 scan.close();
     }
	
}
