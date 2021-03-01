package collectionexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example5 {
	public static void main(String[] args) {
		System.out.println("sorting array list");
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,3,4,2,1,6,9,8,0,7));
		Collections.sort(list);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

}
