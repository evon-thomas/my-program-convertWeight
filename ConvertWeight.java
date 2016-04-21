
/*
* This Program converts pounds into kilograms
*/
import java.util.Scanner;


public class ConvertWeight {
	
	private final static double KILOGRAMS_PER_POUND = 0.453592; // conversion constant

	/**
	* The program starts in the main function
	* @param args the command line arguments
	*/
	public static void main(String[] args) {
	
		// print out the welcome message
		System.out.println();
		System.out.println("This program converts pounds into kilograms");
		
		System.out.println("\nPlease enter name:");  // promt user to enter their name
		
		// create an input file for the console
		Scanner inFile;
		inFile = new Scanner(System.in);
		
		String name = inFile.nextLine(); // get the next line typed from the console
		
		// prompt user to enter the weight in pounds
		System.out.println("\nEnter the weight in pounds:");
		
		double weightInPounds = inFile.nextDouble(); // get weight entered from console
		
		// convert the weight to kilograms
		double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
		
		// display weight in kilograms to the console
		System.out.println("\n***********************************************" + "******************");
		System.out.println("\t" + name + ", The weight is " + weightInKilograms + " kilograms");
		System.out.println("************************************************" + "*****************\n");
		}
		
	}	