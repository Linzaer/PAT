package BASE;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ∑÷÷ß_15 {

	private static double open;
	private static double high;
	private static double low;
	private static double close;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat("#0.000");
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String input = scanner.nextLine();
			if (input.split(" ").length == 4) {
				open = Double.parseDouble(input.split(" ")[0]);
				high = Double.parseDouble(input.split(" ")[1]);
				low = Double.parseDouble(input.split(" ")[2]);
				close = Double.parseDouble(input.split(" ")[3]);
			}
			if (close < open) {
				System.out.print("BW-Solid");
			} else if (close > open) {
				System.out.print("R-Hollow");
			} else {
				System.out.print("R-Cross");
			}
			if (low < open && low < close && high > open && high > close) {
				System.out.println(" with Lower Shadow and Upper Shadow");
			} else if (low < open && low < close) {
				System.out.println(" with Lower Shadow");
			} else if (high > open && high > close) {
				System.out.println(" with Upper Shadow");
			}

		}
	}
}