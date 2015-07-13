package BASE;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ∑÷÷ß_20 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat("#0.00");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if (a < 0) {
			System.out.println("sign("+a+") = -1");
		} else if (a == 0) {
			System.out.println("sign("+a+") = 0");
		}else {
			System.out.println("sign("+a+") = 1");
		}
	}
}