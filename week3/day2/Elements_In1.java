package week3.day2;

public class Elements_In1 extends Button_In1{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Main Method - Elements Class... Execution Starts...");

		Elements_In1 element=new Elements_In1(); //Object created for accessing Base and Parent methods
		System.out.println("\nRelation: Execution->Button->WebElement");
		element.click(); //Method of Base Class WebElement_In1
		element.setText("Calling from Main Method of Element Class - Using Object element"); //Method of Base Class WebElement_In1
		element.submit(); //Method of Button_In1
		
		CheckBoxButton_In1 chk=new CheckBoxButton_In1();
		System.out.println("\nRelation: CheckBoxButton->Button->WebElement");
		chk.clickCheckButton();
		chk.submit();
		chk.click();
		chk.setText("Calling from Main Method of Element Class - Using Object chk");
		
		RadioButton_In1 radio=new RadioButton_In1();
		System.out.println("\nRelation: RadioButton->Button->WebElement");
		radio.selectRadioButton();
		radio.submit();
		radio.click();
		radio.setText("Calling from Main Method of Element Class - Using Object radio");
		
		Textfield_In1 textf=new Textfield_In1();
		System.out.println("\nRelation: Textfield->WebElement");
		textf.getText();
		textf.click();
		textf.setText("Calling from Main Method of Element Class - Using Object textf");
		
		Button_In1 button=new Button_In1();
		System.out.println("\nRelation: Button->WebElement");
		button.submit();
		button.click();
		button.setText("Calling from Main Method of Element Class - Using Object button");	
		
		WebElement_In1 webele=new WebElement_In1();
		System.out.println("\nRelation: The Top in Hierarchy - WebElement");
		webele.click();
		webele.setText("Calling from Main Method of Element Class - Using Object webele");

		System.out.println("\n...Inheritance Completed...");
	}

}
