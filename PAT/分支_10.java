package BASE;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ·ÖÖ§_10 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		DecimalFormat c = new DecimalFormat("#0.00");
		Scanner s = new Scanner(System.in);
		double tax;
		while (true) {
			double salary = s.nextDouble();
			if (salary >= 0) {
				if (salary <= 1600) {
					tax = 0;
				} else if (salary <= 2500) {
					tax = 0.05 * (salary - 1600);
				} else if (salary <= 3500) {
					tax = 0.10 * (salary - 1600);
				} else if (salary <= 4500) {
					tax = 0.15 * (salary - 1600);
				} else {
					tax = 0.2 * (salary - 1600);
				}
				System.out.println(c.format(tax));

			} else {
				return;
			}

		}
	}
}