package average_app;

import java.util.Scanner;
import java.io.PrintStream;

public class Average_APP {
	static Scanner usin = new Scanner(System.in);
	
	//Created a function to create and take the average of the list
	static float average(int length) {
		//Created variables
		PrintStream so = System.out;
		
		int total = 0;
		int[] list = new int[length];
		
		//Looping to fill in the list
		for(int  i = 0; i<length; i++) {
			so.print("Enter integer: ");
			list[i] = usin.nextInt();
			}
		
		//Created a loop to get the total
		for(int i = 0; i<length; i++) {
			total = total + list[i];
		}
		//returning the average
		return (float) total/length;
	}
	
	public static void main(String[] args) {
		//Created variables
		PrintStream so = System.out;
		int quantity;
		float avg;
		
		//Retrieving how many integers from the user
		so.print("How many integers do you want to enter into the list(1-30): ");
		quantity = usin.nextInt();
		
		//If the user entered a value above 30
		while(quantity>30) {
			so.print("You entered too large of a quantity, please try again: ");
			quantity = usin.nextInt();
		}
		
		//Grabbing the average of the list
		avg = average(quantity);
		
		//Printing the average
		so.print("The Average of the list is: " + avg);
	}
}
