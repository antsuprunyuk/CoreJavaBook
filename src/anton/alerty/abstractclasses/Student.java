package anton.alerty.abstractclasses;

public class Student extends Person{

	private String major;
	
	public Student(String n, String m) {
		super(n);
		major = m;
	}
	
	public String getName() {
		return super.getName();
	}
	
	public String getDescription() {
		return getName() + " is majoring in " + major;
	}
}
