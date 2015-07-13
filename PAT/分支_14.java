package BASE;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ∑÷÷ß_14 {

	private static String c;
	private static int a;
	private static int b;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat("#0.00");
		Scanner scanner = new Scanner(System.in);
		int[] d = new int[3];
		String[] operator = { "+", "-", "*", "/", "%" };
		boolean flag = false;
		while (true) {
			String input = scanner.nextLine();
			if (input.split(" ").length == 3) {
				a = Integer.parseInt(input.split(" ")[0]);
				c = input.split(" ")[1];
				b = Integer.parseInt(input.split(" ")[2]);
			}
			for (int i = 0; i < operator.length; i++) {
				if (c.equals(operator[i])) {
					flag = true;
				}
			}
			if (!flag) {
				System.out.println("ERROR");
			} else {
				if (c.equals("+")) {
					System.out.println(a + b);
				} else if (c.equals("-")) {
					System.out.println(a - b);
				} else if (c.equals("*")) {
					System.out.println(a * b);
				} else if (c.equals("/")) {
					System.out.println(a / b);
				} else {
					System.out.println(a % b);
				}
			}

		}
	}
}