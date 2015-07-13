package BASE;

import java.util.Scanner;

public class Ñ­»·_17 {

	private static int number = 0;
	private static int sum = 0;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int sum  = 1;
			int N = scanner.nextInt();
			for (int i = 1; i < N; i++) {
				sum = (sum+1)*2;
			}
			System.out.println(sum);
		}
		
		
	}


}