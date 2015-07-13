package BASE;

import java.util.Scanner;

public class ×Ö·û´®_05 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int a = scanner.nextInt();
		int b = a % s.length();
		String s1 = s.substring(0, b);
		String s2 = s.substring(b, s.length());
		System.out.println(s2+s1);
	}
}
