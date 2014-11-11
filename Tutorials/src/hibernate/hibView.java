package hibernate;

import java.util.Scanner;

public class hibView {
	// This is used to be able to get input from the user
	private static Scanner in;
	
	//Starts the view
	public static void runthis(){
		//creates the object for getting user input
		in = new Scanner(System.in);
		
		//This is what is viewed by the user; asks for input; saves data into the variables
		System.out.println("Enter your first name: ");
		String fname = in.nextLine();
		
		System.out.println("Enter your last name: ");
		String lname = in.nextLine();
	
		System.out.println("Enter email: ");
		String email = in.nextLine();
		
		System.out.println("Enter your password (20 characters max): ");
		String password = in.nextLine();
		
		//Starts the control and inputs the data into it
		hibControl control = new hibControl(fname, lname, email, password);
		control.run();
	}
}
