package banking;

public class CheckingAccount extends Account{
	SavingAccount protectedBy;
	double overdraftProtection;
	
//	CheckingAccount(double balance,SavingAccount protectedBy){
//		super(balance);
//		this.protectedBy = protectedBy;
//	}
	
	public CheckingAccount(double balance){
		super(balance);
	}
	
	public CheckingAccount(double balance,double overdraftProtection){
		super(balance);
		this.overdraftProtection = overdraftProtection;
	}
	
	public boolean withdraw(double amt){
		if(protectedBy!=null&&protectedBy.getBalance()>(amt-this.getBalance())){
				protectedBy.withdraw(amt - this.getBalance());
				this.balance =0;
				return true;
			}
		else if (amt<=this.getBalance()){
			this.balance -= amt;
			return true;
		}
		else{
			
			return false;
		}
	}
	

}
