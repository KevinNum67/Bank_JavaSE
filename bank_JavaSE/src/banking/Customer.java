package banking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {
	String firstName;
	String lastName;
//	int numberOfAccount;
//	Account[] account ;
//	SavingAccount sa;
//	CheckingAccount ca;
	
	private List<Account> accounts;
	Customer(String firstName,String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new ArrayList<Account>();
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public Account getAccount(int index){
		return accounts.get(index);
	}
	public void addAccount(Account account){
		accounts.add(account);
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
	
//	public void addAccount(Account act){
//		account[numberOfAccount++] = act;
//	}
	
//	public Account getAccount(int index){
//		return this.account[index];
//	}
	
	public int getNumOfAccounts(){
		return accounts.size();
	}
	
	public Iterator<Account> getAccounts(){
		return accounts.iterator();
	}
	
//	public void setAccount(Account ac){
//		this.account[numberOfAccount] = ac;
//	}
	
}
