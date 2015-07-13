package BASE;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ∑÷÷ß_17 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int[] score = new int[1000];
		int[] grade = new int[5];
		DecimalFormat decimalFormat = new DecimalFormat("#0.00");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			score[i] = scanner.nextInt();
			if (score[i] < 60) {
				grade[4]++;
			} else if (score[i] < 70) {
				grade[3]++;
			} else if (score[i] < 80) {
				grade[2]++;
			} else if (score[i] < 90) {
				grade[1]++;
			} else {
				grade[0]++;
			}
		}

		for (int i = 0; i < grade.length; i++) {
			if (i == grade.length - 1) {
				System.out.print(grade[i]);
			} else {
				System.out.print(grade[i] + " ");
			}
		}

	}
}