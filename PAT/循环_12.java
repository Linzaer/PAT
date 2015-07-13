package BASE;

import java.util.Scanner;

public class Ñ­»·_12 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.printf("%d*%d=%-4d", j, i, i * j);
				}
				System.out.println();
			}
		}
	}

}