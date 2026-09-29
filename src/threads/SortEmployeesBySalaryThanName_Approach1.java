package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortEmployeesBySalaryThanName_Approach1 {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
				new Employee("Zakir", 50000), 
				new Employee("Amit", 70000),
				new Employee("Arun", 50000), 
				new Employee("Neha", 90000));
		
		Collections.sort(list,new EmployeeComparator());
		list.forEach(System.out::println);
	}

}
