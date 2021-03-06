package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;

import model.User;
import utility.ConnectionManager;

public class UserDAO implements UserDaoInterface {

	public int signUp(User user) {
		String INSERT_USERS_SQL = "INSERT INTO blogger(email, password)VALUES(?,?)";

		int result = 0;
		try
		{
			Connection connection = ConnectionManager.getConnection();
			// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
			preparedStatement.setString(1,user.getEmail());
			preparedStatement.setString(2,user.getPassword());
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			result = preparedStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	public boolean loginUser(User user) {
		boolean status = false;
		try{
			Connection connection = ConnectionManager.getConnection();
		
				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement("select * from blogger where email = ? and password = ? ");
		
			preparedStatement.setString(1, user.getEmail());
			preparedStatement.setString(2, user.getPassword());

			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			status = rs.next();

		} catch (Exception e) {
			// process sql exception
			System.out.println(e);
		}
		return status;
	}

}
