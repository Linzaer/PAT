package BASE;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ½á¹¹_03 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("#0.0");
		double x1 = cin.nextDouble();
		double y1 = cin.nextDouble();
		double x2 = cin.nextDouble();
		double y2 = cin.nextDouble();
		double x_result = x1 + x2;
		double y_result = y1 + y2;
		if (decimalFormat.format(x_result).equals("-0.0")) {
			System.out.println("(" + 0.0 + ", "
					+ decimalFormat.format(y_result) + ")");
		} else if (decimalFormat.format(y_result).equals("-0.0")) {
			System.out.println("(" + decimalFormat.format(x_result) + ", "
					+ 0.0 + ")");
		} else if (decimalFormat.format(x_result).equals("-0.0")
				&& decimalFormat.format(y_result).equals("-0.0")) {
			System.out.println("(" + 0.0 + ", " + 0.0 + ")");
		} else {

			System.out.println("(" + decimalFormat.format(x_result) + ", "
					+ decimalFormat.format(y_result) + ")");
		}

	}

}