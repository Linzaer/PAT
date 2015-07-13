package BASE;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ·ÖÖ§_12 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		DecimalFormat c = new DecimalFormat("#0.00");
		Scanner s = new Scanner(System.in);
		while (true) {
			int start = s.nextInt();
			int end = s.nextInt();
			int c1 = end - start;
			if (start >= 0 && end >= 0) {
				if (start % 100 > end % 100) {

					System.out.printf("%02d:%02d", c1 / 100, c1 % 100 - 40);
				} else {
					System.out.printf("%02d:%02d", c1 / 100, c1 % 100);
				}

			} else {
				return;
			}

		}
	}
}