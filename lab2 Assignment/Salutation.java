/*
 * Desc:Java program to print salutation along with name
 */
import java.util.Scanner;

	public class Salutation {
		
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			//Creating Array containing salutation and names
			String arr[][]=new String[2][];
			arr[0]= new String[] {"Mr","Mrs","Ms"};
			arr[1]= new String[] {"Pratik","Aishwarya","Surya","Dishant","Somesh","Praveen"};
			for(int i=0;i<6;i++) {
				if(arr[1][i]=="Pratik" || arr[1][i]=="Dishanth" || arr[1][i]=="Somesh"|| arr[1][i]=="Praveen") {
					System.out.println(arr[0][0]+" "+arr[1][i]);
				}
				else if(arr[1][i]=="Surya") {
					System.out.println(arr[0][1]+" "+arr[1][i]);
				}
				else if(arr[1][i]=="Aishwarya") {
					System.out.println(arr[0][2]+" "+arr[1][i]);
				}
			}
			
			

		}

}
