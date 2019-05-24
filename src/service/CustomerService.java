package service;

import java.sql.Connection;

import domain.Customer_Administration;
import domain.CustomerException;
import persistence.CustomerRepository;

public class CustomerService
{
	private Connection con;
	private CustomerRepository customerRepository;

	public CustomerService(Connection con)
	{
		this.con=con;
		this.customerRepository = new CustomerRepository();
	}

	public void getCustomers(Customer_Administration administration) throws CustomerException
	{
		administration.clear();
		administration.addAll(customerRepository.selectAll(con));
	}
}