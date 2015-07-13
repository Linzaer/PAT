package BASE;

import java.util.Scanner;

public class Ñ­»·_28 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int sum = 0;
			int n = scanner.nextInt();
			for (int i = 1; i <= n; i++) {
				if(i==1){
					sum+=2;
				}else {
					
					sum += Math.pow(2, i);
				}
			}

			System.out.printf("sum = %d", sum);
		}

	}
}