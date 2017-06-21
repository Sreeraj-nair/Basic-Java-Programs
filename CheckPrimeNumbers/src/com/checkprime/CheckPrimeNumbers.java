package com.checkprime;

public class CheckPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input the number 
		//Divide the number by numbers starting from 2 and try till number<limit
		
		int number=37; 
		boolean isPrime = false;
		
		if(number<=2){
			System.out.println(number + " is not a prime number");
		}
		
		else {
			for(int j=2;j<number;j++){
				if(number%j==0){
					isPrime = true;
					break;
				}
			}
				if(isPrime){
					System.out.println(number +" is not prime");
				}
				else 
					System.out.println(number + " is prime");
			
		}
		}
		
		
}
