package BASE;

import java.util.Scanner;

public class Ñ­»·_24 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		while (true) {
			int n = scanner.nextInt();
			for (int i = 1; i <= n; i++) {
				int k = 1;
				for (int j = 1; j <=i; j++) {
					k*=j;
				}
				sum+=k;
			}
			
			System.out.println(sum);
		}

	}
}