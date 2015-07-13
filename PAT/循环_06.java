package BASE;

import java.util.Scanner;

public class Ñ­»·_06 {

	private static int a;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String s = scanner.nextLine().trim();
			if (s.equals("")) {
				System.out.println(0);
			}else {
				
				String[] s1 = s.split(" +");
				System.out.println(s1.length);
			}

		}

	}

}