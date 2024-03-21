import java.util.*;
public class Test16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter age");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter city");
		String city = sc.nextLine();
		
		System.out.println("Enter salary");
		double sal = sc.nextDouble();
		
		
		System.out.println("Name  :"+name);
		System.out.println("Age   :"+age);
		System.out.println("Salary:"+sal);
		System.out.println("City  :"+city);
	}

}
