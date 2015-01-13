package anton.alerty.equals;


public class Manager extends Employee{

	private double bonus;
	
	public Manager(String n, double s, int y, int m, int d) {
		super(n, s, y, m, d);
		bonus = 0;
	}
	
	public double getSalary() {
		double standart = super.getSalary();
		return standart + bonus;
	}
	
	public void setBonus(double b) {
		bonus = b;
	}
	
	public boolean equals(Object otherObject) {
		if (!super.equals(otherObject)) return false;
		
		Manager other = (Manager) otherObject;
		return bonus == other.bonus;
	}
	
	public int hashCode() {
		return super.hashCode() + 17 * new Double(bonus).hashCode();
	}
	
	public String toString() {
		return super.toString() + " [bonus=" + bonus + "]"; 
	}
}
