package anton.alerty.equals;

import java.lang.reflect.*;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {

		ArrayList<Employee> staff = new ArrayList<>();
		
		staff.add(new Employee("Carl Corall", 24000, 2004, 1, 27));
		staff.add(new Employee("Clara Carson", 34000, 2007, 12, 2));
		staff.add(new Employee("Pavel Soleman", 28000, 2005, 10, 12));
		
		for (Employee e : staff) {
			System.out.println(e);
		}
		
		for (Employee e : staff) {
			e.raiseSalary(15);
		}
		
		System.out.println();
	/*	
		for (int i = staff.size() - 1; i >= 0; i--) {
			System.out.println(staff.remove(i));
			System.out.println(staff.size());
		}
	
		for (Employee e : staff) {
			System.out.println(e);
		}
	*/
		Class e = staff.get(0).getClass();
		
		Field f = e.getDeclaredField("name");
		f.setAccessible(true);
		Object obj = f.get(staff.get(0));
		System.out.println(obj);
		f.set(staff.get(0), "Cola Cola");
		System.out.println(staff.get(0).getName());
	}

}
