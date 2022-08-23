package com.m24.assingment;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String args[]) {
		String a, rev="";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string to reverse :");
		a=in.nextLine();
		int length=a.length();
		for(int i=length-1;i>=0;i--)
		  rev=rev+a.charAt(i);
		System.out.println("Reversed string: "+rev);
		}
	}
