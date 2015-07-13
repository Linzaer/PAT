package BASE;

import java.util.Scanner;

public class สýื้_08 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String s = cin.nextLine();
		int sum = 0;
		boolean flag = false, f = false;
		for (int i = 0; s.charAt(i) != '#'; ++i) {
			if (s.charAt(i) == '-' && !flag)
				f = true;
			else if (s.charAt(i) <= '9' && s.charAt(i) >= '0') {
				sum = sum * 16 + s.charAt(i) - '0';
				flag = true;
			} else if (s.charAt(i) <= 'f' && s.charAt(i) >= 'a') {
				sum = sum * 16 + s.charAt(i) - 'a' + 10;
				flag = true;
			} else if (s.charAt(i) <= 'F' && s.charAt(i) >= 'A') {
				sum = sum * 16 + s.charAt(i) - 'A' + 10;
				flag = true;
			}
		}
		if (f)
			sum = -sum;
		System.out.println(sum);
	}
}