package practice;

import java.util.Random;
import java.util.Scanner;

public class sample4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Your Phone Number:");
		String num = sc.nextLine();
		
		Random randomName = new Random();
		int ID = randomName.nextInt(1,999);
		
		Scanner sc1 = new Scanner(System.in);
        System.out.println("Select the package you want: "); 
        System.out.println("Full Day");
        System.out.println("One Night");
        System.out.println("Office Hours");
        System.out.println("Full Week");
        String pkg = sc1.nextLine();
  

        if(pkg.equals("full day")||pkg.equals("one night")||pkg.equals("office hours")||pkg.equals("full week")) {
        System.out.print("Are you a student: (Y/N)");
        String std = sc1.nextLine().toLowerCase();
        String clz = "";
        if(std.equals("yes") || std.equals("y")) {
        	System.out.println("Enter your college name: ");
        	clz = sc1.nextLine();
        }
        
        
        System.out.println("Name: " + name );
        System.out.println("Mobile no: " + num);
        System.out.println("Parking ID: " + ID);
        
        System.out.println("Student (Y/N): " + std);
        
        
        switch(pkg) {
        case "full day":
        	if (std.equals("no")||std.equals("n")) {
        		 System.out.println("Service Name :" + pkg);
        		System.out.println("Day Fee: Rs400");
        	}
        	else if(std.equals("yes")||std.equals("y")) {
        		System.out.println("College name:"+clz);
        		 System.out.println("Service Name :" + pkg);
                System.out.println("Day Fee: Rs200");
        	}
        	else {
        		System.out.println("Enter y/yes or n/no.");
        	}
        	break;
        case "one night":
        	if (std.equals("no")||std.equals("n")) {
        		 System.out.println("Service Name :" + pkg);
        		System.out.println("Day Fee: Rs500");
        	}
        	else if(std.equals("yes")||std.equals("y")) {
        		System.out.println("College name:"+clz);
        		 System.out.println("Service Name :" + pkg);
                System.out.println("Day Fee: Rs400");
        	}
        	else {
        		System.out.println("Enter y/yes or n/no.");
        	}
        	break;
        case "office hour":
        	if (std.equals("no")||std.equals("n")) {
        		 System.out.println("Service Name :" + pkg);
        		System.out.println("Day Fee: Rs200");
        	}
        	else if(std.equals("yes")||std.equals("y")) {
        		System.out.println("College name:"+clz);
        		 System.out.println("Service Name :" + pkg);
                System.out.println("Day Fee: Rs100");
        	}
        	else {
        		System.out.println("Enter y/yes or n/no.");
        	}
        	break;
        case "full week":
        	if (std.equals("no")||std.equals("n")) {
        		 System.out.println("Service Name :" + pkg);
        		System.out.println("Day Fee: Rs2000");
        	}
        	else if(std.equals("yes")||std.equals("y")) {
        		System.out.println("College name:"+clz);
        		 System.out.println("Service Name :" + pkg);
                System.out.println("Day Fee: Rs1000");
        	}
        	else {
        		System.out.println("Enter y/yes or n/no.");
        	}
        	break;
        default:
        	System.out.println("Please input valid informations");
        }
        }
        else {
        	System.out.println("Please select (full day/ full week/ one night/ office hour)");
        	
        }

	}

}
