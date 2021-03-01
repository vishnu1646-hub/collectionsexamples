package collectionexamples;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example3 {
	public static void main(String[] args) {
		System.out.println("adding different elements");
		ArrayList list1 = new ArrayList<>();
		list1.add("keka");
		list1.add(46);
		list1.add('s');
		list1.add(32);
		list1.add("buddy");
		ArrayList list = new ArrayList<>();
		list.add("raja");
		list.add(12);
		list.add('b');
		list.add(16);
		list.add("maddy");
		for (Object object : list) {
			System.out.println(object);
		}
		System.out.println("adding at index");
		list.add(1, "sap");
		for (Object object : list) {
			System.out.println(object);
		}
		list.addAll(1, list1);
		System.out.println("after adding group of collection");
		for (Object object : list) {
			System.out.println(object);
		}
		System.out.println(list.isEmpty());
		// list.clear();
		// System.out.println("after clearing");
		// for (Object object : list) {
		// System.out.println(object);
		// }
		// System.out.println(list.isEmpty());
		System.out.println(list.lastIndexOf('b'));
		Object listClone = list.clone();
		System.out.println(listClone);
		list.removeAll(list1);
		for (Object object : list) {
			System.out.println(object);
		}
		list.remove(1);
		for (Object object : list) {
			System.out.println(object);
		}
		list.retainAll(list);
		for (Object object : list) {
			System.out.println(list1);
		}

	}

}
