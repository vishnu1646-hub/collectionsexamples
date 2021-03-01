package collectionexamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExampleSynchronus {
	public static void main(String[] args) {
		List<String> sync = (List<String>) Collections.synchronizedList(new ArrayList<String>());
		sync.add("python");
		sync.add("javascript");
		sync.add("jquery");
		synchronized (sync) {
			Iterator<String> iterate = sync.iterator();
			while (iterate.hasNext()) {
				System.out.println(iterate.next());
			}
		}
	}

}
