import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Connecting to the Database");
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Practicedb", "postgres", "root");
		System.out.println("Connection Established...!");

		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery("select * from student");

		while (rs.next()) {
			System.out.println(rs.getInt("ID") + "--->" + rs.getString("NAME"));
		}
	}
}
