package BASE;

import java.util.Scanner;

public class Ñ­»·_19 {

	private static int j;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String n = scanner.nextLine();
			char[] a = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };
			char[] b = { 'S', 'B', 'Q', 'W', 'Y' };
			StringBuffer stringBuffer = new StringBuffer();
			boolean flag = false;
			for (int i = 0, j = n.length(); i < n.length(); i++, j--) {
				if (n.charAt(i) == '0') {
					flag = true;
				}
				if (n.charAt(i) != '0' || n.length() == 1) {
					if (flag) {
						if (n.length() > 5) {
							stringBuffer.append(b[3]);
						}
						stringBuffer.append(a[0]);
						flag = false;
					}
					if (n.charAt(i) != '0') {
						stringBuffer.append(a[n.charAt(i) - '0']);
					}
					if (j == 9) {
						stringBuffer.append(b[4]);
					} else if (j == 8 || j == 4) {
						stringBuffer.append(b[2]);
					} else if (j == 7 || j == 3) {
						stringBuffer.append(b[1]);
					} else if (j == 6 || j == 2) {
						stringBuffer.append(b[0]);
					} else if (j == 5) {
						stringBuffer.append(b[3]);

					}
				}

			}
			System.out.println(stringBuffer.toString());
		}

	}
}