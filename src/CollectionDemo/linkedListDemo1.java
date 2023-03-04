package CollectionDemo;

import java.util.LinkedList;

public class linkedListDemo1 {

	public static void main(String[] args) {
		//Declare LinkedList
		//LinkedList l =new Linkedlist();
		//LinkedList <integer> l= new LinkedList<integer>();
		//LinkedList<String> l= new LinkedList<String>();
		LinkedList l=new LinkedList();
		//Add elements to LinkedList
		l.add(12);
		l.add("Hello");
		l.add(45.3);
		l.add('A');
		//l.add(null);
		l.add(false);
		l.add(null);
		//l.add(null);
		System.out.println(l);
		//size () of the LinkedList
		System.out.println(l.size());
		//Remove the element from LinkedList
		//l.remove();
		l.remove(3);
		System.out.println("After removing the element from Linkedlist:"+l);
		//adding the element inside LinkedList
		//l.add(index,object);
		l.add(2,"java");
		System.out.println("After adding the element in LinkedList:"+l);
		//retriving the value from linkedList
		//l.get(index);
		l.get(3);
		System.out.println("After retriving the index in LinkedList:"+l);
		//replace the element
		//l.set(index.object);
		l.set(3,"Python");
		System.out.println("after replacing the object in the LinledList:"+l);
		//contains whetherthe value is there in the List or not output will be boolean
		System.out.println(l.contains(35));
		System.out.println(l.isEmpty());
		//reading the elements by using for....loop
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
	//	reading elements using each...loop
	for(Object e:l)
	{
	System.out.println(e);
	}
	reading the element by 
	}

}
