package employee;

import java.sql.ResultSet;

/**
 * Salary
 */
public class Salary {

    public void calcSalary(int empId){
        try {
			Driver con = new Driver();
            Operations op = new Operations(con.getDatabaseConnection());
            double basicPay=op.getBasicPayTable(empId);
            double attendence=op.
            emp.setSalary ((emp.getAttendance *emp.getBasicPay)/ emp.totalDays);
            op.updateSalaryTable(empId, )
            
            con.close();
            
			// System.out.println("Employee added....");
		    } 
			catch (Exception e){		
				System.out.println("Error in connecting database.....");	
		    }
        
        
    }
}