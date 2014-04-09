package net.action;

public class Participant {
	public String name;
	
	public Participant(String aName)
	{
		name=aName;	
	}
	
	public Bid bid(Auction action,double amount)
	{
		return new Bid(this,action,amount);
	}
	

}