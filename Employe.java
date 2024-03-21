
public class Employe {
//Date member
	String employeName;
	String employeAddress;
	//constructor
	public Employe() // default const^
	{ 
		// var/obj--> assig^
		employeName="abc";
		employeAddress="jbp";
				
	}
	
	public Employe(String a, String n)
	{employeName=a;
	employeAddress=n; // initilization happens from right to left
	}
	
	// datamethods
	public void getDetails()
	{ System.out.println("Name of the employee:"+ employeName);
	System.out.println("address of the employee:"+ employeAddress);
	}
	public static void main(String args[])
	{ 
		Employe e1 = new Employe();
		e1.getDetails();
		
		Employe e2 = new Employe("sam","pune");
		e2.getDetails();
	}
}






/*
 * public class Employee {
 * 
 * //Data member String employeeName; String employeeAddress;
 * 
 * // constructor
 * 
 * public Employee()// { // var/obj--> assignment employeeName="abc";
 * employeeAddress="jbp"; }
 * 
 * public Employee(String n,String a) { employeeName=n; employeeAddress=a; }
 * 
 * // data methods public void getDetails() {
 * System.out.println("Name of an employee :"+employeeName);
 * System.out.println("Address of an employee :"+employeeAddress); }
 * 
 * public static void main(String args[]) { Employee e1 = new Employee();
 * e1.getDetails();
 * 
 * Employee e2 = new Employee("sam","pune"); e2.getDetails();
 * 
 * }
 * 
 * }
 */
