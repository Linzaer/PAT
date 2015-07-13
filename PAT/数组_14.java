package BASE;

import java.util.Scanner;

public class สýื้_14 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		int a = (N / 1000) % 10;
		int b = (N / 100) % 10;
		int c = (N / 10) % 10;
		int d = N % 10;
		a = (a + 9) % 10;
		b = (b + 9) % 10;
		c = (c + 9) % 10;
		d = (d + 9) % 10;
		char[] ch = new char[4];
		ch[0] = (char) (c + '0'); 
		ch[1] = (char) (d + '0');
		ch[2] = (char) (a + '0');
		ch[3] = (char) (b + '0');
		System.out.printf("The encrypted number is %c%c%c%c\n", ch[0], ch[1],
				ch[2], ch[3]);

	}

}