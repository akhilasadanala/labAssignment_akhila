/*
 * Desc :Java Program to prime numbers upto N
 * Author: Sadanala Akhila
 * Date: 22-10-2020
 * 
 */

import java.util.Scanner;

public class PrimeuptoN {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int num,i,count;
		System.out.println("Enter a number:");
	     num=sc.nextInt();
		
		for( i=1;i<=num;i++)
		{
		  count=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
				    break;
			}
		}
		if(count==0 && i!=1)
			System.out.println(i+" ");
	}
	

}
}