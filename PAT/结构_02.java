package BASE;

import java.util.Scanner;

class Rational {
	int n; /* 分子 */
	int d; /* 分母 */
}

public class 结构_02 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		String str = cin.nextLine();
		String[] strs = str.split(" ");
		String[] StringNums1 = strs[0].split("/");
		String[] StringNums2 = strs[1].split("/");
		int[] IntNums = new int[4];
		IntNums[0] = Integer.parseInt(StringNums1[0]);
		IntNums[1] = Integer.parseInt(StringNums1[1]);
		IntNums[2] = Integer.parseInt(StringNums2[0]);
		IntNums[3] = Integer.parseInt(StringNums2[1]);
		Rational r = new Rational();
		r.n = IntNums[0] * IntNums[3] + IntNums[1] * IntNums[2];
		r.d = IntNums[1] * IntNums[3];
		int g = getMaxNumber(r.n, r.d);
		r.n /= g;
		r.d /= g;
		if (r.d == 1) {
			System.out.println(r.n);
		} else {
			System.out.println(r.n + "/" + r.d);
		}

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