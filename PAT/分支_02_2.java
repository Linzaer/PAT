package BASE;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ·ÖÖ§_02_2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while (true) {
			String input = s.nextLine();
			if (input.split(" ").length == 6) {
				try {
					DecimalFormat fnum = new DecimalFormat("##0.00");
					float x1 = Float.parseFloat(input.split(" ")[0]);
					float y1 = Float.parseFloat(input.split(" ")[1]);
					float x2 = Float.parseFloat(input.split(" ")[2]);
					float y2 = Float.parseFloat(input.split(" ")[3]);
					float x3 = Float.parseFloat(input.split(" ")[4]);
					float y3 = Float.parseFloat(input.split(" ")[5]);
					if (x1 >= -100 && x1 <= 100 && x2 >= -100 && x2 <= 100
							&& x3 >= -100 && x3 <= 100 && y1 >= -100
							&& y1 <= 100 && y2 >= -100 && y2 <= 100
							&& y3 >= -100 && y3 <= 100) {
						if ((x1 == x2 && x1 == x3) || (y1 == y2 && y1 == y3)) {
							System.out.println("Impossible");
						} else if ((x1 == x2 && x1 != x3)
								|| (x1 == x3 && x1 != x3)
								|| (y1 == y2 && y1 != y3)
								|| (y1 == y3 && y1 != x3)) {
							float L = (float) Math.sqrt((y2 - y1) * (y2 - y1)
									+ (x2 - x1) * (x2 - x1))
									+ (float) Math.sqrt((y3 - y1) * (y3 - y1)
											+ (x3 - x1) * (x3 - x1))
									+ (float) Math.sqrt((y2 - y3) * (y2 - y3)
											+ (x2 - x3) * (x2 - x3));
							float A = (float) (0.5 * (x1 * y2 + x2 * y3 + x3
									* y1 - x1 * y3 - x2 * y1 - x3 * y2));
							System.out.println("L = " + fnum.format(L)
									+ ", A = " + fnum.format(Math.abs(A)));
						} else {
							float k1 = (y1 - y2) / (x1 - x2);
							float k2 = (y1 - y3) / (x1 - x3);
							if (k1 == k2) {
								System.out.println("Impossible");
							} else {
								float L = (float) Math.sqrt((y2 - y1)
										* (y2 - y1) + (x2 - x1) * (x2 - x1))
										+ (float) Math.sqrt((y3 - y1)
												* (y3 - y1) + (x3 - x1)
												* (x3 - x1))
										+ (float) Math.sqrt((y2 - y3)
												* (y2 - y3) + (x2 - x3)
												* (x2 - x3));
								float A = (float) (0.5 * (x1 * y2 + x2 * y3
										+ x3 * y1 - x1 * y3 - x2 * y1 - x3 * y2));
								System.out.println("L = " + fnum.format(L)
										+ ", A = " + fnum.format(Math.abs(A)));
							}
						}

					} else {
						System.out.println("Impossible");
					}
				} catch (NumberFormatException e) {
				}
			}
			break;
		}

	}
}