package com.flexon1;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a string");
			
			String str=sc.next();
			String original_str=str;
			
			String reverse="";
			
			int len=str.length();
			
			for(int i=len-1;i>=0;i--)
			{
				reverse=reverse+str.charAt(i);
			}
			
			System.out.println(reverse);
		
			if(original_str.equals(reverse))
			{
			
				System.out.println("The Entered string is a palindrome");	
			}
			else
			{
				System.out.println("The Entered string is not a palindrome");	
			}
		}
		
	}

}
