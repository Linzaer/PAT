package BASE;

import java.text.DecimalFormat;
import java.util.Scanner;

public class สýื้_01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat("#0.00");
		Scanner scanner = new Scanner(System.in);
		long number = 0;
		char[] s = scanner.nextLine().toCharArray();
		if (s.length <= 80) {
			for (int i = 0; i < s.length; i++) {
				if (s[i] >= '0' && s[i] <= '9') {
					number = number * 10 + s[i] - '0';
				}
			}
			System.out.println(number);
		}
	}

}