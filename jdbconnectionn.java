package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class jdbconnectionn {
	private jdbconnectionn(){
		
	}
		public static Connection getJdbcConnection() throws SQLException 
		{
			
		 String url="jdbc:mysql://localhost:3306/ganesh";
			String user="root";
			String password="root123";
			Connection connection=DriverManager.getConnection(url, user, password);
			
			
			
					if(connection!=null) {
						return connection;
					}
			
			return getJdbcConnection();
		}
	 
		public static void closeConnection(ResultSet resultSet,Statement statement, Connection connection) throws SQLException 
		{
		 if(resultSet!=null) {
					resultSet.close();
				}
			if(statement!=null) {
					statement.close();
					
				}
			if(connection !=null) {
				connection.close();
				System.out.println("connection succesfully closed!!!!!");
			}
		
		}
}
