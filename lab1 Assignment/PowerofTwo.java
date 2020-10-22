import java.util.Scanner;
public class PowerofTwo {
	int n;
	private static boolean ispowerofTwo(int n)
	{
		 if (n == 0) 
	            return false; 
	  
	        while (n != 1) { 
	            if (n % 2 != 0) 
	                return false; 
	            n = n / 2; 
	        } 
	        return true;
	}
	public static void main(String args[])
	{
		
		if (ispowerofTwo(21)) 
            System.out.println("True"); 
        else
            System.out.println("False"); 
	}

}
