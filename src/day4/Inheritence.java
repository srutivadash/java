package day4;


 class A
 {
 int a;
 protected void display()///// method creation
 {
 System.out.println(a);	 
 }
 }

class B extends A   //// single level
{
int b;
protected  void print()///// method creation
{
System.out.println(b);
}
}
class C extends B     ///// multilevel
{
int c;
protected  void show()////// method creation
{
	System.out.println(c);
}
}
public class Inheritence 

{
public static void main(String[] args)
{
	A aobj = new A();/// object creation
	aobj.a=100;	
	aobj.display();
	B bobj = new B();//// object ceration
	bobj.a=10;
	bobj.b=20;
	bobj.display();
	bobj.print();	
	C cobj=new C();//// object creation
	cobj.a=10;
	cobj.b=20;
	cobj.c=30;
	cobj.display();
	cobj.print();
	cobj.show();

	

}
}
