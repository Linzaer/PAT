package BASE;

import java.util.Scanner;

public class ×Ö·û´®_03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String tmp;
		String[] s = new String[a + 1];
		for (int i = 0; i <= a; i++) {
			s[i] = scanner.nextLine();

		}

		for (int j = 0; j < b; j++) {

			for (int i = 0; i < a - j; i++) {
				if (s[i].compareTo(s[i + 1]) > 0) {
					tmp = s[i];
					s[i] = s[i + 1];
					s[i + 1] = tmp;
				}
			}
		}

		for (int i = 1; i < s.length; i++) {
			if (i == s.length - 1) {
				System.out.print(s[i]);
			} else {
				System.out.println(s[i]);
			}
		}

	}
}
