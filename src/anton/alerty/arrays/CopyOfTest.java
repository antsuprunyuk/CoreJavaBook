package anton.alerty.arrays;

import java.lang.reflect.*;
import java.util.*;

/**
 * This program demonstrates the use of reflection for manipulating arrays
 * @author Cay Horstmann
 */
public class CopyOfTest {

	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		a = (int[]) goodCopyOf(a, 10);
		System.out.println(Arrays.toString(a));
		
		String[] b = {"Tom", "Dick", "Harry"};
		b = (String[]) goodCopyOf(b, 10);
		System.out.println(Arrays.toString(b));
		
		System.out.println("The following call will generate an exception");
		b = (String[]) badCopyOf(b, 20);
		System.out.println(Arrays.toString(b));
	}

	public static Object[] badCopyOf(Object[] a, int newLength) {
		Object[] newArray = new Object[newLength];
		System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
		return newArray;
	}
	
	public static Object goodCopyOf(Object a, int newLength) {
		Class cl = a.getClass();
		if (!cl.isArray()) return null;
		Class componentType = cl.getComponentType();
		int length = Array.getLength(a);
		Object newArray = Array.newInstance(componentType, length);
		System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
		return newArray;
	}
}

