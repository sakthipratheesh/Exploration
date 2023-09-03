/*
 * Title- Employee Management Application

 * Author - Sakthipratheesh S
 * Created at - 22/Dec/2021
 * Reviewed by - Akshaya
 * Reviewed at - 23/Dec/2021
 */
package employee;


import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;


public class Employee implements EmployeeFunction {
	
	ArrayList<EmployeeData>employeeList=new ArrayList<>();
	
	Scanner userInput = new Scanner(System.in);
	private String employeeName,employeeEmail,employeeDob,employeeDoj,employeeMobile,idNumber;
	private String employeeId="ACE";
	private String dateRegEx=("^[0-9{2}]+[-|/]+[0-9{2}]+[-|/]+[0-9{4}+]+$");
   
	public void setEmployeeDetails() {
		System.out.println(".................Employee Registration Application..............");
		while(true) {
			System.out.println("Enter the Name of the Employee : ");
			employeeName = userInput.nextLine();
			if(employeeName.matches("[a-zA-Z ]+")) {
				break;
			}else {
				System.out.println("Invalid Name. \n\t Name must contain only aplhabets and should not contain any special characters or numerical values! \n\t Kindly check and re enter");
			}
		}

		while(true) {
			System.out.println("Enter the Employee Email ID");
			employeeEmail = userInput.nextLine();
			if(employeeEmail.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$")) {
				break;
			}else {
				System.out.println("Invalid Employee Email \n\t Employee Email should end with '.com' and after '@' it should only contain characters! \n\t Please check and enter in correct format");
			}
		}

		while(true) {
			System.out.println("Enter Mobile Number  : ");
			employeeMobile = userInput.nextLine();
			if(employeeMobile.matches("^[6-9][0-9]{9}")) {
				break;
			}else {
				System.out.println("Invalid Employee Mobile Number \n\t Employee Mobile Number should start from '6,7,8,9' and only numerics allowed and should be 10 digits! \n\t Please check and enter in correct format");
			}
		}

		
		while(true) {
			System.out.println("Enter DOB in the format dd/mm/yyyy :");
			employeeDob = userInput.nextLine();

			if(employeeDob.matches(dateRegEx)) {
				try {
					if(stringToDate(employeeDob)) {
						break;
					}else {
						System.exit(0);
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
			}else {
				System.out.println("Invalid Employee Date of Brith \n\t Employee Date of Brith  should be in DD-MM-YYYY format! \n\t Please check and enter in correct format");
			}
		}
		while(true) {
			System.out.println("Enter DOJ in the format dd/mm/yyyy : ");
			employeeDoj = userInput.nextLine();
		  if(employeeDoj.matches(dateRegEx)) {
		        try {
					if(checkDate(employeeDoj)) {
						
						break;
					}else {
						System.out.println("Employee Date of joining  is not valid - It should not be given in future date");
						break;
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}else {
				System.out.println("Invalid Employee Date of Joining \n\t Employee Date of Joining  should be in DD-MM-YYYY format! \n\t Please check and enter in correct format");
			}
		}
		
		
		while(true) {
			System.out.println("Enter the Employee ID");
			idNumber = userInput.nextLine();
			if(idNumber.matches("[0-9]{4}")) {
				employeeId+=idNumber;
				break;
			}else {
				System.out.println("Invalid Employee ID \n\t Employee ID must not contain more than 4 digits or Starting number should be from 1-9 ! \n\t Please check and enter in correct format");
			}
		}
		employeeList.add(new EmployeeData(employeeName,employeeId,employeeMobile,employeeEmail,employeeDob,employeeDoj));


	}

	public void getEmployeeDetails() {
		System.out.println("\n\t------Employee Details------\t");
		for(EmployeeData emp:employeeList) {
		System.out.println("Employee Name:\t"+emp.getEmployeeName()+
		"\nEmployee Ace Number:\t"+emp.getEmployeeId()+
		"\nEmployee Mobile Number:\t"+emp.getEmployeeMobile()+
		"\nEmployee Email ID:\t"+emp.getEmployeeEmail()+
		"\nEmployee Date of Birth:\t"+emp.getEmployeeDob()+
		"\nEmployee Date of Join:\t"+emp.getEmployeeDoj());
		}
	}
	
	   public static boolean stringToDate(String employeeDob) throws ParseException{
		    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date = formatter.parse(employeeDob);
			Instant instant = date.toInstant();
			ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
			LocalDate givenDate = zone.toLocalDate();
			Period period = Period.between(givenDate, LocalDate.now());
			int age=period.getYears();
	        if(age<=18||age>=60) {
	        	System.out.println("Employee Age is not valid - It should be greater than 18 and lesser than 60");
	        	return false;
	        }else {
	        	return true;
	        }
		   }
	   public static boolean checkDate(String employeeDoj)throws ParseException {
		    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date = formatter.parse(employeeDoj);
			Instant instant = date.toInstant();
			ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
			LocalDate givenDate = zone.toLocalDate(); 
		    LocalDate dateToday = LocalDate.now();  
		    LocalDate tomorrow = dateToday.plusDays(1);   
			Period period = Period.between(givenDate, tomorrow);
			int difference=period.getDays();
			
		   if(difference<=0) {
			   System.out.println("Employee Doj is not valid - It should be not be future date");
			   return true;
		   }else {
			   return false;
		   } 
	   }
}


/*public void getEmployeeDetails() {
	System.out.println("\t\t--------Employee Details-------- ");
	System.out.println("Employee Name\t" + employeeName);
	System.out.println("Employee Mail\t" + employeeEmail);
	System.out.println("Employee Mobile\t" + employeeMobile);
	System.out.println("Employee ID  \t" + employeeId);
	System.out.println("Employee DOB \t" + employeeDob);
	System.out.println("Employee DOJ \t" + employeeDoj);

	}*/
