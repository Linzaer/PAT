package BASE;

import java.util.Scanner;

public class ×Ö·û´®_07 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String a = scanner.nextLine().trim();
			String[] b = a.split(" +");
			for (int i = b.length - 1; i >= 0; --i) {
				System.out.print(b[i]);
				if (i != 0) {
					System.out.print(" ");
				}
			}
		}
	}
}
