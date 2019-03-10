package ocp.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSummary {
	private static Employee[] arrayOfEmp = {
			new Employee(1, "Jeff Bezos", 100000.0),
			new Employee(2, "Bill Gates", 200000.0),
			new Employee(3, "Mark Zuckerberg", 300000.0) };
	static List<Employee> empList = Arrays.asList(arrayOfEmp);

	public static void main(String args[]) {
		System.out.println(Stream.of(arrayOfEmp));

		empList.stream();

		Stream.of(arrayOfEmp[0], arrayOfEmp[1], arrayOfEmp[2]);
		Stream.Builder<Employee> employeeBuilder = Stream.builder();
		employeeBuilder.accept(arrayOfEmp[0]);
		employeeBuilder.accept(arrayOfEmp[1]);
		employeeBuilder.accept(arrayOfEmp[2]);
		Stream<Employee> emplStream = employeeBuilder.build();
	}
}

class Employee {
	private int empId;
	private String fullName;
	private double salary;

	public Employee(int empId, String fullName, double salary) {
		super();
		this.empId = empId;
		this.fullName = fullName;
		this.salary = salary;
	}
}
