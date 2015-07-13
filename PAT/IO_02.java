package BASE;

import java.util.Scanner;

public class IO_02 {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" * "+b+" = "+(a*b));
		System.out.println(a+" / "+b+" = "+(a/b));

		scanner.close();
	}
}
