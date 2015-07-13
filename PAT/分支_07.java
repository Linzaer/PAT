package BASE;

import java.util.Scanner;

public class ·ÖÖ§_07 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			String input = s.nextLine();
			if (input.split(" ").length == 3) {

				int a = Integer.parseInt(input.split(" ")[0]);
				int b = Integer.parseInt(input.split(" ")[1]);
				int c = Integer.parseInt(input.split(" ")[2]);
				int [] array ={a,b,c} ;
				
				for (int i = 0; i < array.length; i++) {
					for (int j = i+1; j < array.length; j++) {
						if(array[i]>array[j]){
							int temp = array[i];
							array[i] = array[j];
							array[j] = temp;
						}
					}
				}
				
				System.out.println(""+array[0]+"->"+array[1]+"->"+array[2]+"");

			}

		}
	}

}