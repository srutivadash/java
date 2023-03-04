package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 
{

	public static void main(String[] args) 
	{
	//ArrayList al=new ArrayList();
		//ArrayList<integer> al= new ArrayList<intiger>();
		//ArrayList<string> al= new ArrayList<String>();
		//List al= new ArrayList();
		ArrayList al= new ArrayList();	
		//Add new elements to ArrayList
			al.add(100);
		al.add("Hello");
		al.add(13.5);
		al.add('A');
		al.add(true);
		System.out.println(al);
		//size of the ArrayList
		System.out.println("No of elements in the ArrayList:"+al.size());
		System.out.println(al.size());
		//remove= al.remove(index)
		System.out.println(al.remove(3));
		System.out.println("After removing the element from ArrayList:"+al);
		//insert a new element in ArrayList
		//add(index.object)
		al.add(3,"python");
		System.out.println("After insertion:"+al);
		//Retrive the specific elemenet
		System.out.println(al.get(3));
		//change the element or replace
		al.set(2,"java");
		System.out.println("After replacing the element:"+al);
		//search or contains return true or false
		System.out.println(al.contains("Hello"));
		System.out.println(al.contains(50));
		//IsEmpty();
		System.out.println(al.isEmpty());
		//forloop
		System.out.println("read the element by using for loop");
		for(int i=0;i<al.size();i++)
		{
			//System.out.println("inside for loop");
			System.out.println(al.get(i));
		}
	//for each loop
		System.out.println("Reading element using by for...each loop");
for(Object e:al)
{
	System.out.println(e);
}
    //Itrator
System.out.println("Raeding elements using by itrator method");
Iterator it= al.iterator();
while (it.hasNext())
{
	System.out.println(it.next());
}


	}

}
