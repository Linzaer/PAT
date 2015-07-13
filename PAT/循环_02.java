package BASE;

import java.util.Scanner;

public class Ñ­»·_02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double result = 0;
		double temp = 1;
		double fenzi = 1, fenmu = 1;
		double m = 1;
		while (temp >= a) {
			result += temp;
			fenzi *= m;
			fenmu *= (2 * (m + 1) - 1);
			m++;
			temp = fenzi / fenmu;
		}
		result += temp;
		System.out.printf("%.6f", result * 2);

	}
}
