//prog to open system applications
public class Test12 {

	public static void main(String[] args) {
		try {
			ProcessBuilder obj = new ProcessBuilder("notepad");
			obj.start();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
