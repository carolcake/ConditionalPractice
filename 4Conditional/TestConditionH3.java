public class TestConditionH3
{
	public static void main(String[] args)
	{
		int number = 7;
		
		// && is used as an AND operator, don't forget the parentheses
		// this is saying if the number is positive and even, then it's even
		if ( (number > 0) && (number % 2 == 0) )
		{
			System.out.println("Your number is even");
		}
		// this is saying if the number is positive and odd, then it's odd
		else if ( (number > 0) && (number % 2 != 0) )
		{
			System.out.println("You are odd dude");
		}
		else // this is saying if the number is less than 0, it is negative
		{
			System.out.println("Negative!");
		}
		// parentheses are important, put them around grouped things
		// this is saying if a number is less or greater than 0, then the number
		// is positive or negative
		if ( (number < 0) || (number > 0) )
		{
			System.out.println("You are not zero!");
		}
	}
}