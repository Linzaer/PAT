package BASE;

import java.util.Scanner;
import java.util.Stack;

public class ×Ö·û´®_07_2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuffer tmp = new StringBuffer();
		boolean flag = false;
		Stack<String> stack = new Stack<String>();
		while (true) {
			char[] a = scanner.nextLine().trim().toCharArray();
			for (int i = 0; i < a.length; i++) {
				if (a[i] != ' ' && i == a.length - 1) {
					tmp.append(a[i]);
					stack.push(tmp.toString());
					tmp.delete(0, tmp.length());
				} else if (a[i] != ' ') {
					tmp.append(a[i]);
					flag = false;
				} else {
					if (!flag) {

						stack.push(tmp.toString());
						tmp.setLength(0);
						flag = true;
					}
				}
			}

			while (!stack.empty()) {

				System.out.print(stack.peek());

				stack.pop();
				if (!stack.empty()) {

					System.out.print(" ");
				}

			}

		}
	}
}
