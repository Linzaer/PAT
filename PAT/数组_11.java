package BASE;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class สýื้_11 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int count = 0;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			arrayList.add(new Integer(i + 1));
		}
		System.out.print(getLast(arrayList, count).get(0));
	}

	public static ArrayList<Integer> getLast(ArrayList<Integer> arrayList,
			int count) {
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		Iterator<Integer> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			count++;
			int s = iterator.next();
			if (count % 3 != 0) {
				arrayList1.add(s);
			} else {
				count = 0;
			}
		}
		if (arrayList1.size() > 1) {
			return getLast(arrayList1, count);
		}
		return arrayList1;
	}
}