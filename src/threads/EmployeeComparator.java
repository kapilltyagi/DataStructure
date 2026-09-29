package collections;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		int salaryCompare = e2.getSalary().compareTo(e1.getSalary());
		if(salaryCompare==0) {
			return e1.getName().compareToIgnoreCase(e2.getName());
		}
		return salaryCompare;
	}
}
