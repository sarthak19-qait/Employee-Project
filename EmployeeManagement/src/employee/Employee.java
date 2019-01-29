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
    
	public Employee(String empName,String  phoneNumber,String empDesignation,String gender,double salary) {
		super();
		this.empName = empName;
		this.phoneNumber = phoneNumber;
		this.empDesignation = empDesignation;
		this.gender = gender;
		this.salary = salary;
		this.workHour = 0;
		this.attendance = 0.0;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpId() {
		return empId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public String getGender() {
		return gender;
	}
	public double getSalary() {
		return salary;
	}
	public double getWorkHour() {
		return workHour;
	}
	

}
