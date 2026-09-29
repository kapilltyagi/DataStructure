package collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployeesBySalaryThanName_Approach2 {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
				new Employee("Zakir", 50000), 
				new Employee("Amit", 70000),
				new Employee("Arun", 50000), 
				new Employee("Neha", 90000));
		list.sort(Comparator.comparing(Employee::getSalary).reversed().thenComparing(Employee::getName));
		list.forEach(System.out::println);
	}
}
