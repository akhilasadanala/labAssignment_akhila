/*
 * Desc: Sorted Strin Array
 * Author :Sadanala Akhila 
 * Date: 23-10-2020
 */
import java.util.Scanner;
public class SortedString {
		public static void main(String[] args) {
			//Declaration, Instantiation and Initialization
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the number of elements in the array : ");
			int length = sc.nextInt();

			String[] array = new String[length];

			//Initializing the array with values
			System.out.println("Enter "+length+" strings : ");
			for(int i =0;i<length;i++)
			{
				array[i] = sc.next();
			}

			String[] result = sortString(array);

			for(int i =0;i<length;i++)
			{
				System.out.print(result[i]+"   ");
			}

		}


		//Definition of the method sortString 
		private static String[] sortString(String[] array) {
			int n = array.length;
			int middle;

			for(int i=0;i<n;i++)
			{
				for(int j=0;j<i;j++) 
				{
					if(array[j].compareToIgnoreCase(array[j+1])>0) 
					{
						String temp = array[j+1];
						array[j+1] = array[j];
						array[j] = temp;
					}
				}
			}

			if(n%2==0)		
			{
				middle = n/2;
			}
			else 			
				middle = (n/2)+1;

			
			for(int i =0;i<n;i++)
			{
				if(i<middle) 	
				{
					array[i] = array[i].toUpperCase(); 
				}
				else
					array[i] = array[i].toLowerCase();	
			}
			return array;
		}

	}
