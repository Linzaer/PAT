package BASE;

import java.util.Scanner;

public class Ñ­»·_16 {

	private static int number = 0;
	private static int sum = 0;
	private static char[] s1s;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			boolean flag = false;
			String s = scanner.nextLine();
			s1s = s.toCharArray();
			int a = 0, sum = 0;
			char c = ' ';
			for (int i = 0; i < s1s.length; i++) {
				if (i < s1s.length - 1
						&& flag
						&& s1s[i] != '='
						&& (s1s[i] == '+' || s1s[i] == '-' || s1s[i] == '*' || s1s[i] == '/')) {

					if (c == ' ')
						sum = a;
					else if (c == '+')
						sum += a;
					else if (c == '-')
						sum -= a;
					else if (c == '*')
						sum *= a;
					else if (c == '/')
						if (a == 0) {
							System.out.println("ERROR");
							break;
						} else
							sum /= a;
					a = 0;
					c = s1s[i];
					flag = false;

				} else if (i < s1s.length - 1 && s1s[i] >= '0' && s1s[i] <= '9') {
					a = a * 10 + s1s[i] - '0';
					flag = true;
				} else if (i == s1s.length - 1 && s1s[i] == '=' && flag) {
					if (c == ' ')
						sum = a;
					else if (c == '+')
						sum += a;
					else if (c == '-')
						sum -= a;
					else if (c == '*')
						sum *= a;
					else if (c == '/')
						if (a == 0) {
							System.out.println("ERROR");
							break;
						} else
							sum /= a;
					System.out.println((int) sum);
				} else {
					System.out.println("ERROR");
					break;
				}
			}
		}

	}

}