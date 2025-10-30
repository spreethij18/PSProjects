package week3.day1;

import java.util.Arrays;

public class RemoveDuplicateWords {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Given string value for check is declared and printed
		String text="We learn java basics as part of java sessions in java week1";
		System.out.println("Given Text:-"+text);
		
		String[] words=text.split(" "); //splitting the string text into array when a blank space is seen.
		int arrlen=words.length; //finding the length of given text. 
		System.out.println("Array Length"+arrlen+"\n"); //Printing the length of array
		int count=0; //initializing count value as 0.
		
		//Looping to find the duplicates through comparison.
		for (int i=0;i<=arrlen;i++)
		{
			for (int j=i+1;j<arrlen;j++)
			{
				
				if (words[i].equalsIgnoreCase(words[j])) //checking the array values have duplicates
				{
					
					words[j]=" "; //assigning a blank space if a duplicate is found.
					count=count+1; //counting the duplicates
				}
			}
			
		}
		
		if(count>0) //Checking count is >0 if duplicate exists.
		{
		//Converting Arrays to Strings using toString method so the sentence can be printed
		//Printing the details by replaced values on the place of duplicated words.
		Arrays.toString(words); 
		String output=String.join(" ", words);
		System.out.println("Duplicates found...\nText after removing the duplicate words:-\n"+output);
		}
		
		else //If no duplicates are seen printing a message to inform the user.
		{
			System.out.println("No Duplicate Text found");
		}
		
	}

}
