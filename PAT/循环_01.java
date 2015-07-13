package BASE;

import java.util.Scanner;

public class Ñ­»·_01 {

	private static int a;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int sum = 0;
		int count = 0;
		for (int i = a; i <= b; i++) {
			System.out.printf("%5d", i);
			sum += i;
			count++;
			if (count % 5 == 0 && i != b) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.print("Sum = " + sum);
	}
}
