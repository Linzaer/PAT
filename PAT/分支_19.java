package BASE;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ∑÷÷ß_19 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat("#0.00");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if (a < 0) {
			System.out.println("Invalid Value!");
		} else if (a <= 50) {
			System.out.println("cost = " + decimalFormat.format(0.53 * a));
		}else {
			System.out.println("cost = "
					+ decimalFormat.format(50 * 0.53 + 0.58 * (a - 50)));
		}
	}
}