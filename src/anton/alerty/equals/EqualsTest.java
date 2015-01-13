package anton.alerty.equals;
import anton.alerty.abstractclasses.*; 


public class EqualsTest {

	public static void main(String[] args) {

		Employee emp1 = new Employee("Sara Smith", 50000, 2015, 11, 7);
		Employee emp2 = emp1;
		Employee emp3 = new Employee("Sara Smith", 50000, 2015, 11, 7);
		Employee emp4 = new Employee("Bob Chetz", 37000, 2012, 1, 12);
		
		System.out.println("emp1 == emp2 " + (emp1==emp2));
		System.out.println("emp1 == emp3 " + (emp1 == emp3));
		System.out.println("emp1.equals(emp3) " + emp1.equals(emp3));
		System.out.println("emp1.equals(emp2) " + emp1.equals(emp2));
		System.out.println("emp1.equals(emp4) " + emp1.equals(emp4));
		System.out.println("Bob toString()  " + emp4);
		
		Manager carl = new Manager("Carl Cracker", 75000, 2012, 7, 12);
		Manager boss = new Manager("Carl Cracker", 75000, 2012, 7, 12);
		boss.setBonus(6500);
		System.out.println(" boss.toString()  " +  boss);
		System.out.println(" carl.equals(boss)  " + carl.equals(boss));
		System.out.println(" emp1.hashCode()  " + emp1.hashCode());
		System.out.println(" emp3.hashCode()  " + emp3.hashCode());
		System.out.println(" carl.hashCode()  " + carl.hashCode());
		System.out.println(" boss.hashCode()  " + boss.hashCode());
	}

}
