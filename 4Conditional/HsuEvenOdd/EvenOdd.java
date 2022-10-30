// Caroline Hsu - 10/08/20
/* This program will prompt a user to enter a positive number and
check to see if it is even or odd. The program will detect if the 
number entered is negative and display a message.*/

// import scanner from API
import java.util.Scanner;
public class EvenOdd
{
	public static void main(String[] args)
	{
		// Declare a variable of type Scanner and declare variables
		Scanner input = new Scanner(System.in);
		int number;
		int finalValue;
		
		// Prompt the user to enter a positive integer value
		System.out.print("Enter a positive integer value you want detected " +
											"as even or odd: ");
		
		// Read the input given and find the remainder when dividing by 2
		// to check if it's even or odd
		number = input.nextInt();
		finalValue = number % 2; 
		
		/* Determine if the input is negative or positve and echo it back to 
		the user. If the number entered is a negative number, tell the user 
		they have entered a negative number and ask them to try again. 
		Then, check if the positive number is even or odd and echo it back
		to the user. */
		if(number < 0) // if number is negative
		{
			System.out.println("You have entered a negative number. " + 
													"Please try again.");
		}
		else if(finalValue == 1) // if number is odd (with the remainder of 1 
														 // when dividing by 2)
		{
			System.out.println(number + " is a positive odd number.");
		}
		else // if number is even (with the remainder of 0 when dividng by 2)
		{
			System.out.println(number + " is a positive even number.");
		}
	}
}