/*

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.Vector;

public class Jdbc 
{
	public LinkedList<String> getadmin(int aid,int bid,int cid,int oid,int abill,int bbil,int cbill,int obill,int tbill )
	{
		String query = "select * from Userdb  where Bill id 1='" + aid + "' AND bill<=" + abill + "Bill id 2='" + bid + "' AND bill<=" + bbil +"Bill id 2='" + aid + "' AND bill<=" + cbill +"Bill id 4='" + oid + "' AND bill<=" + obill;  
		LinkedList<String> data = new LinkedList<String>();
		try 
		{
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hamzadude");
			System.out.println("Connection Established");
			Statement stmt=con.createStatement();  
			ResultSet rs = stmt.executeQuery(query);
			String temp = "";
			while(rs.next()) 
			{
				temp += rs.getString("user id");
				temp += "|";
				temp += rs.getString("Billid1");
				temp += "|";
				temp += rs.getString("Billid2");
				temp += "|";
				temp += rs.getString("Billid3");
				temp += "|";
				temp += rs.getString("Billid4");
				temp += "|";
					data.add(temp);
			}
			System.out.println("Connection Established");
    		con.close();
		}
    	catch(ClassNotFoundException e)
    	{
    		System.out.println("Diver not loaded..");
    	}
    	catch(SQLException e)
    	{
    		System.out.println("Connection not established...");
    	}
		
		
		
		
		return data;
		
}
}*/