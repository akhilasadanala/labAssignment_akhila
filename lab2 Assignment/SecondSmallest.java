/*
 * Desc : To Print Second Smallest Element in a Array
 * Author: Sadanala Akhila
 * Date: 23-10-2020
 * 
 */
import java.util.Scanner;

public class SecondSmallest {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of elements to be entered in a array:");
		int length=sc.nextInt();
		
		//declaration of array
		int array[]=new int[length];
		System.out.println("Enter elements to be entered in a array:");
		
		//initialization fo array
		for (int i=0;i<length;i++)
		{
			array[i]=sc.nextInt();
			}
		int result=getSecondSmallest(array);
		System.out.println("Second Smallest element in array is :"+result);
	}
	//getSecondSmallest method
	public static int getSecondSmallest(int arr[])
	{
		int temp;
		//sorting of elements
		for(int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		// return second smallest element in array
		return arr[1];
	}
}
