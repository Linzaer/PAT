package BASE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ñ­»·_23 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (0 < a && a <= 10000 && 0 < b && b <= 10000 && a <= b) {
				for (int i = a; i <= b; i++) {
					if (i < 26 && i > 7) {
						continue;
					} else if (i > 30 && i < 494) {
						continue;

					} else if (i < 8100 && i > 500) {
						continue;
					} else if (i > 8129) {

						continue;
					}
					check(i);
				}
			} else {
				return;
			}
		}
	}

	private static void check(int i) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		for (int j = 2, l = (int) Math.sqrt(i); j <= l; j++) {
			if (i % j == 0) {
				list.add(j);
				list.add(i / j);
			}
		}
		int sum = 0;
		for (int j : list) {
			sum += j;
		}

		Collections.sort(list);

		if (sum == i) {
			System.out.print(i + " = ");
			for (int j = 0; j < list.size(); j++) {
				if (j == list.size() - 1) {
					System.out.print(list.get(j));
				} else {
					System.out.print(list.get(j) + " + ");
				}
			}
			System.out.println();
		}
	}
}