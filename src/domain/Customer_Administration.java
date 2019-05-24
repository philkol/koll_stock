package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer_Administration 
{
	private List <Customer> customers;
	
	public Customer_Administration() 
	{
		customers = new ArrayList<>();
	}	
		
	public void add(Customer a) 
	{
		customers.add(a);
	}
	
	public void clear() 
	{
		customers.clear();
	}

	public void remove(Customer a) 
	{
		customers.remove(a);
	}

	public void remove(Customer... acc) 
	{
		for (Customer a: acc) {
			remove(a);
		}
	}

	public void add(Customer... acc) {
		for (Customer a: acc) {
			add(a);
		}
	}
	
	public void addAll( List<Customer> customerList ) {
		customers.addAll( customerList );
	}
	
	public List<Customer> getAccounts(){
		return Collections.unmodifiableList( customers );
	}
	
	@Override
	public String toString() 
	{
		return "Customer_Verwaltung [customers=" + customers + "]";
	}
}
