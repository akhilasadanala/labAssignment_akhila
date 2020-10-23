/*
 * Dec: Return the resulting array after reversing the numbers and sorting it 
 * Author: Sadanala Akhila
 * Date: 23-19-2020
 */
import java.util.Scanner;

public class SortReverseArray {
	public static void main(String args[])
	{
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
	int result[];
	result=getSorted(array);
	for(int i=0;i<length;i++) {
		System.out.println(result[i]+" ");
	}
	}
	public static int[] getSorted(int arr[])
	{
	int temp;
	int len=arr.length;
	int reverse[] =new int[len];
	//sorting of elements
	for(int i=0;i<len;i++)
	{
		reverse[i]=arr[len-i-1];
	}
	for(int i=0;i<len;i++) {
		for (int j=i+1;j<len;j++)
		{
			if(reverse[i]>reverse[j]) {
				temp=reverse[i];
				reverse[i]=reverse[j];
				reverse[j]=temp;
			}
		}
	}
	// return second smallest element in array
	return reverse;
}
}
