package practice;

import java.util.Scanner;

public class jfo6ii {

	public static void main(String[] args) {
		// Have the user enter a number, and then use a for loop to display all the multiples of that number from 1 to 12.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		for(int i=1;i<=12;i++) {
			System.out.println(num + "*" + i + "=" +num * i);
		}
		sc.close();
	}
}
