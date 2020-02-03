package com.epam.maven_OOP;
import java.util.Comparator;
public class choc_sort implements Comparator<chocolates>
{
	int op;
	choc_sort(int n)
	{
		this.op=n;
	}
	public int compare(chocolates a,chocolates b)
	{
		switch(op) 
		{
			case 1:return a.price-b.price;
			case 2:return a.weight-b.weight;
			case 3:return a.no-b.no;
		}
		return 0;
	}
}

