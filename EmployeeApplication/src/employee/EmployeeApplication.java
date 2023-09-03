/*
 * Title- Employee Management Application

 * Author - Sakthipratheesh S
 * Created at - 22/Dec/2021
 * Reviewed by - Akshaya
 * Reviewed at - 23/Dec/2021
 */
package employee;

import java.text.ParseException;

public class EmployeeApplication extends Employee {

public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.setEmployeeDetails();
		employee.getEmployeeDetails();
		/*try {
			employee.checkDate("29/12/2021");
			employee.checkDate("27/12/2021");
			employee.checkDate("28/12/2021");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
	}

}
