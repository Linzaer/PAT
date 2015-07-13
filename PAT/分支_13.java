package BASE;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ∑÷÷ß_13 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		DecimalFormat c = new DecimalFormat("#0.00");
		Scanner scanner = new Scanner(System.in);
		int[] d = new int[3];
		while (true) {
			String day = scanner.nextLine();
			String[] days = day.split("/");
			for (int i = 0; i < days.length; i++) {
				d[i] = Integer.parseInt(days[i]);
			}
			int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			if ((d[0] % 4 == 0 && d[0] % 100 != 0) || d[0] % 400 == 0) {
				months[1] = 29;
			}
			int day1 = 0;
			for (int i = 0; i < d[1] - 1; i++) {
				day1 += months[i];
			}
			day1 += d[2];
			System.out.println(day1);
		}
	}
}