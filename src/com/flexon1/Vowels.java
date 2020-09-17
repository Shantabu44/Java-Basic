package com.flexon1;

public class Vowels {

	public static void main(String[] args) {
		
		int vCount = 0;    
	    
	    
	    String str = "This is a really simple sentence"; {    
	        
	        
	    str = str.toLowerCase();    
	        
	    for(int i = 0; i < str.length(); i++) {    
	            
	        if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
	                
	            vCount++;    
	        
	        }   
	    }    
	    System.out.println("Number of vowels are: " + vCount); 
	}
	}
}
