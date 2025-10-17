package week1.day2;

import java.util.Iterator;

public class OddNum 
{
public static void main (String args[])
{
	//Print Odd Numbers from 1 to 20
	
	System.out.println("Printing Odd NUmbers from 1 to 20");
	
	//Loops
	for (int i = 0; i<=20; i++)
	{
		//Checks if the reminder value is not not equals 0 when i is divided by 2.
		
		if (i%2!=0)
		{
			System.out.println(i);
		}
	}
	System.out.println("Printing Complete");
}
}
