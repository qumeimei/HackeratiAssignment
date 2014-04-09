package net.action;

import java.util.Hashtable;

import net.action.Item.InvalidPrice;

public class AuctionTable {
	public Hashtable <Item,Auction> auctions; 
	
	public AuctionTable()
	{
		auctions=new Hashtable <Item,Auction>();
	}
	
	public boolean hasFailed(Item item)
	{
		if(auctions.contains(item))
		{
			return ((Auction) auctions.get(item)).hasFailed();
		}
		else
		{
			return false;
		}
	}
	
	public void addAuction(Auction auction)
	{
		if(hasFailed(auction.item))
		{
			System.out.println("The item has already failed, you can not add it again!");
		}
		else
		{
			
			auctions.put(auction.item, auction);
			
		}
		
	}
	public Auction getAuction(Item item)
	{
		if(auctions.contains(item))
		{
			return auctions.get(item);
		}
		else
		{
			return null;
		}
		
	}
	
	public String checkStatus(String name) throws InvalidPrice
	{
		String status="";
		boolean isContain=false;
		Item checkItem=new Item("",1);
		for(Item item:auctions.keySet())
		{
			if(item.name.equalsIgnoreCase(name))
			{
				isContain=true;
				checkItem=item;
				break;
			}
		}
		
		if(!isContain)
		{
			status="No item found!!!";
			return status;
		}
		else
		{
			Auction checkAuction =auctions.get(checkItem);
			if(checkAuction.hasFailed)
			{
				status="Auction has failed!";
				
						
			}
			else if(checkAuction.isOpen)
			{
				status="Auction is opening and current leading bid is "+ Double.toString(checkAuction.leadingBid.amount)+" from "+checkAuction.leadingBid.participant.name;
			}
			else
			{
				status="Auction is successfully sold and the price sold is "+ Double.toString(checkAuction.leadingBid.amount)+" from the buyer "+checkAuction.leadingBid.participant.name;
			}
			return status;
		}
		
	}
	
	

}
