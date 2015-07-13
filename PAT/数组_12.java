package BASE;

import java.util.Scanner;

public class 数组_12 {

	public static void main(String[] args) {
		int x1, y1 , x2 , y2 ;
		int count = 0;// 错误次数
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		char[][] array = new char[10][10];
		for (int i = 0; i < 2 * N; i++) {
			for (int j = 0; j < 2 * N; j++) {
				array[i][j] = cin.next().charAt(0);
			}
		}
		int letterLeft = 4*N*N;
		int K = cin.nextInt();
		for (int i = 0; i < K; i++) {
			x1 = cin.nextInt();
			y1 = cin.nextInt();
			x2 = cin.nextInt();
			y2 = cin.nextInt();

			if ((array[x1 - 1][y1 - 1] == array[x2 - 1][y2 - 1])
					&& (array[x1 - 1][y1 - 1] <= 'Z' && array[x1 - 1][y1 - 1] >= 'A')) {
				array[x1 - 1][y1 - 1] = '*';
				array[x2 - 1][y2 - 1] = '*';
				letterLeft = letterLeft - 2;

			} else {
				System.out.printf("Uh-oh\n");
				count++;
				continue;
			}

			if (count == 3) {
				System.out.printf("Game Over\n");
				System.exit(0);
			}

			if (letterLeft == 0) {
				System.out.printf("Congratulations!\n");
				System.exit(0);
			}

			for (int j = 0; j < 2 * N; j++) {
				for (int k = 0; k < 2 * N - 1; k++)
					System.out.printf("%c ", array[j][k]);
				System.out.printf("%c\n", array[j][2 * N - 1]);
			}

		}
	}

}