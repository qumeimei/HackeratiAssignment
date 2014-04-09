package net.action;

public class Bid {
	
	public Participant participant;
	public Auction auction;
	public double amount;
	
	public Bid(Participant aParticipant,Auction Aauction,double Aamount)
	{
		if(!Aauction.isOpen)
		{
			System.out.println("Action is not open,please bid later!");
		}
		
		else if(Aauction.getBid()!=null && Aauction.getBid().amount>Aamount)
		{
			System.out.println("Your biding should be higher than "+Aauction.getBid().amount);
		}
		else
		{
			participant=aParticipant;
			auction=Aauction;
			amount=Aamount;
			Aauction.setBid(this);
		}
		
	}
	public Bid()
	{}

}
