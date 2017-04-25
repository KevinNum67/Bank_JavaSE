package banking.reports;

import banking.*;

public class CustomerReport   {
	
	//public CustomerReport(){}
	
	public void generateReport(Bank bank,Customer customer) {
		
		System.out.println("\t\t\tCUSTOMERS REPORT");
		System.out.println("\t\t\t================");

	for (int cust_idx = 0; cust_idx < bank.getNumOfCustomers(); cust_idx++) {
		customer = bank.getCustomer(cust_idx);

		
		System.out.println("Customer: " + customer.getLastName() + ", "
				+ customer.getFirstName());

		for (int acct_idx = 0; acct_idx < customer.getNumOfAccounts(); acct_idx++) {
			Account account = customer.getAccount(acct_idx);
			
			String account_type = "hello";
			
			if (account instanceof SavingAccount) {
				account_type = "Savings Account";
			} else if (account instanceof CheckingAccount) {
				account_type = "Checking Account";
			}
			
			System.out.println(account_type + ": current balance is гд"
					+ account.getBalance());
		}
		
		
	}

}
}