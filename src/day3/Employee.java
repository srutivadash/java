package day3;

public class Employee 
{
	public void Employeeid()// method creation
	{
		System.out.println("Employeeid");
	}
	
	private void Employeename()
	
	{
		System.out.println("Employeename");
    }
	//
	public static void main(String[] args) 
	{
		Employee a= new Employee();  // object creation
		a.Employeeid();
		a.Employeename();
		
	}
}
