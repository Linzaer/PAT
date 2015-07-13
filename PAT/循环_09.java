package BASE;

import java.util.Scanner;

public class Ñ­»·_09 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			int no = 1;
			for (int f = 0; f < 100; f++)
				for (int y = 0; y < 100; y++) {
					if ((f * 100 + y) == (n + 2 * y * 100 + 2 * f)) {
						System.out.printf("%d.%d\n", y, f);
						no = 0;
					}
				}

			if (no == 1)
				System.out.printf("No Solution\n");

		}
	}

}