package banking;

public class SavingAccount extends Account {
	double interestRate;
	public SavingAccount(double balance,double interest_rate){
		super(balance);
		this.interestRate = interest_rate;
	}
}
