
public class CurrentAcc extends Account {

	
	 public CurrentAcc(double accnumber, Person accholder, double balance) {
		super(accnumber, balance, accholder);
		// TODO Auto-generated constructor stub
	}

			final double overdraftlimit=100000;   
			/**
			 *   withdraw method is overloaded and checks for overdraft limit
			 */
			  
			public boolean withdraw()
	      	  {  
	         	if(overdraftlimit<getBalance())
	         		return true;
	      	   else
	      		 return false;
	      	  }
}
