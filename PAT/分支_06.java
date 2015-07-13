package BASE;

import java.util.Scanner;

public class ∑÷÷ß_06 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			String input = s.nextLine();
			if (input.split(" ").length == 1) {

				int a = Integer.parseInt(input.split(" ")[0]);
				if (a < 60) {
					System.out.println("E");
				} else if (a < 70 && a >= 60) {
					System.out.println("D");
				} else if (a < 80 && a >= 70) {
					System.out.println("C");
				} else if (a < 90 && a >= 80) {
					System.out.println("B");
				}

				else {
					System.out.println("A");
				}

			}

		}
	}

}