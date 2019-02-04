package employee;

import java.sql.Connection;
import java.sql.SQLException;

public class Database {
 public static void main(String args[]) throws ClassNotFoundException, SQLException {
	
	Driver driver = new Driver();
	Connection con = driver.getDatabaseConnection();
	Operations operation = new Operations(con);
		 //operation.readTable();
		 
//	 	int empid = operation.addEmployeeTable("Mukesh Sharma", "9876543210", "CEO", "male", 10000, 8, 500);
//	 	System.out.println("employee created id: "+ empid);
//	 int x = operation.updateAttendanceTable(11, 40);
//	 System.out.println(x);
//	 System.out.println(operation.updateSalaryTable(10,50000));
	 
 }
}
