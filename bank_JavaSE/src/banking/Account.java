package banking;

public class Account {
	protected double balance ;
	
	Account(double init_balance){
		this.balance = init_balance;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public boolean deposit(double amt){
		this.balance += amt;
		return true;
	}
	
	public void withdraw(double amt) throws OverdraftException {
		if(amt>this.balance){
			System.out.println("×Ê½ð²»×ã"+(amt-this.balance));
		}else{
			this.balance -= amt;
		}	
	}
}
