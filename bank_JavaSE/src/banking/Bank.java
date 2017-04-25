package banking;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomer;
	
	private Bank(){
		customers = new Customer[6];
	}
	
	public static Bank getBank(){
		return new Bank();
	}
	
	public void addCustomer(String f,String l){
		customers[numberOfCustomer++] = new Customer(f,l);
	}
	
	public int getNumOfCustomers(){
		return numberOfCustomer;
	}
	
	public Customer getCustomer(int index){
		return customers[index];
	}
	
}
