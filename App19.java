
public class App19 {
	public static void methodOne(int[]...x)
	{
		for (int[] a:x)
		{
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
		}
	}

	public static void main(String[] args) {
		
		int[] l= {10,20,30};
		int[] m= {40,50};
		methodOne(l,m);
	}

}
