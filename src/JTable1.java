import javax.swing.*;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
public class JTable1 extends JFrame {
	JTable jt;
	String row[]= {"billid","custid","custname","address","amount"};
	DefaultTableModel model;
	
	public JTable1() {
		setTitle("Myframe");
		setSize(900,900);
		jt=new JTable();
		filldata();
		jt.setModel(model);
		JScrollPane jp=new JScrollPane(jt);
		add(jp);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JTable1 obj=new JTable1();
	}
	void filldata()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from billing");
			model=new DefaultTableModel();
			model.setColumnIdentifiers(row);
			while(rs.next())
			{
			String aa=String.valueOf(rs.getInt(1));
			String ab=String.valueOf(rs.getInt(2));
			String ac=rs.getString(3);
			String ad=rs.getString(4);
			String ae=String.valueOf(rs.getInt(5));
			model.addRow(new Object[] {aa,ab,ac,ad,ae});
			}
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
