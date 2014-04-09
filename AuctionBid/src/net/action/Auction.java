package net.action;

public class Auction {
	public Item item;
	public double reservePrice;
	public boolean isOpen;
	public boolean hasFailed;
	public Bid leadingBid;
	public int time;
	
	public Auction(Item aItem)
	{
		item=aItem;
		isOpen=false;
		reservePrice=aItem.price;
		hasFailed=false;
		leadingBid=new Bid();
		time=0;
	}
	
	public boolean isOpen()
	{
		return isOpen;
	}
	
	public boolean hasFailed()
	{
		return hasFailed;
	}
	
	public void open()
	{
		if (hasFailed)
		{
			System.out.println("This auction is failed and can not open again!");
		}
		else
		{
			isOpen=true;
			
		}
	}
	
	public void close()
	{
		isOpen=false;
		if (reservePrice>leadingBid.amount)
		{
			hasFailed=true;
			System.out.println("Auction failed!!");
		}
	}
	
	public void checkStatus()
	{
		System.out.println("Auction is open? "+isOpen);
		System.out.println("Auction is has Failed? "+hasFailed);
		
	}
	
	public Bid getBid()
	{
		return leadingBid;
	}
	public void setBid(Bid aBid)
	{
		leadingBid=aBid;
	}


}
