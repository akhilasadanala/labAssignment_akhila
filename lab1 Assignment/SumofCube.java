/*
 * Desc :Java Program to simulate traffic light
 * Author: Sadanala Akhila
 * Date: 22-10-2020
 */
import java.util.Scanner;
public class SumofCube {
	public static void main(String args[])
	{ 
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int result=cubeSum(num);
		System.out.println("Sum of Cube of a number:"+result);
		
	}
	private static int cubeSum(int num) {
		int sum=0,remainder=0;
		while(num!=0) {
			remainder=num%10;
			sum=sum+(remainder*remainder*remainder);
			num=num/10;
			
		}
		return sum;
	}


}
