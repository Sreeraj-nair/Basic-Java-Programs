package com.fibonacci;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int k,a=1,b=1;
	        Scanner scanner = new Scanner(System.in);
	        k=0;
	        System.out.println("Enter a Number");
	        int n = scanner.nextInt();
	        System.out.print("1 1 ");
	        while(k<=n)
	        {
	            k=a+b;
	            if(k>=n)
	                break;
	            System.out.print(k + " ");
	            a=b;
	            b=k;
	        }        

	}

}
