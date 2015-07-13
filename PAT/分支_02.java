package BASE;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ·ÖÖ§_02 {
	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat("###.00");
		Scanner scanner = new Scanner(System.in);
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int x3 = scanner.nextInt();
		int y3 = scanner.nextInt();
		double a =  Math.sqrt(Math.pow((x2*1.0 - x1*1.0), 2)
				+ Math.pow((y2*1.0 - y1*1.0), 2));
		double b =  Math.sqrt(Math.pow((x3*1.0 - x1*1.0), 2)
				+ Math.pow((y3*1.0 - y1*1.0), 2));
		double c =  Math.sqrt(Math.pow((x3*1.0 - x2*1.0), 2)
				+ Math.pow((y3*1.0 - y2*1.0), 2));
		double l = a + b + c;
		double P = l / 2;
		double s =  Math.sqrt(P * (P - a) * (P - b) * (P - c));

		if ((a + b) > c && (a + c) > b && (b + c) > a && Math.abs(a - b) < c
				&& Math.abs(a - c) < b && Math.abs(b - c) < a) {

			System.out.println("L = " + decimalFormat.format(a + b + c)
					+ ", A = " + decimalFormat.format(s) + "");
		} else {
			System.out.println("Impossible");

		}

		scanner.close();

	}
}
