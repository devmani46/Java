package practice;

import java.util.Scanner;

public class jfo6iii {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int columns = sc.nextInt();
        createRectangle(rows, columns);
    }
	    public static void createRectangle(int r, int c){
	        int i, j;
	        for (i = 1; i <= r; i++) {
	            for (j = 1; j <= c; j++) {
	                if (i == 1 || i == r || j == 1 || j == c)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }
	    }

	public static void createTriangle() {
		
	}
}