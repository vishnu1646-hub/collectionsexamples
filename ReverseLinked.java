package collectionexamples;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinked {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("jquery");
		list.add("c#");
		list.add("kotlin");
		list.add("AI");
		Iterator<String> iterator = list.descendingIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
