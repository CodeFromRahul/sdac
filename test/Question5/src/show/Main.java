package show;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class Main {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");
	ResultSet resultSet = connection.prepareStatement("select * from info").executeQuery();
	while(resultSet.next()) {
//	resultSet.getInt(1);
//	resultSet.getString(2);
		System.out.println(resultSet.getInt(1));
		System.out.println(resultSet.getString(2));
	}
	System.out.println("Select");
	connection.close();
	
	
}
}
