package week1.day2;

public class FibSeries {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int firstnum=0; //assigning the first number of fib series
		int secondnum=1;
		int fibonum;
		for (int i=1;i<=8;i++) //Loop to repeat the fib series calculation sequence
		{
			System.out.println(firstnum); //printing the first number of fib series
			fibonum=firstnum+secondnum; //calculating the next number of fib series
			firstnum=secondnum; 
			secondnum=fibonum;
		}
	}

}
