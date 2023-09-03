 /* Title- Employee Management Application

 * Author - Sakthipratheesh S
 * Created at - 22/Dec/2021
 * Reviewed by - Akshaya
 * Reviewed at - 23/Dec/2021
 */
 
package employee;

public class EmployeeData {
	private String employeeName,employeeEmail,employeeDob,employeeDoj,employeeMobile,employeeId;
	
	public EmployeeData(String employeeName, String employeeId, String employeeMobile, String employeeEmail, String employeeDob, String employeeDoj) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeEmail = employeeEmail;
		this.employeeMobile = employeeMobile;
		this.employeeDob = employeeDob;
		this.employeeDoj = employeeDoj;
		
		
	}
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeeMobile() {
		return employeeMobile;
	}

	public void setEmployeeMobile(String employeeMobile) {
		this.employeeMobile = employeeMobile;
	}
	public String getEmployeeDob() {
		return employeeDob;
	}

	public void setEmployeeDob(String employeeDob) {
		this.employeeDob = employeeDob;
	}

	public String getEmployeeDoj() {
		return employeeDoj;
	}

	public void setEmployeeDoj(String employeeDoj) {
		this.employeeDoj = employeeDoj;
	}



}
