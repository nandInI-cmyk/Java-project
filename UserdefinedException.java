class TooYoungException extends RuntimeException
{
	TooYoungException(String s)
	{
		super(s);
	}
}

class TooOldException extends RuntimeException
{
	TooOldException(String s)
	{
		super(s);
	}
}
public class UserdefinedException {
	public static void main(String[] args) {
		int age=Integer.parseInt(args[0]); if(age>60)
		{
			throw new TooYoungException("please wait some more time.... u will get best match");
		}
		else if(age<18)
		{
			throw new TooYoungException("u r age already crossed.... no chance of getting married");
		}
		else
		{
			System.out.println("you will get match details in your registered email address");
		}
	}

}
