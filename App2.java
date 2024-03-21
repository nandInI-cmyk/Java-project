public class App2 {

  public static void main(String args[])
  {
    String s="Hello";
    System.out.println(s.toUpperCase());
    System.out.println(s.toLowerCase());
    System.out.println(s);
    //s = s.toUpperCase();
    System.out.println(s.length());//5
    System.out.println(s.indexOf('e'));//1
    System.out.println(s.indexOf('l'));//2// first occurance
    System.out.println(s.lastIndexOf('l'));//3
    System.out.println(s.charAt(0));//H
    System.out.println(s.charAt(4));//H
    
    
    
    System.out.println(2+3);//5 //addition
    System.out.println("2+3");//2+3
    System.out.println("2"+"3");//23 concat
    System.out.println("2"+3);//23
    System.out.println("2"+3+5);//235
    System.out.println("2"+(3+5));//28
    System.out.println(2+3+"5");//55
    System.out.println(2+"3");//23
    String enroll = "0201CS011011";
    System.out.println("College code :"+enroll.substring(0,4));//0201
    System.out.println("branch :"+enroll.substring(4,6));//CS
    System.out.println("rollno :"+enroll.substring(6));//011011
    
    
    
  }
  //public - access modifier
  //static - access modifer
  //void - return null
  // main() - jvm is calling main() when you run the prog
  // String args[] - command line args-- for user input
  // no pointer concept
  // &a-address of a
}


