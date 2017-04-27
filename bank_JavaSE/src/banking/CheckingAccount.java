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
	
	public void withdraw(double amt) throws OverdraftException{
//		if(protectedBy!=null&&protectedBy.getBalance()>(amt-this.getBalance())){
//				protectedBy.withdraw(amt - this.getBalance());
//				this.balance =0;
//			}
		if (amt<=this.getBalance()){
			this.balance -= amt;	
		}
		else if (amt>this.getBalance()&&overdraftProtection == 0){
			System.out.println("Exception: no overdraft protection Deficit: "+(amt-this.getBalance()));	
		}else if (amt>this.getBalance()&&overdraftProtection<(amt-this.getBalance())){
			System.out.println("Exception: Insufficient funds for"
					+ " overdraft protection Deficit: "+amt);	
		}else if (amt>this.getBalance()&&overdraftProtection>(amt-this.getBalance())){
			overdraftProtection -= amt - this.getBalance();
			this.balance = 0;
		}
	}
	

}
