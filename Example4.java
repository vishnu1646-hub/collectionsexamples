package collectionexamples;

import java.util.ArrayList;
import java.util.Arrays;

public class Example4 {
	public static void main(String[] args) {
		System.out.println("creating generic arraylist ");
		ArrayList<String> list ;
		System.out.println("this list allows only generic values");
		list = new ArrayList<>(Arrays.asList("java","python","ruby","kotlin","c++"));
		for (String string : list) {
			System.out.println(string);
		}
		
	}

}
