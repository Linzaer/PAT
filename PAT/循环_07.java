package BASE;

import java.util.Scanner;

public class Ñ­»·_07 {

	private static int a;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int height = scanner.nextInt();
			int up = scanner.nextInt();
			int down = scanner.nextInt();
			int t = 0, path = 0;
			while (path < height) {
				t++;
				if (t % 2 != 0) {
					path += up;
				} else {
					path -= down;
				}

			}
			System.out.println(t);

		}

	}
}