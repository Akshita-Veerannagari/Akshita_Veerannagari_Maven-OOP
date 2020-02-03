package com.epam.maven_OOP;

public class chocolates extends sweets {
	String flavour;
	chocolates(int weight, int price,  int no, String flavour)
	{
		super(weight,price,no);
		this.flavour=flavour;
	}
	public  String toString() {
		return "Price: "+this.price+" Weight: "+this.weight+" Quantity: "+this.no;
		}

}