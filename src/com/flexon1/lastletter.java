package com.flexon1;

public class LastLetterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner input = new Scanner(System.in);
		String s = "I 1wants wants wants wants 2wantsy wantsy wantsy to walk my dog";
		String[] arr = s.split(" ");
		int counterS=0;
		int counterY=0;

		// Occurances of s and y
		for ( String ss : arr) {
		    if (ss.endsWith("s")||ss.endsWith("S")){
		    	counterS++;
		    }
		    if (ss.endsWith("y")||ss.endsWith("Y")){
		    	counterY++;
		    }
		}
		System.out.println("Number of words ending with s are "+counterS);
		System.out.println("Number of words ending with y are "+counterY);


		// Swapping 1st instance of s and y
		int firstS = -1;
		int firstY = -1;
		int i=0;
		for ( i=0 ; i<arr.length;i++) {
		    if (firstS ==-1 && (arr[i].endsWith("s")||arr[i].endsWith("S"))){
		    	firstS=i;
		    }
		    if (firstY ==-1 && (arr[i].endsWith("y")||arr[i].endsWith("Y"))){
		    	firstY=i;
		    }
		    if (firstS!=-1 && firstY!=-1)
		    {
		    	String t = arr[firstS];
	  			arr[firstS] = arr[firstY];
	 			 arr[firstY] = t;
		    	break;
		    }
		}
		String modifiedS = String.join(" ", arr);
		System.out.println("Modified sentence - "+modifiedS);
	}

}
