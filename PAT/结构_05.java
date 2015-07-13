package BASE;

import java.util.Scanner;

class Rational1 {
	int n; /* 分子 */
	int d; /* 分母 */
}

public class 结构_05 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		String str = cin.nextLine();
		String[] strs = new String[N];
		Rational1[] R = new Rational1[N];
		for (int i = 0; i < N; i++) {
			Rational1 r = new Rational1();
			strs[i] = cin.next();

			r.n = Integer.valueOf(strs[i].split("/")[0]);
			r.d = Integer.valueOf(strs[i].split("/")[1]);
			R[i] = r;

		}

		Rational1 r = new Rational1();
		r.n = 0;
		r.d = 1;
		for (int i = 0; i < N; ++i) {
			r.n = r.n * R[i].d + r.d * R[i].n;
			r.d = r.d * R[i].d;
		}
		r.d *= N; 
		int g = getMaxNumber(r.n, r.d);
		if (g != 0) {
			r.n /= g;
			r.d /= g;
		}
		if (r.n == 0)
			System.out.printf("%d\n", r.n);
		else if (r.d == 1)
			System.out.printf("%d\n", r.n);
		else
			System.out.printf("%d/%d\n", r.n, r.d);

	}

	public static int getMaxNumber(int a, int b) {
		int min = a;
		int g = 0;
		if (b < a) {
			min = b;
		}
		for (int i = min; i > 0; i--) {
			if (a % i == 0 && b % i == 0) {
				g = i;
				break;
			}
		}

		return g;
	}

}