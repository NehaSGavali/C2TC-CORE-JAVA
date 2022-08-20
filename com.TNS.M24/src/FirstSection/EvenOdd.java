package FirstSection;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		System.out.println("Enter the number : ");
		
		Scanner n=new Scanner(System.in);
		
		int a = n.nextInt();
		
		if(a%2 == 0)
			
			System.out.print("Even Number");
		
		else
			
			System.out.print("Odd Number");
		
	}

}
