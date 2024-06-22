import java.sql.*;
public class connection4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//step1
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			Statement st=con.createStatement();
			String sql="delete from employee where empid=1003";
			int x=st.executeUpdate(sql);
			System.out.println("Data Deleted");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}

}
