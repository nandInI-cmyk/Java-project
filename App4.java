public class App4 {
public static void main(String args[])
{
	/*
	 * String s="hello"; System.out.println(s.startsWith("h"));//true
	 * System.out.println(s.startsWith("he"));//true
	 * System.out.println(s.startsWith("ha"));//false
	 * 
	 * System.out.println(s.endsWith("o"));//true
	 * System.out.println(s.endsWith("lo"));//true
	 * System.out.println(s.endsWith("ao"));//false
	 */
  String s1 = "    Hello   ";
  System.out.println(s1.length());//count space
  System.out.println(s1);
  System.out.println(s1.trim());
  System.out.println(s1.trim().length());//5
  
  //System.out.println(s.contains("e"));//true
 // System.out.println(s.contains("z"));//false

  //char data[] = s.toCharArray();
  
  //System.out.println(data[0]);
  String s2 ="   ";
  System.out.println(s2.isBlank());//true
  System.out.println(s2.isEmpty());//false
  
  
  String s4= "What is java";
  System.out.println(s4.replace('a', 'g'));
  char data[]= s4.toCharArray();
  System.out.println(data[9]);
  System.out.println(data[7]);
  String words[] = s4.split("  ");
  System.out.println(words[2]);
  //reverse string
  // abc  cba
  // what is java  tahw s1 avaj
  
}
}