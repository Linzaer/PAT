package BASE;

import java.util.Scanner;

public class สýื้_03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int[] number = new int[100];
		for (int i = 0; i < N; i++) {
			number[i] = scanner.nextInt();
		}
		int temp = 0;
		for (int i = 0; i < K; i++) {
			for (int j = 0; j < N - i - 1; j++) {
				if (number[j] > number[j + 1]) {
					temp = number[j];
					number[j] = number[j + 1];
					number[j + 1] = temp;
				}
			}

		}
		for (int i = 0; i < N; i++) {
			if (i != N - 1) {

				System.out.print(number[i] + " ");
			} else {
				System.out.print(number[i]);
			}
		}

	}

}