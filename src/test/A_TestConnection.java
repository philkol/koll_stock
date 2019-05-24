package test;

import java.sql.Connection;
import java.sql.SQLException;

import connection.OracleConnection;
import domain.CustomerException;

public class A_TestConnection {

	public static void main(String[] args) {
		try //try catch Behandlung
		{
			OracleConnection oracon=new OracleConnection(); //Connection instanziert
			oracon.open(); //�ffnen
			
			Connection con = oracon.getConnection(); //herholen
			System.out.println(con.getMetaData().getDatabaseMajorVersion());
												//DatenbankversionsNr ausgeben
			oracon.close(); //schlie�en
		} 
		catch (CustomerException | SQLException e) 
		{
			System.out.println(e.getMessage());
		}

	}

}
