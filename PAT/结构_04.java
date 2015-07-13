package BASE;

import java.util.Scanner;

class Person {
	String name;
	String birthday;
	String sex;
	String gnum;
	String num;

}

public class ½á¹¹_04 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		Person[] p = new Person[n];
		for (int i = 0; i < n; i++) {
			Person person = new Person();
			person.name = cin.next();
			person.birthday = cin.next();
			person.sex = cin.next();
			person.gnum = cin.next();
			person.num = cin.next();
			p[i] = person;
		}
		int K = cin.nextInt();
		int[] number = new int[K];
		for (int i = 0; i < K; i++) {
			number[i] = cin.nextInt();
		}
		for (int i = 0; i < number.length; i++) {
			if (number[i] >= 0 && number[i] <= p.length - 1) {

				System.out.println(p[number[i]].name + " " + p[number[i]].gnum
						+ " " + p[number[i]].num + " " + p[number[i]].sex + " "
						+ p[number[i]].birthday);
			} else {
				System.out.println("Not Found");
			}
		}

	}

}