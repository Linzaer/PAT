package BASE;

import java.util.Scanner;

public class 数组_07 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		String[] number = new String[N];
		int[] a = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < N; i++) {
			number[i] = cin.nextInt() + "";
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < number[i].length(); j++) {

				switch (number[i].charAt(j) - '0') {
				case 0:
					a[0]++;
					break;
				case 1:
					a[1]++;
					break;
				case 2:
					a[2]++;
					break;
				case 3:
					a[3]++;
					break;
				case 4:
					a[4]++;
					break;
				case 5:
					a[5]++;
					break;
				case 6:
					a[6]++;
					break;
				case 7:
					a[7]++;
					break;
				case 8:
					a[8]++;
					break;
				case 9:
					a[9]++;
					break;
				default:
					break;
				}
			}
		}
		int[] max = new int[10];
		int nmax = 0;
		int numOfMax = 0;
		// 遍历count[]，找出最大值，并且存入max[]
		max[0] = -1;
		for (int i = 0; i < 10; i++) {
			if (a[i] > numOfMax) {
				nmax = 0;
				numOfMax = a[i];
				max[nmax] = i;
			} else if (a[i] == numOfMax) {
				nmax++;
				max[nmax] = i;
			}
		}

		System.out.print(numOfMax + ":");
		for (int i = 0; i < nmax+1; i++) {
			System.out.print(" " + max[i]);
		}

	}
}