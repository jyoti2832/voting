import javax.swing.*;

import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.sql.*;
public class votersshow extends JFrame {
	JTable jt;
	String row[]= {"Voterid","Voter Name"," Father Name","Spouse Name","Gender","DOB","Address","Email","Ward Number","City Id","City","Disable No Disable"};
	DefaultTableModel model;
	
	public votersshow() {
		setTitle("Voters");
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
		votersshow obj=new votersshow();
	}
	void filldata()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from voters");
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
			
			String ag=rs.getString(7);
			String ah=rs.getString(8);
			String ai=rs.getString(9);
			
			String aj=rs.getString(10);
			
			String ak=rs.getString(11);
			String al=String.valueOf(rs.getInt(12));
			
			model.addRow(new Object[] {aa,ab,ac,ad,ae,af,ag,ah,ai,aj,ak,al});
			}
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}

