abstract class Parent {
	abstract String getData();
	public void print() {
		System.out.println(getData());
	}
    int i;
}
//final class cannot be extended ---> only object
//abstract class always extends----> no object
class Child1 extends Parent
{
	String getData() {
		return "Child1";
	}
}
class Child2 extends Parent
{
	String getData() {
		return "Child2";
	}
}
public class App20 {

	public static void main(String[] args) {
		Parent obj;
		
		Child1 ch1 = new Child1();
		ch1.print();
		Child2 ch2 = new Child2();
		ch2.print();
		

	}

}
