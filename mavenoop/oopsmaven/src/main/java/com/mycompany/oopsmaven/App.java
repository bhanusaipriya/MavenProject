package com.mycompany.oopsmaven;

import java.util.*;/**
 * Hello world!
 *
 */
public class App extends Gifts
{
    public static void main( String[] args )
    {
        TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of chocolates");
        int no_of_chocolates = sc.nextInt();
        for(int i=0;i<no_of_chocolates;i++){
        	System.out.println("Enter chocolate type 0/1");
        	int typeOfChocolate = sc.nextInt();
        	System.out.println("Enter weight of chocolate:");
        	int weightOfChocolate = sc.nextInt();
        	System.out.println("Enter price of chocolate:");
        	int priceOfChocolate = sc.nextInt();
        	String candyName=null;
        	if(typeOfChocolate ==1){
        		System.out.println("Enter name of the candy:");
        		candyName=sc.next();
        		tm.put(weightOfChocolate , candyName);
        		total.add(weightOfChocolate);
        	}
        }
        Sweets s1=new Sweets(10,20);
        Sweets s2=new Sweets(40,90);
        Sweets s3=new Sweets(60,100);
        Sweets s4=new Sweets(20,40);
        Gifts g=new Gifts();
        System.out.println("Total weight="+g.getWeight());
        System.out.println("Sorting chocolates based on weight:");
        Chocolates c=new Chocolates();
        c.sortChocolates(tm);
        System.out.println("enter lower limit and upper limit:");
        int ll=sc.nextInt();
        int ul=sc.nextInt();
        c.getChocolatesInRange(ll,ul , tm);
    }
}
        	
        	
      