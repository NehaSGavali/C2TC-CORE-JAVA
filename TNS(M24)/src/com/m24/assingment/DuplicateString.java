package com.m24.assingment;

import java.util.Scanner;

public class DuplicateString {
	public static void main(String[] args) {  
        
		System.out.println("Enter the String : ");
		Scanner scan = new Scanner(System.in);
		String string1 = scan.next();
        int count;  
          
        char string[] = string1.toCharArray();  
          
        System.out.println("Duplicate characters in a given string: ");  
        for(int i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;  
                    string[j] = '0';  
                }  
            }  
            if(count > 1 && string[i] != '0')  
                System.out.println(string[i]);  
        }  
    }  

}
