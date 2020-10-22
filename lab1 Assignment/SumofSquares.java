import java.util.Scanner;
public class SumofSquares {
	public static void main(String args[])
	{
	 int num;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number:");
	 num=sc.nextInt();
	 System.out.println(calculateDiff(num));
	 
}
	private static int calculateDiff(int num) {
		int a,b,result;
		a=(num*(num+1)*(2*num+1))/6;
		b=(num*(num+1))/2;
		result=a+b;
		return a-result;
	}
}
