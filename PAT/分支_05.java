package BASE;

import java.util.Scanner;

public class ∑÷÷ß_05 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			String input = s.nextLine();
			if (input.split(" ").length == 3) {

				int a = Integer.parseInt(input.split(" ")[0]);
				int b = Integer.parseInt(input.split(" ")[1]);
				int c = Integer.parseInt(input.split(" ")[2]);
				if (a == b) {
					System.out.println("C");
				} else if (a == c) {
					System.out.println("B");
				} else {
					System.out.println("A");
				}

			}

		}
	}

}