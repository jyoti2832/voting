import java.sql.*;
public class connection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//step1
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			Statement st=con.createStatement();
			String sql="insert into employee values(1011,'Raj','Noida',78000)";
			int x=st.executeUpdate(sql);
			System.out.println("Data saved");
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	} 

}
