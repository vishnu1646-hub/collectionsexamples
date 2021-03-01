package collectionexamples;

import java.util.ArrayList;

public class College {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "vishnu");
		Employee e2 = new Employee(2, "balaji");
		Employee e3 = new Employee(3, "srikanth");
		ArrayList<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		for (Employee e : list) {
			System.out.println(e.eID+":"+e.employeeName);
		}
		
	}

}
