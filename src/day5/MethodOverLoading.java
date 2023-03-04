package day5;
public class MethodOverLoading 
{
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	void add(int a, double b)
	{
		System.out.println(a+b);
	}
	void add(double a, double b)
	{
		System.out.println(a+b);
	}
	void add(int a, int b,int c)
	{
		System.out.println(a+b);
	}
    public static void main(String[] args)
    {
	MethodOverLoading mo=new MethodOverLoading();
			mo.add(10,20);
			mo.add(15,12,14);
			mo.add(12,7.5);
			mo.add(9.3,7.6);
    }
}
