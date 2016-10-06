package com.ryanjamesbrown.TRJcalculator;

import java.util.ArrayList;

public class Calculator {
	
	public int total;
	
	private String[] numbArray;
	
	//constructor set when made instanceOf Calculator
	public Calculator(){
		total = 0;
	}
	
	//set equation
	public void setEquation(ArrayList<Integer> num, ArrayList<String> opEntered){
		
		for(int i = 0; i < opEntered.size(); i++){
			
			int num1 = num.get(i);
			String ope = "";
			
			try {
				ope = opEntered.get(i);
			} catch(IndexOutOfBoundsException e){
				//
			}
			
			int num2 = num.get(i+1);
			
			if(ope.equals("+")){
				
				Add ad = new Add();
				
				if(i == 0){
					ad.setNumbers(num1, num2);
				} else {
					ad.setNumbers(this.total, num2);
				}
				
				this.total = ad.getNewTotal();
				System.out.println(ad.getNewTotal());
				
			}
			
		}
	
	}
	
	//checks equation after setting equation to attribute
	public void getTotal(){
		System.out.println("New total:\t" + total);
	}
	
	public void resetTotal(){
		total = 0;
	}
	
}
