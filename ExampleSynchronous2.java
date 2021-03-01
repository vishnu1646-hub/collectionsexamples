package collectionexamples;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ExampleSynchronous2 {
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> c = new CopyOnWriteArrayList<>();
		c.add("amazon");
		c.add("flipkart");
		c.add("snapdeal");
		Iterator<String> iterate = c.iterator();
		while (iterate.hasNext()) {
			System.out.println(iterate.next());
		}

	}

}
