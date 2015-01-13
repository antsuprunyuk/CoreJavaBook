package anton.alerty.abstractclasses;

public class PersonTest {

	public static void main(String[] args) {

		Person[] people = new Person[2];
		people[0] = new Employee("Anton Suprunyuk", 50000, 2016, 03, 17);
		people[1] = new Student("Vasiliy Livanov", "theatre actor");
		
		for (Person p : people) {
			System.out.println(p.getDescription());
		}
		
	}

}
