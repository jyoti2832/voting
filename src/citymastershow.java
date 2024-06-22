import javax.swing.*;

import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.sql.*;
public class citymastershow extends JFrame {
	JTable jt;
	String row[]= {"Cityid","Cityname","Population","State","Pincode"};
	DefaultTableModel model;
	
	public citymastershow() {
		setTitle("City Master");
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
		citymastershow obj=new citymastershow();
	}
	void filldata()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from citymaster");
			model=new DefaultTableModel();
			model.setColumnIdentifiers(row);
			while(rs.next())
			{
			String aa=rs.getString(1);
			String ab=rs.getString(2);
			String ac=String.valueOf(rs.getInt(3));
			String ad=rs.getString(4);
			String ae=rs.getString(5);
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

