import javax.swing.*;

import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.sql.*;
public class cadidatesshow extends JFrame {
	JTable jt;
	String row[]= {"Cnadidteid","Name","Address","Phoneno","Legalcases","Noc"};
	DefaultTableModel model;
	
	public cadidatesshow() {
		setTitle("Cadidates");
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
		cadidatesshow obj=new cadidatesshow();
	}
	void filldata()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from cadidates");
			model=new DefaultTableModel();
			model.setColumnIdentifiers(row);
			while(rs.next())
			{
			String aa=rs.getString(1);
			String ab=rs.getString(2);
			String ac=rs.getString(3);
			String ad=rs.getString(4);
			String ae=rs.getString(5);
			
			String af=String.valueOf(rs.getInt(6));
			model.addRow(new Object[] {aa,ab,ac,ad,ae,af});
			}
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}

