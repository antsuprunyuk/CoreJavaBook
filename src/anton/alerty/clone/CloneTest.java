package anton.alerty.clone;

public class CloneTest {

	public static void main(String[] args) {

		try {
			Employee original = new Employee("Cay Horstmann", 50000);
			original.setHireDate(2000, 7, 1);
			Employee copy = original.clone();
			copy.raiseSalary(15);
			copy.setHireDate(2011, 5, 05);
			System.out.println("Original : " + original);
			System.out.println("Copy : " + copy);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
