package BASE;

import java.util.Scanner;

public class Ñ­»·_13 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean flag = false;
		while (true) {
			int n = scanner.nextInt();
			for (int i = 1; i <= n / 2; i++) {
				for (int j = i; j <= n / 2; j++) {
					if (i * i + j * j == n) {
						System.out.printf("%d %d", i, j);
						flag = true;
						System.out.println();
					}
				}
			}

			if (!flag) {
				System.out.println("No Solution");
			}
		}
	}

}