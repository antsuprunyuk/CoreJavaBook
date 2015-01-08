package anton.alerty.intros;

import java.util.*;

public class EmployeeTest {

	public static void main(String[] args) {

		Manager boss = new Manager("Anton Suprunyuk", "Junior programmer", 50000, 7000, 2016, 3, 1);
		
		Employee[] staff = new Employee[3];
		staff[0] = boss; 
		staff[1] = new Employee("Rick Olson", "Translator Ru - Eng", 40000, 2015, 12, 11);
		staff[2] = new Employee("Ivan Burov", "Machine Operator", 45000, 2016, 11, 12);
		
		Manager[] managers = new Manager[10];
	//	ERROR here ArrayStoreException
		Employee[] staffManagers = managers;
		staffManagers[0] = staff[1];
	//	
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
	
	public Employee() {
		name = "";
		position = "";
		salary = 0.0;
		hireDate = new Date();
	}
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
class Manager extends Employee {
	
	private double bonus;
	
	public Manager(String n, String p, double s, double b, int y, int m, int d) {
		super(n, p, s, y, m, d);
		bonus = b;
	}
	
	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}
	
	
}




























