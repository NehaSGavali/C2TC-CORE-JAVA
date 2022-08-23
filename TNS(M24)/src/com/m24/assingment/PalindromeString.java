package com.m24.assingment;

import java.util.Scanner;

public class PalindromeString 
{

	public class PalindromeChecker 
	{  
		public static boolean isPalindrome(String str)
		{  
		    StringBuilder sb=new StringBuilder(str);  
		    sb.reverse();  
		    String rev=sb.toString();  
		    if(str.equals(rev))
		    {  
		        return true;  
		    }
		    else{  
		        return false;  
		    }  
		}  
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the string to check Palindrome or not : ");
		Scanner n = new Scanner(System.in);
		String s = n.next();
		System.out.println(PalindromeChecker.isPalindrome(s));
	}
}
