package practice;

import java.util.Random;
import java.util.Scanner;

public class sampleR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Your Phone Number:");
		String num = sc.nextLine();				
		Random rnd = new Random();
		int ID = rnd.nextInt(1,999);			
		
		Scanner sca = new Scanner(System.in);
        System.out.println("Select the package you want: "+"\n"+"Full Day"+"\n"+"One Night"+"\n"+"Office Hours"+"\n"+"Full Week"); 

        String pkge = sca.nextLine();
  

        if(pkge.equals("full day")||pkge.equals("one night")||pkge.equals("office hours")||pkge.equals("full week")) {
        System.out.print("Are you a student: (Y/N)");
        String std = sca.nextLine().toLowerCase();
        String college = "";
        if(std.equals("yes") || std.equals("y")) {
        	System.out.println("Enter your college name: ");
        	college = sca.nextLine();
        }
        
        
        System.out.println("Name: " + name );
        System.out.println("Mobile no: " + num);
        System.out.println("Parking ID: " + ID);
        
        System.out.println("Student (Y/N): " + std);
        
        
        switch(pkge) {
        case "full day":
        	if (std.equals("no")||std.equals("n")) {
        		 System.out.println("Service Name :" + pkge);
        		System.out.println("Day Fee: Rs400");
        	}
        	else if(std.equals("yes")||std.equals("y")) {
        		System.out.println("College name:"+college);
        		 System.out.println("Service Name :" + pkge);
                System.out.println("Day Fee: Rs200");
        	}
        	else {
        		System.out.println("Enter y/yes or n/no.");
        	}
        	break;
        case "one night":
        	if (std.equals("no")||std.equals("n")) {
        		 System.out.println("Service Name :" + pkge);
        		System.out.println("Day Fee: Rs500");
        	}
        	else if(std.equals("yes")||std.equals("y")) {
        		System.out.println("College name:"+college);
        		 System.out.println("Service Name :" + pkge);
                System.out.println("Day Fee: Rs400");
        	}
        	else {
        		System.out.println("Enter y/yes or n/no.");
        	}
        	break;
        case "office hour":
        	if (std.equals("no")||std.equals("n")) {
        		 System.out.println("Service Name :" + pkge);
        		System.out.println("Day Fee: Rs200");
        	}
        	else if(std.equals("yes")||std.equals("y")) {
        		System.out.println("College name:"+college);
        		 System.out.println("Service Name :" + pkge);
                System.out.println("Day Fee: Rs100");
        	}
        	else {
        		System.out.println("Enter y/yes or n/no.");
        	}
        	break;
        case "full week":
        	if (std.equals("no")||std.equals("n")) {
        		 System.out.println("Service Name :" + pkge);
        		System.out.println("Day Fee: Rs2000");
        	}
        	else if(std.equals("yes")||std.equals("y")) {
        		System.out.println("College name:"+college);
        		 System.out.println("Service Name :" + pkge);
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
