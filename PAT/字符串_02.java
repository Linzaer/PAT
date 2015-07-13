package BASE;

import java.util.Scanner;

public class ×Ö·û´®_02 {

	private static String c;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String b = scanner.nextLine();
		if (a.length() <= 80 && b.length() <= 80) {

			String temp = a;
			String result = a.replaceAll(b, "");
			while (!temp.equals(result)) {
				temp = result;
				result = result.replace(b, "");
			}
			System.out.println(temp);

		}
	}
}
