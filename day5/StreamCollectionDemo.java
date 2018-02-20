package com.capgemini.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamCollectionDemo {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Ashwin", 20));
		empList.add(new Employee("Srikanth", 15));
		empList.add(new Employee("Yeshwant", 35));
		empList.add(new Employee("Bharath", 18));
		empList.add(new Employee("sahii", 56));
		empList.add(new Employee("Srinivas", 6));
		empList.add(new Employee("Ashu", 45));

		// empList.forEach(System.out::println);
		// From employee object increment the salary by 5%

		/*List emplList2 = empList.stream().map(e -> {
			(e.getSalary() + (e.getSalary() * 1.15));
		}).collect(Collectors.toList());
		System.out.println(emplList2);*/

		// From studen object, get the student details whose marks>80
		List empList1 = empList.stream().filter(e -> e.getSalary() > 30)
				.collect(Collectors.toList());
		System.out.println(empList1);

		List revisedSalList = empList.stream().map(emp -> emp.getSalary() * 2)
				.collect(Collectors.toList());
		System.out.println(revisedSalList);
	}
}

class Employee {
	String name;
	int salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}