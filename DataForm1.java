
class Addresse {
	String city, state, zip;

	Addresse(String c, String s, String z) {
		this.city = c;
		this.state = s;
		this.zip = z;
	}
}

class EmployeeEta {
	int id;
	String name;
	Addresse ad; // object of Address class

	public EmployeeEta(int i, String n, Addresse u) {
		this.id = i;
		this.name = n;
		this.ad = u;
	}

	public void getDetails() {
		System.out.println("===================");
		System.out.println(" Employee ID: " + id);
		System.out.println(" Employee name: " + name);
		System.out.println(" Employee city: " + ad.city);
		System.out.println(" Employee state: " + ad.state);
		System.out.println(" Employee zipcode: " + ad.zip);
	}
}

public class DataForm1 // extends EmployeeEta
{	/*
	 * public DataForm1(int i, String n, Addresse u) { super(i, n, u); }
	 */

	
	EmployeeEta eta[];
	public static void main(String[] args) {

		Addresse a1 = new Addresse("jbp", "mp", "482001");
		Addresse a2 = new Addresse("bpl", "mp", "452601");

		 EmployeeEta eta[] = { new EmployeeEta(1, "ran", a1), new EmployeeEta(2, "jay", a2),
				new EmployeeEta(3, "any", a1), new EmployeeEta(4, "eeni", a2), new EmployeeEta(5, "ryan", a1), new EmployeeEta(6, "ryan", a2)};

		for (EmployeeEta empl : eta) {
			empl.getDetails();
			System.out.println(); 
	}
}
}
