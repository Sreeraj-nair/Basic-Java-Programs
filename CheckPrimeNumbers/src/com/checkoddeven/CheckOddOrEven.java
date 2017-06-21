package com.checkoddeven;

public class CheckOddOrEven {
	
	public static void main(String args[]){
		
		int enteredNumber = 2; 
		
		if(enteredNumber==0){
			System.out.println(enteredNumber +" entered number is neither odd nor even");
		}
	
		else if(enteredNumber%2==0){
			System.out.println(enteredNumber +" is even number.");
		}
		else 
		{
			System.out.println(enteredNumber + " is odd number.");
		}
	}
}
