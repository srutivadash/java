package overRiding;

class Veichle
{
	void run()
	{
		System.out.println("veichle is running");
	}
}
 class Bike extends Veichle
 {
	 void run()
	 {
		 System.out.println("Bike isrunning");
	 }
 }


public class OverridingDemo2 {

	public static void main(String[] args) {
		
Veichle vobj=new Veichle();
vobj.run();
Bike bobj= new Bike();
bobj.run();
System.out.println("welcome");
}

}
