import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDOperation {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Practicedb", "postgres", "root");

		//Create Table
		Statement st = con.createStatement();
		int n = st.executeUpdate("create table employee(emp_id int,emp_name varchar(20),emp_salary int");
		System.out.println("Number of rows affected :" + n);

		//Insert records into table
		Statement st = con.createStatement();
		int n = st.executeUpdate(
				"insert into employee values(101,'Kiran',75000),(102,'Sachin',160000),(103,'Chintu',65000)");
		System.out.println("Number of rows affected :" + n);
		con.close();

		//Update records in table
		Statement st = con.createStatement();
		int n = st.executeUpdate("update employee set emp_name='Ashish' where emp_id=103");
		System.out.println("Number of rows affected :" + n);
		con.close();

		//Delete Records From Table
		Statement st = con.createStatement();
		int n = st.executeUpdate("delete from employee where emp_id=101");
		System.out.println("Number of rows affected :" + n);
		con.close();

	}

}
