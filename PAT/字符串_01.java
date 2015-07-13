package BASE;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ×Ö·û´®_01 {

	private static String c;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat("#0.00");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		char b = scanner.nextLine().toCharArray()[0];
		if (s.length() <= 80) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == b) {
					c = s.substring(i, s.length());
					break;
				}
			}
			if (c == null) {
				System.out.println("Not found");
			} else
				System.out.println(c);

		}
	}
}
