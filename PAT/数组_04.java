package BASE;

import java.util.Scanner;

public class สýื้_04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int X = scanner.nextInt();
		int[] number = new int[20];
		for (int i = 0; i < N; i++) {
			number[i] = scanner.nextInt();
		}
		boolean flag = false;
		for (int i = 0; i < N; i++) {
			if (X == number[i]) {
				System.out.println(i);
				flag = true;
			}

		}
		if (!flag) {
			System.out.println("Not Found");
		}

	}

}