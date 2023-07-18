package practice;

import java.util.Random;
import java.util.Scanner;

public class sampleMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Your Phone Number:");
		String num = sc.nextLine();					// used string because phone number cannot be changed.
		
		Random rd = new Random();
		int id = rd.nextInt(1,999);			// generates random from 1 to 999
		
		
        System.out.println("Select the package you want: "); 
        System.out.println("Full Day");
        System.out.println("One Night");
        System.out.println("Office Hours");
        System.out.println("Full Week");
        String pack = sc.nextLine();
  
        Scanner sca = new Scanner(System.in);
        if(pack.equals("full day")||pack.equals("one night")||pack.equals("office hours")||pack.equals("full week")) {
        System.out.print("Are you a student: (Y/N)");
        String std = sca.nextLine().toLowerCase();
        String college = "";
        if(std.equals("yes") || std.equals("y")) {
        	System.out.println("Enter your college name: ");
        	college = sca.nextLine();
        }
        
        
        System.out.println("Name: " + name );
        System.out.println("Mobile no: " + num);
        System.out.println("Parking ID: " + id);
        
        System.out.println("Student (Y/N): " + std);
        
        
        switch(pack) {
        case "full day":
        	if (std.equals("no")||std.equals("n")) {
        		 System.out.println("Service Name :" + pack);
        		System.out.println("Day Fee: Rs400");
        	}
        	else if(std.equals("yes")||std.equals("y")) {
        		System.out.println("College name:"+college);
        		 System.out.println("Service Name :" + pack);
                System.out.println("Day Fee: Rs200");
        	}
        	else {
        		System.out.println("Enter y/yes or n/no.");
        	}
        	break;
        case "one night":
        	if (std.equals("no")||std.equals("n")) {
        		 System.out.println("Service Name :" + pack);
        		System.out.println("Day Fee: Rs500");
        	}
        	else if(std.equals("yes")||std.equals("y")) {
        		System.out.println("College name:"+college);
        		 System.out.println("Service Name :" + pack);
                System.out.println("Day Fee: Rs400");
        	}
        	else {
        		System.out.println("Enter y/yes or n/no.");
        	}
        	break;
        case "office hour":
        	if (std.equals("no")||std.equals("n")) {
        		 System.out.println("Service Name :" + pack);
        		System.out.println("Day Fee: Rs200");
        	}
        	else if(std.equals("yes")||std.equals("y")) {
        		System.out.println("College name:"+college);
        		 System.out.println("Service Name :" + pack);
                System.out.println("Day Fee: Rs100");
        	}
        	else {
        		System.out.println("Enter y/yes or n/no.");
        	}
        	break;
        case "full week":
        	if (std.equals("no")||std.equals("n")) {
        		 System.out.println("Service Name :" + pack);
        		System.out.println("Day Fee: Rs2000");
        	}
        	else if(std.equals("yes")||std.equals("y")) {
        		System.out.println("College name:"+college);
        		 System.out.println("Service Name :" + pack);
                System.out.println("Day Fee: Rs1000");
        	}
        	else {
        		System.out.println("Enter y/yes or n/no.");
        	}
        	break;
        default:
        	System.out.println("Wrong inputs, Please input valid informations");
        }
        }
        else {
        	System.out.println("Select among (full day/ full week/ one night/ office hour)");
        	
        }
        sc.close();
        sca.close();

	}

}
