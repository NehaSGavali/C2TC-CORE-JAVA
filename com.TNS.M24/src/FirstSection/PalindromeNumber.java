package FirstSection;

import java.util.*;
public class PalindromeNumber 
{  
public static void main(String[] args) 
{  
    Scanner n = new Scanner(System.in);  
    System.out.println("Enter the number: ");  
    String r = ""; 
    String num = n.nextLine(); 
    int length = num.length();   
   for ( int i = length - 1; i >= 0; i-- )  
      r = r + num.charAt(i);  
   if (num.equals(r))  
      System.out.println("The entered Number " +num +" is a palindrome.");  
   else  
      System.out.println("The entered Number " +num +"  isn't a palindrome.");     
}
} 