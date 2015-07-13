package BASE;
import java.util.Scanner;

public class Ñ­»·_20 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int num = cin.nextInt();
		int n = cin.nextInt();
		int count = 0;
		while (cin.hasNext()) {
			count++;
			int nextNum = cin.nextInt();
			if (count > n || nextNum < 0) {
				System.out.println("Game Over");
				break;
			} else {
				if (nextNum > num) {
					System.out.println("Too big");
				} else if (nextNum < num) {
					System.out.println("Too small");
				} else if (nextNum == num && count == 1) {
					System.out.println("Bingo!");
					break;
				} else if (nextNum == num && count <= 3) {
					System.out.println("Lucky You!");
					break;
				} else {
					System.out.println("Good Guess!");
					break;
				}
			}
		}
	}
}