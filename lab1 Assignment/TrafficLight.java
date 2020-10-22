/*
 * Desc :Java Program to simulate traffic light
 * Author: Sadanala Akhila
 * Date: 22-10-2020
 */
import java.util.Scanner;
public class TrafficLight {
	public static void main(String[] args) {
		System.out.println("Select the Traffic Light:");
		System.out.println("1.Red");
		System.out.println("2.Green");
		System.out.println("3.Yellow");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Stop");
			break;
		case 2:
			System.out.println("Go");
			break;
		case 3:
			System.out.println("Ready");
		default:
			System.out.println("Invalid");
			
		}
		
			
		
	}
	

}
