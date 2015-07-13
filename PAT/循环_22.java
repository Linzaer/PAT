package BASE;

import java.util.Scanner;

public class Ñ­»·_22 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		if (n < 2001 || n > 2100) {
			System.out.println("Invalid year!");

		} else {

			for (int i = 2001; i <= n; i++) {

				if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
					System.out.println(i);
				}

			}
		}

	}
}