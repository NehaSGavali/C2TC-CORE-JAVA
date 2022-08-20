package FirstSection;

import java.util.Scanner;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Enter the Starting range : ");
		Scanner n = new Scanner(System.in);
		int a = n.nextInt();
		
		System.out.println("Enter the Ending range : ");
		Scanner m = new Scanner(System.in);
		int b = m.nextInt();
		
		System.out.println("List of prime number between " +a+ " and " +b);
		for(int i = a ;i <= b; i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}
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
	  }
}
	 
	

