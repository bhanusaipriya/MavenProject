package com.mycompany.oopsmaven;

import java.util.ArrayList;

public class Gifts {
    public static ArrayList<Integer> total=new ArrayList<Integer>();
    public int getWeight(){
    	int totalweight=0;
    	for(int i=0;i<total.size();i++){
    		totalweight+=total.get(i);
    	}
    	return totalweight;
    }
	
}
