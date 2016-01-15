package dbtest;

import java.sql.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumDatabaseTesting {

	public static void main(String[] args){
		//Test Data
		//Connecting to database
		Connection conn = null;
		String url = "jdbc:mariadb://localhost:3306";
		String databaseName = "/test";
		String username = "root";
		String password = "root";
		try{
			
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url+databaseName, username, password);
	
		String sqlQuerry = "Select * from thurstab";
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sqlQuerry);
	      while (result.next())
	      {
	        int ID = result.getInt("ID");
	        String name = result.getString("Name");
	        String lastName = result.getString("Lastname");
	        
	        String email = result.getString("Email");
	        String zip = result.getString("ZIP");
	         
	        // print the results
	        System.out.format("%s, %s, %s, %s, %s\n", ID, name, lastName, email, zip);
	        
	      }
	      result.close();
	      statement.close();

			

	
		}
			catch(Exception e){
			System.out.println(e);
		}
			finally{
			if(conn!=null){
		conn=null;
	}
		}
		}

}
/*
From this table : 
1234, Rahu, ram, ram@nam.com, 22043
1235, Santosh, Koirala, Santosh@nam.com, 22221
1236, Nabnita, Roy, Nabnita@nam.com, 22201
1237, Bhavya, Nunna, Bhav@nam.com, 22041



*/
