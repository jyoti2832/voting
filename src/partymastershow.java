import javax.swing.*;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
public class partymastershow extends JFrame {
	JTable jt;
	String row[]= {"partyid","partyname","symbol"};
	DefaultTableModel model;
	
	public partymastershow() {
		setTitle("Party Master");
		setSize(800,800);
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
		partymastershow obj=new partymastershow();
	}
	void filldata()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from partymaster");
			model=new DefaultTableModel();
			model.setColumnIdentifiers(row);
			while(rs.next())
			{
			String aa=rs.getString(1);
			String ab=rs.getString(2);
			String ac=rs.getString(3);
			
			model.addRow(new Object[] {aa,ab,ac});
			}
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}

