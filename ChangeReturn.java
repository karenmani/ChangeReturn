import java.math.*;
import java.util.*;

public class ChangeReturn 
{
	static int numQs, numDs, numNs, numPs;
	static double change, balDimes, balNickels, balPennies;
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to the Change Exchange! I am a machine that spits out your change in coins ONLY! Enter the bill or amount you must pay: ");
		Scanner amount = new Scanner(System.in);
		double balance=amount.nextDouble();
		System.out.println("Enter the amount you are paying: ");
		Scanner paid = new Scanner(System.in);
		double tended = paid.nextDouble();
		change = tended-balance;
		numQuarters(change);
		numDimes(balDimes);
		numNickels(balNickels);
		numPennies(balPennies);
		System.out.println("Based on your bill and how much you paid, you will get $" + (Math.round(change*100.0)/100.0) + " in change. That equates to " + numQs + " quarters, " + numDs + " dimes, " + numNs + " nickels, and " + numPs + " pennies.");
	}
	public static void numQuarters(double change)
	{
		numQs = Integer.valueOf((int) (change /(.25)));
		balDimes = change-((.25)*numQs);
	}
	public static void numDimes(double balDimes)
	{
		numDs = Integer.valueOf((int) (balDimes/(.10)));
		balNickels = balDimes-((.10)*numDs);
	}
	public static void numNickels(double balNickels)
	{
		numNs = Integer.valueOf((int)(balNickels/(.05)));
		balPennies = balNickels-((.05)*numNs);
	}
	public static void numPennies(double balPennies)
	{
		numPs = Integer.valueOf((int)(balPennies/(.01)));
	}
}
