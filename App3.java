public class App3 {
public static void main(String args[])
{
  System.out.println(args[0]);
  System.out.println(args[1]);
  System.out.println(args[0]+args[1]);//1020
  
String s="Hello";
System.out.println(s.concat(" world"));
s= s.concat(" world");
System.out.println(s);

int x=5;// first memory x-->5  var= value
 x=6;//
x=7;// same address ,value change
String s1="Hello";//immutable
System.out.println(s1.hashCode());
s1 = "abc";//new s1
System.out.println(s1.hashCode());
int y=x;// pass by value-->7

String s2=s1;//pass by reference

System.out.println(s2.hashCode());
String s3="abc";
String s4="abc";
String s5="abc";
System.out.println(s5.hashCode());
s5="Abc";
System.out.println(s5.hashCode());


}
}

//C lang- top level funcion - int main(){ return 0;}
//0 - properly exit... ---> OS
// other than 0, it means --any error 

// java top - void main()
// retrun null
// a.java-->a.class-->jvm--->any hw---os---user
