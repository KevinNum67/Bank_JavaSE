package banking;

public class Customer {
	String firstName;
	String lastName;
	int numberOfAccount;
	Account[] account ;
//	SavingAccount sa;
//	CheckingAccount ca;
	
	Customer(String firstName,String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		account = new Account[5];
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
//	public SavingAccount getSaving(){
//		return this.sa;
//	}
//	
//	public CheckingAccount getChecking(){
//		return this.ca;
//	}
//	
//	public void setSaving(SavingAccount account){
//		this.sa = account;
//	}
//	
//	public void setChecking(CheckingAccount account){
//		this.ca = account;
//	}
	
	public void addAccount(Account act){
		account[numberOfAccount++] = act;
	}
	
	public Account getAccount(int index){
		return this.account[index];
	}
	
	public int getNumOfAccounts(){
		return this.numberOfAccount;
	}
	
//	public void setAccount(Account ac){
//		this.account[numberOfAccount] = ac;
//	}
	
}
