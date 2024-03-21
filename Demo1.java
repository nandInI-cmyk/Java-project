
public class Demo1 {

	public static void main(String[] args) {
		int x,y;
		try {
			x = 0;
			y = 10/x;
			System.out.println("Now what?");
			
		}
		catch (ArithmeticException e) {
			
			System.out.println("Division by zero");
		}
		System.out.println("I'M BACK BITCHES!");

	}

}
