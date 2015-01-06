package anton.alerty;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Anton Suprunyuk", "Junior programmer", 50000, 2016, 3, 1);
		staff[1] = new Employee("Rick Olson", "Translator Ru - Eng", 40000, 2015, 12, 11);
		staff[2] = new Employee("Ivan Burov", "Machine Operator", 45000, 2016, 11, 12);
		
		for (Employee e : staff) {
			System.out.println("Name: " + e.getName() + "	Position: " + e.getPosition() + "	Salary: " + e.getSalary() + "	HireDate: " + e.getHireDate());
		}
	}

}

class Employee {
	
	private String name;
	private String position;
	private double salary;
	private Date hireDate;
	
	public Employee(String n, String p, double s, int y, int m, int d) {
		name = n;
		position = p;
		salary = s;
		GregorianCalendar c = new GregorianCalendar(y, m-1, d);
		hireDate = c.getTime();
	}
	
	public String getName() {
		return name;
	}
	
	public String getPosition() {
		return position;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public Date getHireDate() {
		return (Date) hireDate.clone();
	}
	
	public void increaseSalary(double byPercent) {
		double increase = salary * byPercent / 100;
		salary += increase;
	}
}