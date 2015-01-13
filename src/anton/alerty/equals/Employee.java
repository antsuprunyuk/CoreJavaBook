package anton.alerty.equals;

import java.util.*;

public class Employee {

	private String name;
	private double salary;
	private Date hireDate;
	
	public Employee(String n, double s, int y, int m, int d) {
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(y, m-1, d);
		hireDate = calendar.getTime();
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public Date getHireDate() {
		return hireDate;
	}
	
	public  void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	public boolean equals(Object otherObject) {
		
		if (this == otherObject) return true;
		
		if (otherObject == null) return false;
		
		if (getClass() != otherObject.getClass()) return false;
		
		Employee other = (Employee) otherObject;
		
		return Objects.equals(name, other.name) && salary == other.salary && Objects.equals(hireDate, other.hireDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, salary, hireDate);
	}
	
	public String toString() {
		return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDate=" + hireDate + "]";
	}
	
}























































