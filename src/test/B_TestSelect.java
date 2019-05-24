package test;

import connection.OracleConnection;
import domain.Customer_Administration;
import domain.CustomerException;
import service.CustomerService;

public class B_TestSelect
{
	public static void main(String[] args)
	{
		try
		{
			Customer_Administration administration = new Customer_Administration();
			OracleConnection oracon;
			oracon = new OracleConnection();
			CustomerService customerService = new CustomerService(oracon.getConnection());
			customerService.getCustomers(administration);
			System.out.println(administration);
		}
		catch (CustomerException e)
		{
			System.out.println(e.getMessage());
		}
		 

	}

}
