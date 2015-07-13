package BASE;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ·ÖÖ§_11 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		DecimalFormat c = new DecimalFormat("#0.00");
		Scanner s = new Scanner(System.in);
		double wage;
		while (true) {
			double year = s.nextDouble();
			double time = s.nextDouble();

			if (year >= 0 && time >= 0) {
				if (year < 5) {
					if (time <= 40) {
						wage = time * 30;
					} else {
						wage = 30 * 40 + (time - 40) * 1.5 * 30;
					}
				} else {
					if (time <= 40) {
						wage = time * 50;
					} else {
						wage = 40 * 50 + (time - 40) * 1.5 * 50;
					}
				}
				System.out.println(c.format(wage));
			} else {
				return;
			}

		}
	}
}