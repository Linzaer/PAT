package BASE;

import java.math.BigInteger;
import java.util.Scanner;

public class ×Ö·û´®_06 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String s1 = s.substring(0, 8);
		String s2 = s.substring(8, 16);
		String s3 = s.substring(16, 24);
		String s4 = s.substring(24, 32);
		BigInteger bigInteger = new BigInteger(s1, 2);
		BigInteger bigInteger1 = new BigInteger(s2, 2);
		BigInteger bigInteger2 = new BigInteger(s3, 2);
		BigInteger bigInteger3 = new BigInteger(s4, 2);
		System.out.printf("%s.%s.%s.%s",bigInteger,bigInteger1,bigInteger2,bigInteger3);

	}
}
