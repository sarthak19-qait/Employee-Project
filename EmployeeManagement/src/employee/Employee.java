package employee;

import java.sql.ResultSet;

public class Employee {
	private String empName;
	private int empId ;
	private String phoneNumber;
	private String empDesignation;
	private String gender;
	private double salary;
	private double workHour;
	private double attendance;
	private double basicPay;
    public static int totalDays=30; 
	public Employee(String empName,String  phoneNumber,String empDesignation,String gender) {
		super();
		this.empName = empName;
		this.phoneNumber = phoneNumber;
		this.empDesignation = empDesignation;
		this.gender = gender;
		this.salary = salary;
		this.workHour = 0;
		this.attendance = 0.0;
		
	}

	public static void printEmp(ResultSet resu)
	{
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
	public double getbasicPay() {
		return basicPay;
	}

	public void setBasicPay(String empDesignation) {
		   if(empDesignation.equalsIgnoreCase("Software Trainee")) {
		       basicPay = 12000 ;
		     }
		   else if(empDesignation.equalsIgnoreCase("Software Developer")) {
		       basicPay = 20000 ;
		     }
		   else if(empDesignation.equalsIgnoreCase("Project Manager")) {
		       basicPay = 30000 ;
		     }
		   else {
			   basicPay=0;
		   }
	}
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getWorkHour() {
		return workHour;
	}

	public void setWorkHour(double workHour) {
		this.workHour = workHour;
	}

	public double getAttendance() {
		return attendance;
	}

	public void setAttendance(double attendance) {
		this.attendance = attendance;
	}
	


}
