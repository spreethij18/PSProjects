package week3.day2;

//Polymorphism - Method Overloading

public class APIClient 
{
	//Creating a method with one input argument.
	//Printing the values passed from main method for the input parameter.
	public void sendRequest(String endpoint)
	{
		System.out.println("Single Argument Method Called");
		System.out.println("Endpoint:"+endpoint);
	}
	
	//Creating a method with same name as before with three input arguments.
	//Printing the values passed from main method for these input parameters.
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus)
	{
		System.out.println("\nMulti Argument Method Called");
		System.out.println("Endpoint:"+endpoint);
		System.out.println("Request Body:"+requestBody);
		System.out.println("Request Status:"+requestStatus);
	}
	
	//Main method from where execution starts.
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//Instantiating an object api for the APIClient Class.
		APIClient api=new APIClient();
		
		System.out.println("...Starting the Execution...\n"); //Printing for user understanding.
		
		//Invoking the methods by passing the different input arguments as per the method's requirements. 
		api.sendRequest("Endpoint Input - Single Arg");
		api.sendRequest("Endpoint Input - Multi Arg", "Request Body - Muli Arg", true);
		
		System.out.println("\nPolymorphism with Method Overloading Successful."); //Printing for user understanding.

	}

}
