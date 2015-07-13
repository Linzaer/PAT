package BASE;

import java.util.Scanner;

public class Ñ­»·_08 {

	private static double a3;
	private static double a2;
	private static double a1;
	private static double a0;
	private static double a;
	private static double b;
	static double intervel = 0;
	static double midvalue = 0;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			a3 = scanner.nextDouble();
			a2 = scanner.nextDouble();
			a1 = scanner.nextDouble();
			a0 = scanner.nextDouble();
			a = scanner.nextDouble();
			b = scanner.nextDouble();
			do {
				midvalue = (a + b) / 2;
				if (GetValue(a) * GetValue(b) < 0) {
					if (GetValue(midvalue) == 0) {
						System.out.printf("%.2f", midvalue);
						return;
					} else {

						if (GetValue(a) * GetValue(midvalue) > 0) {
							a = midvalue;
							intervel = Math.abs(a - b);
							continue;
						}
						if (GetValue(b) * GetValue(midvalue) > 0) {
							b = midvalue;
							intervel = Math.abs(a - b);
							continue;
						}
					}
				}
				if (GetValue(a) == 0) {
					System.out.printf("%.2f", a);
					return;
				}

				if (GetValue(b) == 0) {
					System.out.printf("%.2f", b);
					return;
				}
			} while (intervel > 0.0001);
			System.out.printf("%.2f", midvalue);
		}
	}

	public static double GetValue(double x) {
		return (a3 * Math.pow(x, 3) + a2 * Math.pow(x, 2) + a1 * x + a0);
	}
}