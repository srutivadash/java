package day7;

public class JumpStatement {

	public static void main(String[] args) {
	/*	for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}*/
		for(int i=10;i>=0;i--)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
		System.out.println("good morning");
	}

}
