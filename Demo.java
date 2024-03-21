
public class Demo {
	public static void main(String[] args)
	{
		int i = 0;
		String greeting[] = { "Hello","hi","bye","oye riddhi"};
		try{
			//file.open();
			while(i<=greeting.length)
		
		{
			System.out.println(greeting[i]);
			i++;
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		finally
		{
			//file.close();
		
		System.out.println("all records dispalyed");
	    }
	

}
	}

