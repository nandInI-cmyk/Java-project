
public class App12 {
public static void main(String[] args) {
	int a[]= {10,20,30};
	int b[] = a;
	
	for(int val:b) 
	{
		System.out.println(val);
	}
	
	b[1]=100;
	for(int val:a) 
	{
		System.out.println(val);
	}
}
}


/*
public class App16 {
	public static void main(String[] args) {
		System.out.println("App16");
	}
}
class c1
{
  c1(){
    System.out.println("c1");
  }
  c1(int i){
    System.out.println(i);
  }
}
class b1 extends c1
{
  b1(int i)
  {
    System.out.println(i);
  }
  b1()
  {
    System.out.println("b1");
  }
}
public class App16 extends b1{
  public App16(int i)
  {
    super(10);
    System.out.println(i);
  }
  public App16()
  {this(5);
    System.out.println("App16");
  }
  public static void main(String[] args) {
    
App16 obj = new App16();
  }

}
*/