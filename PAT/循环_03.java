package BASE;

import java.util.Scanner;

public class Ñ­»·_03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int[] number = { a, a + 1, a + 2, a + 3 };
		for (int i = 0; i < number.length; i++) {
			int first = 1;
			for (int j = 0; j < number.length; j++) {
				if (i == j) {
					continue;
				}
				for (int k = 0; k < number.length; k++) {
					if (k == i || k == j) {
						continue;
					} else if (first == 1) {
						System.out.printf("%d%d%d", number[i], number[j],
								number[k]);
						first = 0;
					} else {
						System.out.printf(" %d%d%d", number[i], number[j],
								number[k]);
					}
				}
			}
			System.out.println();
		}

	}
}
