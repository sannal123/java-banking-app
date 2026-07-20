package banking;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static Connection con;
	public static Connection getConnection() {
		try {
			String mysqlJDBCDriver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/BANK";
			String user ="root";
			String pass ="Admin";
			
			Class.forName(mysqlJDBCDriver);
			con=DriverManager.getConnection(url, user, pass);
		}catch(Exception e) {
			System.out.println("Connection failed ! "+ e.getMessage());
		}
		return con;
	}
}
