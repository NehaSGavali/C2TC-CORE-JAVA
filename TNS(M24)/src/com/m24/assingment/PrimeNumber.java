package com.m24.assingment;

import java.util.Scanner;

public class PrimeNumber 
{
	
	   public static void main(String[] args) {  
	       Scanner s = new Scanner(System.in);  
	       System.out.print("Enter a number : ");  
	       int n = s.nextInt();  
	       if (isPrime(n)) {  
	           System.out.println(n + " is a prime number");  
	       } else {  
	           System.out.println(n + " is not a prime number");  
	       }  
	   }  
	  
	   public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i < Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   } 

	/*
	 * public static void main(String[] args) {
	 * 
	 * System.out.println("Enter the Starting range : "); Scanner n = new
	 * Scanner(System.in); int a = n.nextInt();
	 * 
	 * System.out.println("Enter the Ending range : "); Scanner m = new
	 * Scanner(System.in); int b = m.nextInt();
	 * 
	 * System.out.println("List of prime number between " +a+ " and " +b); for(int i
	 * = a ;i <= b; i++) { if(isPrime(i)) { System.out.println(i); } }
	 
	}

	
	 public static boolean isPrime(int n) 
	  {
		  if(n<=1)
		  {
			  return false;
		  }
		  for(int i=2;i<=Math.sqrt(n);i++) 
		  {
			  if(n%i==0)
			  {
				  return false;
			  }
	     }
	     return true;
	  }*/
}
	 
	

