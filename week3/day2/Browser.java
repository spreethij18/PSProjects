package week3.day2;

public class Browser
{
	String browserName="New Browser";
	String browserVersion="Version 1.0";
	public void openurl()
	{
		System.out.println("Open URL -> coming from Super Class - Browser");
	}
	public void closeurl()
	{
		System.out.println("Close URL -> coming from Super Class - Browser");
	}
	public void navigateback()
	{
		System.out.println("Navigate Back -> coming from Super Class - Browser");
	}
	/*public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Browser b=new Browser();
		b.openurl();
		b.closeurl();
		b.navigateback();
	}*/

}
