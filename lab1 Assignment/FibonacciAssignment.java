/*
 * Desc: Fibonacci Series upto Nth term
 * Author: Sadanala Akhila
 * Date: 22-10-2020
 */

import java.util.Scanner;

public class FibonacciAssignment {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num1=1,num2=1,nextTerm=0,i;
		System.out.println("Enter the size of series:");
		int number=sc.nextInt();
		for(i=2;i<=number;i++)
		{
			nextTerm=num1+num2;
			num1=num2;
			num2=nextTerm;
			
		}
		System.out.println("Fibonnaci series upto Nth term is:"+nextTerm);
		
	}
}
