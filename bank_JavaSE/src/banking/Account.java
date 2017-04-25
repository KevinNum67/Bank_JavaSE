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
	
	public boolean withdraw(double amt){
		if(amt>this.balance){
			return false;
		}else{
			this.balance -= amt;
			return true;
		}	
	}
}
