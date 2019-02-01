package employee;

public class Menu {
	public void showMenu() {
    	System.out.println("Press 1 to add Employee");
    	System.out.println("Press 2 to search Employee");
    	System.out.println("Press 3 to give Attendence");
    	System.out.println("Press 4 to view Attendence");
    	System.out.println("Press any other key to exit...");
    }
   
   
   public void option(int ch) {
	   EmployeeDetails empDetails = new EmployeeDetails();
	   EmployeeAttendance empAttend = new EmployeeAttendance();
	   switch(ch) {
	   case 1 :
		   
		   empDetails.addEmployee();
	           
		   break;
	   case 2 :
		   empDetails.searchEmployee();
		   break;
	   case 3:
		   empAttend.updateAttendance();
		   break;
	   case 4:
		   empAttend.viewAttendance();
		   break;
	   default:System.exit(0);	
	   }
   }
}
