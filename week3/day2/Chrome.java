package week3.day2;

public class Chrome extends Browser
{
	public void openincognito()
	{
		System.out.println("Opening in Incognito - from Chrome Subclass");
	}
	public void clearCache()
	{
		System.out.println("Clearing Cache - from Chrome Subclass");
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Chrome c=new Chrome();
		System.out.println("PRINTING FROM CHROME SUB CLASS");
		c.openincognito();
		c.clearCache();
		c.openurl();
		c.closeurl();
		c.navigateback();
	}

}
