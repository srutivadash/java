package day4;

class Parent
{
int a;
void display()
{
	System.out.println(a);
}
}
 class child1 extends Parent
 {
	 int x;
	 void show()
	 {
 System.out.println(x);
	 }
	 }
 
 
public class HirerchyInheritance 
{
public static void main(String[] args) 
{
	child1 c1= new child1();
	c1.a =100;
	c1.x=200;
	c1.display();
	c1.show();
}
}
