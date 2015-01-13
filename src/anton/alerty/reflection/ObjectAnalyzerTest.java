package anton.alerty.reflection;

import java.util.ArrayList;

/**
 * this program uses reflection to spy on objects
 * @author Cay Horstmann
 */
public class ObjectAnalyzerTest {

	public static void main(String[] args) {

		ArrayList<Integer> squares = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			squares.add(i * i);
		}
		System.out.println(new ObjectAnalyzer().toString(squares));
	}
}
