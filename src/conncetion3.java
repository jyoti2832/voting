import java.sql.*;
public class conncetion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//Step2
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			Statement st=con.createStatement();
			String sql="update employee set salary=99000 where empid=1002";
			int x=st.executeUpdate(sql);
			System.out.println("Data Updated");
			con.close();
					
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
