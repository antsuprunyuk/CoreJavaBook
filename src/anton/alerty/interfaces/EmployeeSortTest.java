package anton.alerty.interfaces;

import java.util.Arrays;

public class EmployeeSortTest {

	public static void main(String[] args) {
		
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Nick Drake", 125000);
		staff[1] = new Employee("John Cage", 29300);
		staff[2] = new Employee("Emma Mae", 78000);
		
		Arrays.sort(staff);
		
		for (Employee e : staff) {
			System.out.println(e.getName() + " " + e.getSalary());
		}
	}

}

class Employee implements Comparable<Employee>{
	
	private String name;
	private double salary;
	
	public Employee(String n, double s) {
		name = n;
		salary = s;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	public int compareTo(Employee other) {
		return Double.compare(salary, other.salary);
	}
	
}
