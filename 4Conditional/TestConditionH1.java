// Caroline Hsu 10/02/2020
// This program will model if statements

// read a temperature
// if > 100 warn the user
// greet the user
import java.util.Scanner;
public class TestConditionH1
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int temperature;
		
		System.out.println("Welcome to my lovely program");
		System.out.print("Please enter the current temp: ");
		temperature = kb.nextInt();
		
		if(temperature > 100)
		{
			System.out.println("Run for your life!");
			System.out.println("The thing is gonna explode!");
		}
		else
		{
			System.out.println("You are so coooooool!");
		}
		System.out.println("Thank you for using my lovely program!");
	}
}