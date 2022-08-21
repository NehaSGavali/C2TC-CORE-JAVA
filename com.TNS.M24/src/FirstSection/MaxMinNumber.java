package FirstSection;

import java.util.Scanner;

public class MaxMinNumber {

	public static void main(String[] args) {
		System.out.println("Enter the First Number : ");
		
		Scanner n1 = new Scanner(System.in);
		
		int a = n1.nextInt();
		
        System.out.println("Enter the Second Number : ");
		
		Scanner n2 = new Scanner(System.in);
		
		int b = n2.nextInt();
		
		if(a>b)
		{
			System.out.println(a+ " is Largest than "+b);
		}
		else
		{
			System.out.println(b+ " is Largest than "+a);
			
		}
		
	}

}
