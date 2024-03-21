public class App9 {
int i;

void x()
{
  int i;
  i=10;
  this.i=20;   
}
void y()
{
  this.x();
}

int x1() {return 0;}

float x2() {
	return i;}
double x3() {
	return i;}
void x4() {}

String x5() {
  return "abc";
}

Employe x6()
{
  Employe e = new Employe();
  return e;
}

App9 x7()
{
  return this;
}

void y1(int i)//y1(5)
{
  
}
void y2(String s)
{
  
}
// y2("abc");

void y3(Employe e)
{
  
}
//y3(empobject)

void y4(App9 obj)
{
  
}
//y4(this);
  public static void main(String[] args) {


  }
}
