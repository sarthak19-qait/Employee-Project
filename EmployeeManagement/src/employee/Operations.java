
package employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Operations {
	
	private Connection con;
	private Statement statement = null;
	private ResultSet resultSet = null;
	private String query = "";
 
	public Operations(Connection con) {
		this.con = con;
	}
	 
	public void readTable() {
		try {
			System.out.println("Reading Table Data");
			statement = con.createStatement();
			resultSet = statement.executeQuery("select * from employee");
			while (resultSet.next()) {
				String empName = resultSet.getString(1);
				int empid = resultSet.getInt(2);
				String phoneNo = resultSet.getString(3);
				String empDesign = resultSet.getString(4);
				String gender = resultSet.getString(5);
				Float salary = resultSet.getFloat(6);
				Float workHour = resultSet.getFloat(7);
				Float basicPay = resultSet.getFloat(8);
				
				System.out.println("empName="+empName+" empid="+String.valueOf(empid)+" phoneNo="+String.valueOf(phoneNo)+" empDesign="+String.valueOf(empDesign)+
						" gender="+String.valueOf(gender)+" salary="+String.valueOf(salary)+" workHour="+String.valueOf(workHour)+" basicPay="+String.valueOf(basicPay) );
				
			} 
		} catch (SQLException e) {
			// TODO: handle exception
		}
		
	}
	
		public int addEmployeeTable(String empName,
				 String phoneNo, String empDesign, String gender, float salary,  float workHour, float basicPay) {
			try {
				query = "insert into employee (empName, phoneNo, empDesign, gender, salary, workHour, basicPay) values (?, ?, ?, ?, ?, ?, ?)";
				
				PreparedStatement insertStatement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
				
				insertStatement.setString(1, empName);	
				insertStatement.setString(2, phoneNo);
				insertStatement.setString(3, empDesign);
				insertStatement.setString(4, gender);
				insertStatement.setFloat(5, salary);
				insertStatement.setFloat(6, workHour);
				insertStatement.setFloat(7, basicPay);
				
				insertStatement.executeUpdate();
				resultSet = insertStatement.getGeneratedKeys();
				
				if(resultSet != null && resultSet.next()){
	                return resultSet.getInt(1);
	            }
				System.out.println("inserted");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 0;
		}
		
		public int updateAttendanceTable(int empid, float workHour) {
			try {
				statement = con.createStatement();
				query = "update employee set workHour=" + workHour + "where empid=" + empid;
				int row;
				row = statement.executeUpdate(query);
				System.out.println("Attendance Updated...");
				return row;			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 0;
		}
	
	public float viewAttendanceTable(int empid) {
		float workHour = 0;
		try {
			statement = con.createStatement();
			query = "select workHour from employee where empid=" + empid;
			resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				workHour = resultSet.getFloat(1);
			}
			return workHour;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return workHour;
	}
	
	public float getBasicPayTable(int empid) {
		float basicPay = 0;
		try {
			statement = con.createStatement();
			query = "select basicPay from employee where empid=" + empid;
			resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				basicPay = resultSet.getFloat(1);
			}
			return basicPay;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return basicPay;
	}
	
	public int updateSalaryTable(int empid, float salary) {
		try {
			statement = con.createStatement();
			query = "update employee set salary=" + salary + "where empid=" + empid;
			int row;
			row = statement.executeUpdate(query);
			System.out.println("Salary Updated...");
			return row;			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	public ResultSet getEmployeeFromTable(int id) throws SQLException {

			System.out.println("Reading Table Data");
			statement = con.createStatement();
			resultSet = statement.executeQuery("select * from employee where empid="+ id);
			
				
		return resultSet;
		
	}
	
	
}