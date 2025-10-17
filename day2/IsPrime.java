package week1.day2;

public class IsPrime {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num=133; //number to be checked if prime or not
		int factor=0; //Prime number has 2 factors. Initializing the factor to 0.
		System.out.println("Number you are checking is:"+num ); //Printing the number that is being checked for prime or not
		for (int i=1;i<=num;i++)
		{
			if (num%i==0) 
			{
				factor++; 
			}
		}
		
		//Output details if the number to be checked is less than or equals 0.
		if(num<=0)
		{
			System.out.println("The number you check is invalid");
		}
		
		//Output details if the number to be checked is 1.
		if(num==1)
		{
			System.out.println("It is NOT a Prime number");
		}
		
		//Output details if the number to be checked is having exactly 2 factors i.e 1 and the number itself. So factor count=2.
		if(factor==2)
		{
			System.out.println("It is a Prime number");
		}
		
		//Output details if the number to be checked is having more than 2 factors.
		if(factor>2)
		{
			System.out.println("It is not a Prime number");
		}

	}

}
