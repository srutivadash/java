package day7;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int a=15;
		int b=25;
		int c=29;
		if (a>=b&&c>=b) 
		{
			System.out.println(a +" is larger number");
		}
		else if(b>=a&&b>=c)
		{
			System.out.println(b+" is larger number");
		}
		else
		{
			System.out.println(c+"is larger number");
		}
	}

}
