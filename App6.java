
public class App6 {
	public App6( ) {
		this("abc");
		System.out.println("App6");
	}
	public App6(int i) {
		this();
		System.out.println(i);
	}
	public App6(String s) {
		System.out.println(s);
	}
 public static void main(String[] args) {
	 App6 obj = new App6(15);
 }
}
