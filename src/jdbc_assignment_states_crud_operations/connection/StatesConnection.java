package jdbc_assignment_states_crud_operations.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StatesConnection {
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/hrs_java";
			String user = "root";
			String pass = "j2ee@2023";
			
			return DriverManager.getConnection(url, user, pass);
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	
	

}
