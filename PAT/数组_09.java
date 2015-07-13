package BASE;

import java.util.Scanner;

public class สýื้_09 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int m = cin.nextInt();
		int n = cin.nextInt();
		int[][] a = new int[20][20];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = cin.nextInt();
			}
		}
		int flag = 0;
		for (int i = 1; i < m - 1; i++) {
			for (int j = 1; j < n - 1; j++) {
				if (a[i][j] > a[i][j - 1] && a[i][j] > a[i][j + 1]
						&& a[i][j] > a[i - 1][j] && a[i][j] > a[i + 1][j]) {
					System.out.printf("%d %d %d\n", a[i][j], i + 1, j + 1);
					flag = 1;
				}
			}
		}

		if (flag == 0) {
			System.out.printf("None %d %d", m, n);
		}

	}
}