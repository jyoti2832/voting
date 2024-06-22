import javax.swing.*;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
public class bcadata1 extends JFrame {
	JTable jt;
	String row[]= {"rollno","name","city","sem","marks"};
	DefaultTableModel model;
	
	public bcadata1() {
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
		bcadata1 obj=new bcadata1();
	}
	void filldata()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from bcadata");
			model=new DefaultTableModel();
			model.setColumnIdentifiers(row);
			while(rs.next())
			{
			String aa=String.valueOf(rs.getInt(1));
			String ab=rs.getString(2);
			String ac=rs.getString(3);
			String ad=String.valueOf(rs.getInt(4));
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