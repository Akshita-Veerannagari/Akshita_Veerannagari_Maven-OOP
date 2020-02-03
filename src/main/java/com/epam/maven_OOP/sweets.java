package com.epam.maven_OOP;

public class sweets {
    int price,weight;
    int no;
	sweets(int weight,int price, int no)
	{
		this.price=price;
		this.weight=weight;
		this.no=no;
	}
	public String toString() 
	{
		return "Price: "+this.price+" Weight: "+this.weight+" Quantity: "+this.no;
	}
}
