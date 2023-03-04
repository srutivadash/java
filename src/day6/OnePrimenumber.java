package day6;

public class OnePrimenumber
{

	public static void main(String[] args) 
	{
		/*int num=1;
		if(num%2==0)
		{
			System.out.println("notprime number");
		}
		else
		{
			System.out.println("prime number");
		}
	}*/
int   num=100;
for(int i=2;i<=num; i++)
	
{
	int c=0;
	for(int j = 2;j<i;j++)
	if (i%j ==0 )
	{
		
	c=1;
		
	}
	if (c==0)
	{
		System.out.println("primenumber"+i);
	}
		
	}



}
}


