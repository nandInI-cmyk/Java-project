class A1 
{
	static int i=B1.j;
}
class B1 extends A1
{
	static int j=C1.methodOne();
}
class C1 extends B1
{
	public static int methodOne()
	{
		return D1.k;
	}
}
public class D1 extends C1
{
	static int k=10;
	public static void main(String[] args) {
	D1 d=new D1();
	System.out.println(d);
	System.out.println(k);

	}
}

