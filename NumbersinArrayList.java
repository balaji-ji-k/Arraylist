package com.onesoft.collections;

import java.util.ArrayList;

public class NumbersinArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(25);
		nums.add(30);
//		System.out.println(nums);
//		System.out.println(nums.get(2));
//		for(int i=0;i<nums.size();i++)
//		{
//			System.out.println(nums.get(i));
//		}
		
//		for(Integer x : nums) {
//			System.out.println(x);
//		}
		
		nums.forEach(y->System.out.println(y));
		
	}

}
