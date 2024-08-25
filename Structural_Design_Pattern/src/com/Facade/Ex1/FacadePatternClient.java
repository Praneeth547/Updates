package com.Facade.Ex1;

public class FacadePatternClient {

	public static void main(String[] args) {
		
		ShopKeeper shopKeeper = new ShopKeeper();

		 System.out.println("Selling iPhone:");
	     shopKeeper.iphoneSale();

	     System.out.println("\nSelling Samsung:");
	     shopKeeper.samsungSale();

	     System.out.println("\nSelling Blackberry:");
	     shopKeeper.blackberrySale();
	}

}
