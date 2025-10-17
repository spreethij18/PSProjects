package week1.day2;

public class IsPrime {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n=10;
		
		for (int i=2;i<=n-1;i++)
		{
			System.out.println("Iteration #"+i);
			if (n%i==0) 
			{
				System.out.println(n+"is Prime"); 
			}
			/*else
			{
				System.out.println(i+"is Prime");
			}*/
		}

	}

}
