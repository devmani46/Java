package finalExam;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		while(true) {
			
	
		Scanner sc = new Scanner(System.in);
		System.out.println("[1]NRP to USD");
		System.out.println("[2]USD to NPR");
		System.out.print("Select(1/2):");
		int select = sc.nextInt();
		int i = 0,j=0;
		switch(select) {
		case 1:
			System.out.println("NRP \t USD");
			for(i = 1000;i<=9000;i+=1000) {
				System.out.println(i +"\t"+ (i/125));
			}
			break;
		case 2:
			System.out.println("USD \t NPR");
			for(j=100;j<=900;j+=100) {
				
				System.out.println(j +"\t"+ (j*125) );
			}
			break;
		}
		nprToMyr(i);
		usdToNpr(j);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Do You want to continue?[y/n]");
		String q = sc1.nextLine().toLowerCase();
		if(q.equals("y")||q.equals("yes")) {
			continue;
		}
		else if(q.equals("n")||q.equals("no")){
			break;
		}
		else {
			System.out.println("Please enter y/yes or n/no");	
			break;
		}
		}
		
		
	}
	

	public static double nprToMyr(double npr) {

		return npr;
	}
	
	public static double usdToNpr(double usd) {
		
		return usd;

	}
}
