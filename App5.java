
public class App5 {

	int num1;
	int num2;
	// i/p
	// process
	// o/p

	public App5() // this isn't a default constructor. its a zero constructor made by us.
	{
		num1 = 0;
		num2 = 0;  // data members
	}

	public App5(int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}
	public void setValues(int n1, int n2)
	{
		num1=n1;
		num2=n2;
	}

	public void addition() {
		System.out.println("addition   " + (num1 + num2));
	}

	public void multiplication() {
		System.out.println("multiplication   " + (num1 * num2));
	}

	public void substraction() {
		System.out.println("substraction  " + (num1 - num2));
	}

	public void division() {
		System.out.println("division   " + (num1 / num2));
	}

	public void remainder() {
		System.out.println("modulus  " + (num1 % num2));
	}

	public static void main(String[] args) {
		App5 obj = new App5();// zero constructor
		obj.setValues(5,8);
		obj.addition();
		obj.substraction();
		obj.division();
		obj.remainder();
		obj.multiplication();
	}
}

