package collectionexamples;

import java.util.ArrayList;
import java.util.Arrays;

public class Example2 {
	public static void main(String[] args) {
		System.out.println("adding data in single line to list");
		ArrayList<String> list = new ArrayList<>(
				Arrays.asList("hare", "krishna", "hare", "krishna", "hare", "rama", "hare", "rama"));
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println(list.subList(0, 4));
	}

}
