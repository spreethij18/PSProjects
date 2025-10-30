package week3.day1;

public class OddIndextoUppercase {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String test="changeme"; //Declare and Initialize the given string to a variable
		char[] word=test.toCharArray(); //Converting the given string into character array set
		System.out.println("String Converted to Array"); //Printing a message to inform user on conversion completion.
		int len=word.length; //Finding the length of the string given
		System.out.println("Length of Array="+len); //Printing the length of the string given.

		//Looping through the characters in the string.
		for(int i=0;i<len;i++)
		{
			//Checking if the position is even. If the position of char is event printing it as it is.
			if(i%2==0)
			{
				System.out.print(word[i]);
			}

			//if position is odd, we convert the char to Upper case.
			//This is achieved by converting the character value in odd position into a String value
			//and then using the tpUppercase method for conversion of lowercase to uppercase value.
			else
			{
				String odd=String.valueOf(word[i]);
				System.out.print(odd.toUpperCase());
			}
		}
	}

}
