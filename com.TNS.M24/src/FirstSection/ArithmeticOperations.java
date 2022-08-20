package FirstSection;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		System.out.print("Enter the first number : ");
		Scanner n = new Scanner(System.in);
			int a = n.nextInt();
			
			System.out.print("Enter the Second number : ");
			Scanner m = new Scanner(System.in);
				int b = m.nextInt();
				
				int sum = a + b;
				System.out.print("Addition of given two numbers : ");
				System.out.println(sum);
				
				int sub = a - b;
				System.out.print("Subtraction of given two numbers : ");
				System.out.println(sub);
				
				int mult = a * b;
				System.out.print("Multiplication of given two numbers : ");
				System.out.println(mult);
				
				int div = a / b;
				System.out.print("Divion of given two numbers : ");
				System.out.println(div);
				
				int mod = a % b;
				System.out.print("module of given two numbers : ");
				System.out.println(mod);
			
		
		/*
		int a=14;
		int b=2;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);*/
	}

}
