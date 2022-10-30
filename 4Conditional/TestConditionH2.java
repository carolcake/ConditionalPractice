// Caroline Hsu - 10/02/2020
import java.util.Scanner;
public class TestConditionH2
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		double number;
		
		System.out.print("Enter a number: ");
		number = reader.nextDouble();
		
		if (number > 0) // if it is positive
		{
			System.out.println("Ooooooh! That is a positive number!");
		}
		else if (number < 0) // if it is negative
		{
			System.out.println("Aahhhhh! That is so negative!");
		}
		// if it is zero
		else 
		{
			System.out.println("That is Mr. Ansari's favorite number for grading!");
		}
	}
}