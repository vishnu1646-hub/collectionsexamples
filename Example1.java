package collectionexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example1 {
	public static void main(String[] args) {
		System.out.println("showing different ways of iterating Collections");
		ArrayList<String> list = new ArrayList<>();
		list.add("java");
		list.add("sap");
		list.add("ruby");
		list.add("c#");
		list.add("c++");
		//using iterator 
		System.out.println("using iterator method ");
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("using for each loop");
		//using for each
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("using get method");
		//using get method
		for (int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
		//using listiterator method
		System.out.println("using listiterator method");
		ListIterator<String> lI = list.listIterator();
		while(lI.hasNext()){
			System.out.println(lI.next());
		}
		System.out.println("using listiterator previous");
		ListIterator<String> lI2 = list.listIterator(list.size());
		while(lI2.hasPrevious()){
			System.out.println(lI2.previous());
		}

	}

}
