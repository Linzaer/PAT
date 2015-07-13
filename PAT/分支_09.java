package BASE;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ∑÷÷ß_09 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		DecimalFormat c = new DecimalFormat("##0.00");
		Scanner s = new Scanner(System.in);
		while (true) {
			String input = s.nextLine();
			if (input.split(" ").length == 1) {

				int a = Integer.parseInt(input.split(" ")[0]);
				if (a <= 15) {
					double y = 4 * a * 1.00 / 3;
					System.out.println(c.format(y));
				} else {
					double y = 2.5 * a * 1.00 - 17.5;
					System.out.println(c.format(y));
				}

			}

		}
	}
}