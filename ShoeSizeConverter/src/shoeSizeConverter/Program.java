/*
 *  Student Name : Amirreza Mirzaei
 *  Date : November 15, 2023
 *  Modified:
 */
package shoeSizeConverter;

import java.util.Scanner;

/* 
 * Simple class, contains main line logic for application.
 */
public class Program {

	public static void main(String[] args) {
		// importing the scanner from the util package
		Scanner scan = new Scanner(System.in);
		
		int shoeSize = 0;	// User's Canadian shoe size
		String gender = null;	// User's gender
		String report= null; // report from object

		System.out.print("Please enter your Canadian shoe size ");
		shoeSize = scan.nextInt();
		scan.nextLine();

		System.out.print("Please enter your gender (male or female) ");
		gender = scan.nextLine();
		// creating an object of shoeSizeConverter class
		ShoeSizeConverter shoeSizeConverter = new ShoeSizeConverter(shoeSize, gender);
		// calling the createReport method from the shoeSizeConverter class 
		report = shoeSizeConverter.createReport();

		System.out.println(report);
		// update the line below to include your name
		System.out.println("Program by Amirreza Mirzaei");
		System.out.println();
		
	}
}



