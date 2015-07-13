package BASE;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ·ÖÖ§_18 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat("#0.00");
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double t = b * b - 4 * a * c;
		if (a == 0 && b == 0 && c == 0) {
			System.out.println("Zero Equation");
		} else if (a == 0 && b == 0 && c != 0) {
			System.out.println("Not An Equation");
		} else if (a == 0) {
			System.out.println(decimalFormat.format((-1 * c) / b));
		} else if (t > 0) {
			System.out.println(decimalFormat.format((-1 * b + Math.sqrt(t))
					/ (2 * a)));
			System.out.println(decimalFormat.format((-1 * b - Math.sqrt(t))
					/ (2 * a)));

		} else if (t < 0) {
			if (b != 0) {
				System.out.printf("%.2f+%.2fi\n", (-1 * b) / (2 * a),
						Math.sqrt(-1 * t) / (2 * a));
				System.out.printf("%.2f-%.2fi", (-1 * b) / (2 * a),
						Math.sqrt(-1 * t) / (2 * a));
			} else {
				System.out.printf("0.00+%.2fi\n", Math.sqrt(-1 * t) / (2 * a));
				System.out.printf("0.00-%.2fi", Math.sqrt(-1 * t) / (2 * a));
			}
		} else if (t == 0) {
			System.out.println(decimalFormat.format((-1 * b) / (2 * a)));
		}

	}
}