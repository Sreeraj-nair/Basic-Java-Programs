package com.palindrome;

public class PalindromeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int n=121,r,s=0;
	        int t=n;
	        while(n>0)
	        {
	            r=n%10;
	            n=n/10;
	            s=s*10+r;
	        }
	        if(t==s)
	        {
	            System.out.println(t +" Number is a palindrom");
	        }
	        else            
	        {
	            System.out.println(t +" Number is not a palindrom");
	        }        
	    }    
}
