package BASE;

import java.math.BigDecimal;
import java.util.Scanner;

public class ∑÷÷ß_04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			String input = s.nextLine();
			if (input.split(" ").length == 2) {
				try {
					double aa = Double.parseDouble(input.split(" ")[0]);
					int b = Integer.parseInt(input.split(" ")[1]);
					double sum = 0;
					if (aa <= 3) {
						sum = 10;
					} else if (aa <= 10) {
						sum = 10 + (aa - 3) * 2;
					} else if (aa > 10) {
						sum = 10 + 14 + (aa - 10) * 3;
					}
					sum += ((b / 5) * 2);
					System.out.println(new BigDecimal(sum).setScale(0,
							BigDecimal.ROUND_HALF_UP));
					break;
				} catch (NumberFormatException e) {
				}
			}

		}
	}

}