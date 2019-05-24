package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import domain.Customer;
import domain.CustomerException;

public class CustomerRepository
{
	private final static String SQL_SELECT_ALL = 
		"SELECT CUSTOMER_ID, \n" +
		"	EMAIL, \n" +
		"	FIRSTNAME, \n" +
		"	LASTNAME, \n" +
		"	GENDER, \n" +
		"	BIRTHDATE, \n" +
		"	CREDITS\n" +
		"FROM	CUSTOMER";
	private PreparedStatement selectAllStatement;

	public List<Customer> selectAll (Connection con) throws CustomerException
	{	
		try 
		{
			if(selectAllStatement == null)
			{
				selectAllStatement = con.prepareStatement(SQL_SELECT_ALL);
			}
			ResultSet resultSet = selectAllStatement.executeQuery();
			if(resultSet != null)
			{
				List<Customer> customers = new ArrayList<>();
				while(resultSet.next()) 
				{
					Long customer_ID = resultSet.getLong(1);
					String email = resultSet.getString(2);
					String firstname = resultSet.getString(3);
					String lastname = resultSet.getString(4);
					String gender = resultSet.getString(5);
					LocalDateTime birthdate = resultSet.getTimestamp(6).toLocalDateTime();
					Long credits = resultSet.getLong(7);
					customers.add(new Customer(customer_ID, email, firstname, lastname, gender, birthdate, credits));
				}
				return customers;			 
			}
			else
			{
				throw new CustomerException("Could not read data form database!");
				
			}
		}
		catch (SQLException e)
		{
			throw new CustomerException("Could not execute SQL statement!");
		}
	}
	
}
