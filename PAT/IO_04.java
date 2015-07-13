package BASE;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IO_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextFloat();
		int b = scanner.nextInt();
		String c = scanner.next();
		char d = c.charAt(0);
		double e = scanner.nextFloat();
		
		DecimalFormat decimalFormat = new DecimalFormat("##.00");
		String format = decimalFormat.format(a);
		String format1 = decimalFormat.format(e);
		System.out.println(d+" "+b+" "+format+" "+format1);
	

		scanner.close();
	}
}
