package week3.day1;

public class FindingIntersectioninArrays {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Given Arrays a and b are declared 
		int[] a= {3,2,11,4,6,7};
		int[] b= {1,2,8,4,9,7};
		
		//Length of arrays are found
		int alen=a.length;
		int blen=b.length;
		
		//Looping to compare each element of Array a and Array b 
		for (int i=0;i<alen;i++)
		{
			for(int j=0;j<blen;j++)
			{
				if(a[i]==b[j]) //if a match is found printing the matched value.
				{
					System.out.println(a[i]);
				}
			}
		}
		
	}

}
