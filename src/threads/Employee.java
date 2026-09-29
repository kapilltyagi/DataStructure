package collections;

import java.util.Objects;

public class Employee {
	private String name;
	private Integer salary;
	public Employee(String name, Integer salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(name, other.name) && Objects.equals(salary, other.salary);
	}
	@Override
	public String toString() {
		return name + " - " + salary;
	}
	
}
