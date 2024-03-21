/**
 * 
 * @author sameer
 * 
 *
 */



public class App1 {
  public static void main(String args[]) {
    System.out.println("Hello World");

    byte b = 10;//
    // byte b1=130;
    // byte b2 = 123.45;
    // byte b3=true;
    // byte b4="abc";
    byte b2 = 'B';// '' char datatype
    // ascii 0-255
    System.out.println(b2);

    short s = 130;
    // short s1=32768;
    // short s1="abc";
    // short s2=true;
    int i = 10;
    // int j=10.5;
    // int j=true;
    // int k="sa";

    // float f=10.5;

    boolean t = true;

    boolean t1 = false;

    int j = 'b';// 98

    char ch1 = 'a';// eng
    // unicode--special char
    char ch2 = 97;// a
    System.out.println(ch2);// a
    // A -65
    // a -97
    char ch3 = '\u00a9';// esc sequence used for unicode value
    System.out.println(ch3);
    int k = 010;// decimal to octal 1*81+0*80
    System.out.println(k);
    int k1 = 0X10;
    System.out.println(k1);

    // int z=0787;

    // 10 --- by default int

    long f = 10L;
    // 123.454 -- by defaul double
    float g = 123.456F;

    double h = 0123.234;

    System.out.println(h);// 123.234
    double h1 = 0123;// octal to decimal
    System.out.println(h1);

    double h2 = 0xface;
    System.out.println(h2);

    double h3 = 013;// octal to decimal
    System.out.println(h3);
    double h4 = 10e2;
    System.out.println(h4);

    int k2 = 0b101;
    System.out.println(k2);

    // int char,byte,short,decimal,binary,octal,hexa

    double d2 = 1_2_3.1_23;
    System.out.println(d2);

    double d3 = 'a';// 97

    float f2 = 10000000000L;

  }
}
//TTS-evening 5:30 pm
