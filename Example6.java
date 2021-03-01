package collectionexamples;

import java.util.ArrayList;
import java.util.Arrays;

public class Example6 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,3,4,2,1,6,9,8,0,7));
		System.out.println("iterating using for each and lambda expressions");
		list.forEach(s->{System.out.println(s);});
		System.out.println("iterating using for each and method reference");
		list.forEach(System.out::println);
	}

}
