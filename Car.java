package com.onesoft.collections;

public class Car {
	
	private String brand;
	private int price;
	private int cc;
	
	public Car(String brand,int price, int cc)
	{
		this.brand=brand;
		this.price=price;
		this.cc=cc;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void setCC(int cc)
	{
		this.cc=cc;
	}
	public String getBrand()
	{
		return this.brand;
	}
	public int getPrice()
	{
		return this.price;
	}
	public int getCC()
	{
		return this.cc;
	}
	
	public String toString()
	{
		return "Brand = "+brand+" Price = "+price+" CC = "+cc;
	}

}
