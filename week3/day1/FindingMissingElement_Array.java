package week3.day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindingMissingElement_Array
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int[] num= {1,4,3,2,8,6,7};//Given array values are initialized
		System.out.println("Given Array Numbers are: "+Arrays.toString(num));//Printing the given array values
		int alen=Array.getLength(num);//Finding the length of array
		System.out.println("Length of the given array is: "+alen);//Printing the value of array length.
		Arrays.sort(num);//Sorting the array
		System.out.println("Array Numbers After Sorting are: "+Arrays.toString(num));//printing the sorted array values.
		
		//Looping to find the missing elementb in a sequential array
		for (int i=1; i<=alen-1; i++)
		{
			if(i==num[i-1])
			{
				continue; //Continuing with next cycle of loop if a match is found
			}
			else
			{
				System.out.println("Missing value is: "+i); //Printing the missing value
				break; //Exiting from the loop once the missing value is identified and printed.
			}
		}
	}

}