package anton.alerty;

import java.math.BigInteger;
import java.util.Scanner;

public class ShortTest {

	public static final int NRATES = 6;
	public static final int NYEARS = 10;
	public static final int START_RATE = 10;
	public static final int START_BALANCE = 10000;
	
	public static void main(String[] args) {
		
		int[] interestRates = new int[NRATES];
		for (int i = 0; i < interestRates.length; i++) {
			interestRates[i] = (START_RATE + i);
		}
		
		double[][] balance = new double[NYEARS][NRATES];
		for (int j = 0; j < balance[0].length; j++) {
			balance[0][j] = START_BALANCE;
		}

		for (int i = 1; i < balance.length; i++) {
			for (int j = 0; j < balance[i].length; j++) {
				double oldBalance = balance[i-1][j];
				double interest = oldBalance * interestRates[j] / 100;
				balance[i][j] = oldBalance + interest;
			}
		}
		
		for (int interest : interestRates) {
			System.out.printf("%9d%%", interest);
		}
		System.out.println();
		
		for (double[] row : balance) {
			for (double b : row) {
				System.out.printf("%10.2f", b);
			}
			System.out.println();
		}
	}

}
