package BASE;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ·ÖÖ§_16 {

	private static float a;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat("#0.00");
		Scanner scanner = new Scanner(System.in);
		while (true) {
			a = scanner.nextFloat();

			if (a >= 0) {

				System.out.println("f(" + decimalFormat.format(a) + ") = "
						+ decimalFormat.format(Math.pow(a, 0.5)));
			} else {
				System.out.println("f("+decimalFormat.format(a)+") = "+decimalFormat.format(Math.pow((a+1), 2)+2*a+1/a)+"");
			}

		}
	}
}