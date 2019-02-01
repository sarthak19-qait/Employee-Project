package employee;

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
