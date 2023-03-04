package overRiding;
class Bank
{
int getRateOfInterest()
{
	return 8;
}
}
class SBI extends Bank
{
int getRateOfInterest()	
{
	return 10;
}
}
class ICICI extends Bank
{
	int getRateOfInterest()
	{
		return 12;
	}
}

class AXIS extends Bank
{
	int getRateOfInterest()
	{
		return 15;
	}
}

public class OverRidingMethodDemo {

	public static void main(String[] args)
	{
		SBI sbiobj=new SBI();
		System.out.println(sbiobj.getRateOfInterest());
		ICICI iciciobj=new ICICI();
		System.out.println(iciciobj.getRateOfInterest());
		AXIS axisobj=new AXIS();
		System.out.println(axisobj.getRateOfInterest());
		Bank bankobj=new Bank();
        System.out.println(bankobj.getRateOfInterest());
	}

}
