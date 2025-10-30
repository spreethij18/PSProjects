package week3.day1;

import java.util.Arrays;

public class FindDuplciateValues {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//FINDING DUPLICATE VALUES IN A GIVEN ARRAY
		
		//declaring and assigning the array variable called num with required values
		int[] num= {2,5,7,7,5,9,2,3};
		
		//Finding the length of the array "num"
		int numlen=num.length;
		
		Arrays.sort(num);
		System.out.println("Sorted Array List:"+Arrays.toString(num));
		
		//Printing the length value of array
		System.out.println("Length of the Array Num = "+numlen);
		
		//Finding and Printing the Duplicates using Loop value
		System.out.println("The Duplicate Values are:");
		for (int i=0;i<=numlen-1;i++)
		{
			for (int j=i+1;j<=numlen-1;j++)
			{
				if(num[i]==num[j])
				{
					System.out.println(num[i]);
				}
			}
		}	
	}

}
