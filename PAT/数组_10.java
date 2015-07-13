package BASE;

import java.util.Scanner;

public class สýื้_10 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = cin.nextInt();
		}
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				if (a[i] == a[j])
					b[i]++;
		int max = b[0], j = 0;
		for (int i = 0; i < N; i++)
			if (b[i] > max) {
				max = b[i];
				j = i;
			}
		System.out.printf("%d %d\n", a[j], max);
	}
}