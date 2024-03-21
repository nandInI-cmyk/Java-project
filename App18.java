
public class App18 {

	public static void methodOne(int... x)
	{
		System.out.println(x);
	}
	
	public static void sum(int... x)
	{ 
		int total=0;
		for(int i=0;i<x.length;i++)
		{
			total = total+x[i];
		}
		System.out.println("Sum = " + total);
	}
	public static void main(String[] args) {
		methodOne(5);
		methodOne();
		methodOne(5,10);
		sum();sum(10);sum(10,20);sum(10,20,30,40);
	}

}
