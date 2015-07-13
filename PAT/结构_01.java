package BASE;

import java.util.Scanner;

public class ½á¹¹_01 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		String s1 = cin.next();
		String[] s1s = s1.split("/");
		String s2 = cin.next();
		String[] s2s = s2.split("/");
		if ((double) Integer.valueOf(s1s[0]) / Integer.valueOf(s1s[1]) > (double) Integer
				.valueOf(s2s[0]) / Integer.valueOf(s2s[1])) {
			System.out.println("" + s1 + " > " + s2 + "");
		} else if ((double) Integer.valueOf(s1s[0]) / Integer.valueOf(s1s[1]) < (double) Integer
				.valueOf(s2s[0]) / Integer.valueOf(s2s[1])) {
			System.out.println("" + s1 + " < " + s2 + "");
		} else {
			System.out.println("" + s1 + " = " + s2 + "");
		}
	}

}