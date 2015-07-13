package BASE;


import java.util.Scanner;

public class Ñ­»·_05 {

	private static int a;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int a = scanner.nextInt();

			if (a >= 0) {

				for (int i = 1; i < 10000; i++) {
					if (get(i) < a) {
						continue;
					}
					System.out.println(i);
					break;
				}

			} else {
				return;
			}

		}

	}

	public static int get(int i) {
		if (i > 2) {
			return get(i - 1) + get(i - 2);
		}

		return 1;
	}

}