package com.mycompany.oopsmaven;

import java.util.TreeMap;

public class Chocolates {
	public void sortChocolates(TreeMap<Integer,String> tm){
		for(int i:tm.keySet()){
			System.out.println(tm.get(i)+" "+i);
		}
	}
	public void getChocolatesInRange(int low,int high,TreeMap<Integer,String> tm){
		System.out.println("candies in range Rs"+low+"Rs"+high);
		for(int i:tm.keySet()){
			if(i>=low && i<=high){
			   System.out.println(tm.get(i)+" "+i);
			}
		}
		System.out.println();
		
	}

}
