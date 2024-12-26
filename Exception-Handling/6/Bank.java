/*create a userdefined exception or custom defiened excption which can raise InsufientFundException */
import p.InsufientFundException;

class Bank{
	
	float balance = 15000;
	void withdraw(float amount)throws InsufientFundException{
		if(amount<balance){	
			System.out.println("Success");
		}
		else{
			InsufientFundException obj = new InsufientFundException("withdraw is greater than balance");
			throw obj;
		}
	}
	public static void main(String args[])throws InsufientFundException{
		new Bank().withdraw(1500);
	}
}
