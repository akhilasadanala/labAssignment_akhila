/* 
 * Desc:Java program that reads a line of integers and then displays each integer and the sum of all integers. 
 * Author : Sadanala Akhila
 * Date : 27-10-2020
 */


import java.util.*;
	import java.util.StringTokenizer;
public class String1 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	  String s="16 28 54 90 75";
		StringTokenizer st = new StringTokenizer(s," ");
		int sum=0;
	    while (st.hasMoreTokens())
	    {  
	    	String k=st.nextToken();
	    	sum=sum+Integer.parseInt(k);
	        System.out.println(k);  
	    } 
	    System.out.println("Sum:"+sum);
	    
	}
	}
