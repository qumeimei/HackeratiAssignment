package net.action;

public class Item {
	
	public String name;
	public double price;
	
	public Item(String aName,double aPrice) throws InvalidPrice
	{
		if(aPrice<0)
			throw new InvalidPrice("Your price is smaller than 0");
		else
		{
			name=aName;
			price=aPrice;
		}
		
	}
	
	public class InvalidPrice extends Exception {

		  public InvalidPrice(String message){
		     super(message);
		  }

		}

}
