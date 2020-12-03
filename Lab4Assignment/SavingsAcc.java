
public class SavingsAcc  extends Account{

	
	
	public SavingsAcc(double accnumber, Person accholder, double balance) {
		super(accnumber, balance, accholder);
		// TODO Auto-generated constructor stub
	}
	final double minimum_balance=500;
   
     public void withdraw(double amount)
 	{  
    	if(getBalance()>minimum_balance)
    	{   double bal;
    		bal=getBalance()-amount;
    		setBalance(bal);
    	}
 	   else
 	   {
 		 System.out.println(" WithDraw not possible");
 		 System.exit(0);
 	   }
 	}
}
