
public class Test15
{public static void main(String []args)
	int = 11;

try {
	if (i>10)
		throw new ValueException();
	else
		System.out.println("Valid");
}
catch(ValueException e)
{
	System.out.println(e.toString));
}
}
}

class ValueException extends Exception
{
	public String toString()
	{
		return "value cannot be greater then 10";
	}
}