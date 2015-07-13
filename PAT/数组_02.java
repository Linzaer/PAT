package BASE;

import java.util.Scanner;

public class สýื้_02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int b = scanner.nextInt();
		int[][] a = new int[10][10];
		for (int i = 0; i < b; i++) {
			a[i][0] = 1;
			a[i][i] = 1;
		}

		for (int j = 2; j < b; j++) {
			for (int k = 1; k < j; k++) {
				a[j][k] = a[j - 1][k - 1] + a[j - 1][k];
			}
		}

		for (int m = 0; m < b; m++) {
			for (int l = 1; l < b - m; l++) {
				System.out.print(" ");
			}
			for (int u = 0; u <= m; u++) {
				System.out.printf("%4d", a[m][u]);
			}
			System.out.print("\n");
		}
	}

}