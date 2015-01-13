package anton.alerty.enums;

import java.util.Date;
import java.util.Scanner;

public class EnumTest {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Insert your size (SMALL or S, MEDIUM or M, LARGE or L, EXTRA_LARGE or XL):");
		String input = in.next().toUpperCase();
		Size size;
		switch (input){
		case "S":  size = Size.SMALL; break;
		case "M":  size = Size.MEDIUM; break;
		case "L":  size = Size.LARGE; break;
		case "XL": size = Size.EXTRA_LARGE; break;
		default:   size = Enum.valueOf(Size.class, input);
		}
		System.out.println("size = " + size);
		System.out.println("abbreviation = " + size.getAbbreviation());
		if (size == Size.EXTRA_LARGE) System.out.println("Good job, you paid attention to _.");

	}
}

enum Size {
	

	SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
	
	private String abbreviation;
	
	private Size(String abbreviation) { this.abbreviation = abbreviation; }
	public String getAbbreviation() { return abbreviation; }
	
}
