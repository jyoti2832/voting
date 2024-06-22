import java.sql.*;
public class connection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//step1
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			Statement st=con.createStatement();
			String sql="select * from employee";
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt(4));
			}
			con.close();
				
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}

}
