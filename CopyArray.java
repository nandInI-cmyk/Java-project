
public class CopyArray { 
	public static void main(String[] args) {
		char[] copyFrom = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
		char[] copyTo = new char[7];
		System.arraycopy(copyFrom,2,copyTo,2,5);
		System.out.println(new String(copyTo));
	}

}
