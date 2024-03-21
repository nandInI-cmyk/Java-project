class Address {
	String city;
	String state;
	String pin;

	Address(String c, String s, String p) {
		this.city = c;
		this.state = s;
		this.pin = p;
	}

}

class Emp {
	int id;
	String name;
	Address obj;

	Emp(int i, String n, Address a) {
		this.id = i;
		this.name = n;
		this.obj = a;
	}

	public void getDetails() {
		System.out.println(
				"Id :" + id + " Name :" + name + " City :" + obj.city + " State :" + obj.state + " pin" + obj.pin);
	}
}

public class App25 {

	public static void main(String[] args) {
		Address a1 = new Address("jbp", "mp", "482001");

		Address a2 = new Address("lucknow", "up", "452006");

		Emp e1 = new Emp(1, "amit", a1);
		Emp e2 = new Emp(2, "ashish", a1);
		Emp e3 = new Emp(3, "nancy", a2);
		Emp e4 = new Emp(4, "rani", a2);
		Emp e5 = new Emp(5, "raja", a1);

		e1.getDetails();
		e2.getDetails();
		e3.getDetails();
		e4.getDetails();
		e5.getDetails();

	}

}
