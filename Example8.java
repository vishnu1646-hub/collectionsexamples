package collectionexamples;

import java.util.ArrayList;
import java.util.Arrays;

public class Example8 {
	public static void main(String[] args) {
		System.out.println("converting arraylist to array");
		ArrayList<String> list = new ArrayList<>();
		list.add("pavan");
		list.add("srikanth");
		list.add("balaji");
		list.add("vishnu");
		String[] s = list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(s));

	}

}
