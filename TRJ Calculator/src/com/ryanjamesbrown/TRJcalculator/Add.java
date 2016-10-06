package com.ryanjamesbrown.TRJcalculator;

public class Add extends Calculator{
	
	public int total;
	
	public int getNewTotal(){
		return this.total;
	}
	
	public void setNumbers(int a, int b){
		int answer = a + b;
		this.total = answer;
	}

}
