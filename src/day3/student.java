package day3;

public class student 
{
	
	
	int studentid;//variables
	String studentname;
	double studentloan;
	String studentadress;
	void display ()// method
	{
		System.out.println(studentid);
		System.out.println(studentname);
		System.out.println(studentloan);
		System.out.println(studentadress);
	}
	public static void main(String[] args) // main method
	
{
		student a=new student();// creation of objective 
				
a.studentid=101;
a.studentname="devid";
a.studentloan=45.32;
a.studentadress="xyz";
a.display();
student b= new student();
b.studentid=105;
b.studentname="john";
b.display();

	}
}
