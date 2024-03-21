interface Area {

	public static final float pi=3.14f;	
	  float z=3.14f;	  
	  float compute(float a,float b);
}
class Rectangle implements Area
{
  public float compute(float a,float b)
  {
    return a*b;
  }
}
class Circle implements Area
{
  public float compute(float a,float b)
  {
    return pi*a*a;
  }
}


public class Test4 {
	public static void main(String[] args) {
	    Rectangle r = new Rectangle();
	    Circle  c = new Circle();
	    
	    System.out.println("Area of Rectangle :"+r.compute(10, 20));
	    
	    System.out.println("Area of Circle :"+c.compute(10, 0));
}
}
