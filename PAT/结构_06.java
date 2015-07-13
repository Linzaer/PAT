package BASE;

import java.util.Scanner;

class COMPLEX {
	double realPart;
	double imaginaryPart;

	public COMPLEX(double realPart, double imaginaryPart) {
		super();
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}

}

public class 结构_06 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		double a1 = cin.nextDouble();
		double b1 = cin.nextDouble();
		double a2 = cin.nextDouble();
		double b2 = cin.nextDouble();
		COMPLEX a = new COMPLEX(a1, b1);
		COMPLEX b = new COMPLEX(a2, b2);
		/* 加法 */
		printComplex(a);
		System.out.printf(" + ");
		printComplex(b);
		System.out.printf(" = ");
		COMPLEX c = addComplex(a, b);
		printResult(c);
		/* 减法 */
		printComplex(a);
		System.out.printf(" - ");
		printComplex(b);
		System.out.printf(" = ");
		c = subComplex(a, b);
		printResult(c);
		/* 乘法 */
		printComplex(a);
		System.out.printf(" * ");
		printComplex(b);
		System.out.printf(" = ");
		c = mulComplex(a, b);
		printResult(c);
		/* 除法 */
		printComplex(a);
		System.out.printf(" / ");
		printComplex(b);
		System.out.printf(" = ");
		c = divComplex(a, b);
		printResult(c);

	}

	static void printComplex(COMPLEX c) {
		if (c.imaginaryPart >= 0)
			System.out.printf("(%.1f+%.1fi)", c.realPart, c.imaginaryPart);
		if (c.imaginaryPart < 0)
			System.out.printf("(%.1f%.1fi)", c.realPart, c.imaginaryPart);
	}

	static void printResult(COMPLEX c) {
		if (c.realPart == 0 && c.imaginaryPart == 0) {
			System.out.printf("%.1f\n", c.realPart);
		} else if (c.realPart == 0)
			System.out.printf("%.1fi\n", c.imaginaryPart);
		else if (c.imaginaryPart < 0)
			System.out.printf("%.1f%.1fi\n", c.realPart, c.imaginaryPart);
		else if (c.imaginaryPart == 0)
			System.out.printf("%.1f\n", c.realPart);
		else

			System.out.printf("%.1f+%.1fi\n", c.realPart, c.imaginaryPart);
	}

	static COMPLEX addComplex(COMPLEX x, COMPLEX y) {

		double realPart = x.realPart + y.realPart;

		if (Math.abs(realPart) < 0.05)
			realPart = 0;

		double imaginaryPart = x.imaginaryPart + y.imaginaryPart;

		if (Math.abs(imaginaryPart) < 0.05)
			imaginaryPart = 0;

		return new COMPLEX(realPart, imaginaryPart);
	}

	static COMPLEX subComplex(COMPLEX x, COMPLEX y) {

		double realPart = x.realPart - y.realPart;

		if (Math.abs(realPart) < 0.05)
			realPart = 0;

		double imaginaryPart = x.imaginaryPart - y.imaginaryPart;
		if (Math.abs(imaginaryPart) < 0.05)
			imaginaryPart = 0;

		return new COMPLEX(realPart, imaginaryPart);
	}

	static COMPLEX mulComplex(COMPLEX x, COMPLEX y) {

		double realPart = x.realPart * y.realPart - x.imaginaryPart
				* y.imaginaryPart;

		if (Math.abs(realPart) < 0.05)
			realPart = 0;
		double imaginaryPart = x.realPart * y.imaginaryPart + x.imaginaryPart
				* y.realPart;
		if (Math.abs(imaginaryPart) < 0.05)
			imaginaryPart = 0;
		return new COMPLEX(realPart, imaginaryPart);
	}

	static COMPLEX divComplex(COMPLEX x, COMPLEX y) {

		double denominator = y.realPart * y.realPart + y.imaginaryPart
				* y.imaginaryPart;
		double realPart = (x.realPart * y.realPart + x.imaginaryPart
				* y.imaginaryPart)
				/ denominator;
		if (Math.abs(realPart) < 0.05)
			realPart = 0;
		double imaginaryPart = (x.imaginaryPart * y.realPart - x.realPart
				* y.imaginaryPart)
				/ denominator;
		if (Math.abs(imaginaryPart) < 0.05)
			imaginaryPart = 0;
		return new COMPLEX(realPart, imaginaryPart);
	}
}