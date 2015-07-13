package BASE;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IO_03 {
	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat("##0.0");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int sum = a+b+c+d;
		float ave = (float)sum/4;
		String e = decimalFormat.format(ave);
		System.out.println("Sum = "+sum+"; Average = "+e+"");
		
		scanner.close();
	}
}
