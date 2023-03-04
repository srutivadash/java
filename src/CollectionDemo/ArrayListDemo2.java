package CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("x");
		al.add("y");
		al.add("z");
		al.add("A");
		al.add("B");
		al.add("c");
		ArrayList alp=new ArrayList();
		alp.addAll(al);
		System.out.println(al);
		alp.removeAll(al);
		System.out.println(alp);
		
		//sort..... Collections .sort()
		System.out.println("Elements in the Arraylist:"+al);
Collections.sort(al);
System.out.println("Elements in the Arraylist after sorting:"+al);
Collections.sort(al,Collections.reverseOrder());
System.out.println("Elements in the Arraylist after reverese order:"+al);
Collections.shuffle(al);
System.out.println("Elements in the Arraylist after Shuffling:"+al);

	}

}
