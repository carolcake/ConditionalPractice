// Caroline Hsu - 10/14/2020
/* This program prompts the user for 3 integer test scores and displays
the average of those scores and the letter grade the average is. */
// import scanner from API 
import java.util.Scanner;
public class LetterGrade
{
	public static void main(String[] args)
	{
		// declare a variable of type Scanner and declare other variables
		Scanner input = new Scanner(System.in);	
		final int A_PLUS_MAXIMUM = 100;
		final double A_PLUS_MINIMUM = 97.5;
		final double A_MAXIMUM = 97.49;
		final double A_MINIMUM = 93.5;
		final double A_MINUS_MAXIMUM = 93.49;
		final double A_MINUS_MINIMUM = 89.5;
		final double B_PLUS_MAXIMUM = 89.49;
		final double B_PLUS_MINIMUM = 86.5;
		final double B_MAXIMUM = 86.49;
		final double B_MINIMUM = 82.5;
		final double B_MINUS_MAXIMUM = 82.49;
		final double B_MINUS_MINIMUM = 79.5;
		final double C_MAXIMUM = 79.49;
		final double C_MINIMUM = 69.5;
		final double F_MAXIMUM = 69.49;
		final int DIVIDING_AVERAGE = 3;
		int firstGrade;
		int secondGrade;
		int thirdGrade;
		double average;
		
		// prompt the user to enter the 3 test grades and read the 3 inputs
		System.out.print("Enter your first test grade: ");
		firstGrade = input.nextInt();
		input.nextLine();
		System.out.print("Enter your second test grade: ");
		secondGrade = input.nextInt();
		input.nextLine();
		System.out.print("Enter your third test grade: ");
		thirdGrade = input.nextInt();
		input.nextLine();
		
		/* calculate the average of the grades entered and echo it back
		to the user */
		average = firstGrade + secondGrade + thirdGrade;
		average = average / DIVIDING_AVERAGE;
		System.out.printf("The average of your " + "scores is:%6.2f \n" , 
											average);
		
		// if the average is an A+
		if ( (average > A_PLUS_MINIMUM) && (average <= A_PLUS_MAXIMUM) )
		{
			System.out.println("Your letter grade is A+");
		}
		else if ( (average > A_MINIMUM) && (average < A_MAXIMUM) )
		// if the average is an A
		{
			System.out.println("Your letter grade is A");
		}
		// if the average is an A-
		if ( (average > A_MINUS_MINIMUM) && (average < A_MINUS_MAXIMUM) )
		{
			System.out.println("Your letter grade is A-");
		}
		// if the average is a B+
		else if ( (average > B_PLUS_MINIMUM) && (average < B_PLUS_MAXIMUM) )
		{
			System.out.println("Your letter grade is B+");
		}
		// if the average is a B
		if ( (average > B_MINIMUM) && (average < B_MAXIMUM) )
		{
			System.out.println("Your letter grade is B");
		}
		// if the average is a B-
		else if ( ( average > B_MINUS_MINIMUM) && (average < B_MINUS_MAXIMUM) )
		{
			System.out.println("Your letter grade is B-");
		}
		// if the average is a C
		if ( (average > C_MINIMUM) && (average < C_MAXIMUM) )
		{
			System.out.println("Your letter grade is C");
		}
		// if the average is an F
		else if (average < F_MAXIMUM)
		{
			System.out.println("Your letter grade is F");
		}
	}
}