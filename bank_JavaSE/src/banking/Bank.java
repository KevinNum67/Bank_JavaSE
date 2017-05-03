package banking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {
	
	private List<Customer> customers;
	
	private Bank(){
		customers = new ArrayList<Customer>();
	}
	
	public static Bank instance = new Bank();
	
	public static Bank getBank(){
		return instance;
		
	}
	public void addCustomer(String f,String l){
		Customer cust = new Customer(f,l);
		customers.add(cust);
	}
	
	public int getNumOfCustomers(){
		return customers.size();
	}
	
	public Customer getCustomer(int index){
		return customers.get(index);
	}
	
	public Iterator<Customer> getCustomer(){
		return customers.iterator();
	}
	
}
