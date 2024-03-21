import account.Balance;
import java.util.*;
import java.util.regex.*;

public class AccountBalance {
	public static void main(String[] args) {
		Balance b = new Balance("Ss", 123.45);
		b.Show();
		System.out.println("Today = " + new Date());
		String mob = "IND";

		//Pattern p = Pattern.compile("[0-9]{10}");
		Pattern p = Pattern.compile("[A-Za-z]{3}");

		Matcher m = p.matcher(mob);
		if (m.matches()) {
			System.out.println("valid mobile number");
		}
		else 
		{
			System.out.println("invalid mobile number");
		}
		}
	}


