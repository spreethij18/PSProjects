package week3.day1;

public class ReverseOddWordsinString
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String test="I am a software tester"; //Variable "test" is declared and assigned with given string
		String[] split=test.split(" "); //The give string is then split at the spaces to break it into differnets et of words and store as a string array
		int arrlen=split.length;//Length of the array string "split" is calculated
		System.out.println("Length of Array: "+arrlen);//Length of the array string is printed
		
		//Looping and performing checks to identify the Odd position/even position strings
		for(int i=0;i<arrlen;i++)
		{
			if(i%2==0) //The even position word is printed as it is.
			{
				System.out.print(split[i]);
				//System.out.print(" ");
			}
			else //The odd position word is reversed and then printed.
			{
				//Reverse the word in odd position
				int splitlen=split[i].length(); //Length of Odd position string
				char[] oddword=split[i].toCharArray(); //Odd position string is converted into character array for reversal purpose
				
				System.out.print(" "); //Printing a blank space for a structured sentence display as provided
				
				for(int j=splitlen-1;j>=0;j--) //Iterating from the reverse order so the string can be reversed
				{
					System.out.print(oddword[j]); //Printing the reversed details char by char
				}
				System.out.print(" "); //Printing a blank space for a structured sentence display as provided
			}
		}
		
		
		
	}

}
