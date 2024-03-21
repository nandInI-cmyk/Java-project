
public class Demoo {

	public static void main(String[] args) {
		try {
			{
				fun1();
			}
			catch(Exception e) 
			{
				System.out.println("in main");
				}
				fun2();
			}
		public static void fun1() throws Exception {
			try {
				System.out.println("try for fny");
				throw new Exception();}
				
				catch(Exception e) {
					System.out.println("catch of fun1");
				}
			finally
			{
				System.out.println("catch of fun1");
				
				
			}
		}

	}

}
