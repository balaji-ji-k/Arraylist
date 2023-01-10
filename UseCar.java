package com.onesoft.collections;

import java.util.ArrayList;

public class UseCar {
	public static void main(String[] args) {
		Car car1 =new Car("Maruti",150000,800);
		Car car2 = new Car("Honda",250000,1200);
		Car car3 = new Car("Kia",400000,1800);
		Car car4 = new Car("Renault",350000,1500);
		Car car5 = new Car("Tata",200000,1000);
		ArrayList<Car> cars= new ArrayList<>();
		
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		//System.out.println(cars);
		cars.set(1, car5);
		//System.out.println(cars.get(1));
		for(int i=0;i<cars.size();i++)
		{
			System.out.println(cars.get(i).getBrand());
		}
		String name=cars.get(1).getBrand();
		cars.get(0).setBrand("suzuki");
		System.out.println(cars);
		/*for(Car x:cars)
		{
			System.out.println(x);
		}*/
		
		cars.forEach(c->System.out.println(c.getBrand()));
	}

}
