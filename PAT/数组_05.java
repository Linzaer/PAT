package BASE;

import java.util.Scanner;

public class สýื้_05 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String str = cin.nextLine();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '#') {
				break;
			}
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				sb.append((char) (str.charAt(i) + 'A' - 'a'));
			} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				sb.append((char) (str.charAt(i) + 'a' - 'A'));
			} else {
				sb.append(str.charAt(i));
			}
		}
		System.out.print(sb);
	}

}