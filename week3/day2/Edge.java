package week3.day2;

public class Edge extends Chrome 
{
	public void takeSnap()
	{
		System.out.println("Take Snap - Coming from Subclass Edge");
	}
	public void clearcookies()
	{
		System.out.println("Clear Cookies - Coming from Subclass Edge");
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Edge e=new Edge();
		System.out.println("PRINTING FROM EDGE SUB CLASS");
		e.takeSnap();
		e.clearcookies();
		e.openincognito();
		System.out.println(e.browserName);
		/*e.clearCache();
		e.openurl();
		e.closeurl();
		e.navigateback();*/
				
	}

}
