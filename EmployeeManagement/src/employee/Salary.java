package employee;

/**
 * Salary
 */
public class Salary {

    public void calcSalary(int empId){
        Employee emp = getEmployee(empID); // retrive database object with given EmpID
        emp.setSalary ((emp.getAttendance *emp.getBasicPay)/ emp.totalDays);
    }
}
