package collectionexamples;

import java.util.ArrayList;

public class Example7 {
	public static void main(String[] args) {
		System.out.println("simple example for retainAll method");
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list1.add(40);
		list1.add(0);
		list1.add(30);
		list.retainAll(list1);
		for (Integer integer : list) {
			System.out.println(integer);
		}

	}

}
