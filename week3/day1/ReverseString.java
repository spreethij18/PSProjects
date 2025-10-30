package week3.day1;

public class ReverseString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//REVERSE A STRING
		
		//Declare a variable and initialize the string value
		String str="Testleaf";
		
		int lenstr=str.length(); //Finding length of the string variable str
		
		char[] strarray=str.toCharArray(); //creating the array for string variable str.
		
		//Printing the String value that we are going to reverse and the length of it
		System.out.println("String to be Reversed: "+str);
		System.out.println("Length of String: "+lenstr);
		
		//Reversing the string using for loop and printing the same
		System.out.print("Reversed String is: ");
		for (int i=lenstr-1;i>=0;i--)
		{
			System.out.print(strarray[i]);
		}
		
	}

}
