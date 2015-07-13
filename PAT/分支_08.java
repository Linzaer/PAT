package BASE;

import java.util.Scanner;

public class ∑÷÷ß_08 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			String input = s.nextLine();
			if (input.split(" ").length == 2) {

				int a = Integer.parseInt(input.split(" ")[0]);
				int b = Integer.parseInt(input.split(" ")[1]);
				double c = (a-b)*100.0/b;
				if(c<10){
					System.out.println("OK");
				}else if(c>=10&&c<50){
					System.out.println("Exceed "+Math.round(c)+"%. Ticket 200");
				}else {
					System.out.println("Exceed "+Math.round(c)+"%. License Revoked");
				}

			}

		}
	}
}