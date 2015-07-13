package BASE;

import java.util.Scanner;

public class Ñ­»·_18 {

	private static int j;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int rabbit = 0;
			int T = scanner.nextInt();

			boolean run = true;
			int sleep = 0;
			for (j = 0; j < T; j++) {
				if (j % 10 == 0 && rabbit > 3 * j && run) {
					run = false;
					sleep = 30;
				}

				if (sleep == 0) {
					run = true;
				}
				if (run) {
					rabbit += 9;
				} else {
					sleep--;
				}
			}

			if (rabbit > 3 * j) {
				System.out.println("^_^ " + rabbit);
			} else if (rabbit < 3 * j) {
				System.out.println("@_@ " + 3 * j);
			} else {
				System.out.println("-_- " + 3 * j);

			}

		}

	}
}