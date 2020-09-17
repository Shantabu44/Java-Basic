package com.flexon1;
import java.util.*;

public class Consonants {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter something :");
		String s1=sn.next();
		int len=s1.length();
		int i;
		String s2="";
		char x, count=0;
		for(i=0;i<=len-1;i++)
		{
			x=s1.charAt(i);
			switch(x)
			{
				case 'a':
				case 'b':
				case 'c':
				case 'd':
				case 'e':
				case 'f':
				case 'g':
				case 'h':
				case 'i':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'n':
				case 'o':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'u':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
					count++;
					s2=s2+"*";
					break;
					default:
						s2=s2+x;
				
			
		
			}
		}
		
		System.out.println("Number of consonants="+count);
		System.out.println("The changed line is"+s2);
	}
	

}