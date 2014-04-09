package net.action;

import net.action.Item.InvalidPrice;

public class Test {

	public static void main(String[] args) throws InvalidPrice {

	Participant par1=new Participant("Janey");
	Participant par2=new Participant("Alex");
	AuctionTable table=new AuctionTable();
	
	Item item1=new Item("apple",1);
	Auction auc1=new Auction(item1);
	System.out.println("Auction is open? "+auc1.isOpen);
	auc1.open();
	System.out.println("Auction is open? "+auc1.isOpen);
	par1.bid(auc1, 2);
	System.out.println("amount is  "+auc1.getBid().amount);
	par2.bid(auc1, 5);
	System.out.println("amount is  "+auc1.getBid().amount);
	auc1.close();
	table.addAuction(auc1);
	System.out.println(table.checkStatus("apple"));
	}

}
