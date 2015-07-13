package BASE;

import java.util.Scanner;

public class สýื้_06 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N1 = cin.nextInt();
		int[] number1 = new int[20];
		int[] number2 = new int[20];
		int[] result = new int[20];
		int s = 0;
		for (int i = 0; i < N1; i++) {
			number1[i] = cin.nextInt();
		}
		int N2 = cin.nextInt();
		for (int i = 0; i < N2; i++) {
			number2[i] = cin.nextInt();
		}
		int i = 0;
		for (; i < N1; i++) {
			boolean flag = false;
			for (int j = 0; j < N2; j++) {
				if (number1[i] == number2[j]) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				boolean f = true;
				for (int j = 0; j < s; j++) {
					if (number1[i] == result[j]) {
						f = false;

						break;
					}

				}
				if (f) {
					result[s] = number1[i];
					s++;
				}

			}

		}
		i = 0;
		for (; i < N2; i++) {
			boolean flag = false;
			for (int j = 0; j < N1; j++) {
				if (number2[i] == number1[j]) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				boolean f = true;
				for (int j = 0; j < s; j++) {
					if (number2[i] == result[j]) {
						f = false;

						break;
					}

				}
				if (f) {
					result[s] = number2[i];
					s++;
				}

			}

		}
		for (i = 0; i < s; i++) {
			if (i != s - 1) {

				System.out.print(result[i] + " ");
			} else {
				System.out.println(result[i]);
			}
		}
	}

}