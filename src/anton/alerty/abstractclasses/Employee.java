package anton.alerty.abstractclasses;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee extends Person{

	private double salary;
	private Date hireDate;
	
	public Employee(String n, double s, int year, int month, int day) {
		super(n);
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		hireDate = calendar.getTime();
	}

	public String getName() {
		return super.getName();
	}
	
	public String getDescription() {
		 return getName() + " gets a salary of "+ (int) salary + " U.S. dollars";
	}
	
}
