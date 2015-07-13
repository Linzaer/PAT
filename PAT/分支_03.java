package BASE;

import java.util.Scanner;

public class ∑÷÷ß_03 {
	public static void main(String[] args) {
		int day ;
		int surplus;
		Scanner scanner = new Scanner(System.in);
		while(true){
			
			 day = scanner.nextInt();
			  surplus = day%5;
			  if(surplus==0||surplus==4){
				  System.out.println("Drying in day "+day+"");
			  }else{
				  System.out.println("Fishing in day "+day+"");
				  
			  }
		}
		


	}
}
