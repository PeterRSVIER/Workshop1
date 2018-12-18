package user;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.login;


public class AccountDaoImpl implements AccountDao {

	
	
	public String createAccount(Account account) {
	PreparedStatement preparedStatement;
	String sqlString = "...";
	try {
		login.createconnection();
		Statement statement = login.connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sqlString);
		login.connection.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


		
		
		
		return null;
	}

	public String updateAccount(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteAccount(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

	public Account getAccountByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
}
	

