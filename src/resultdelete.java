import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;

public class resultdelete extends JFrame implements ActionListener{
	JLabel p1,a;
	JComboBox t1;
	JButton btn,btn1;
	Connection con;
	PreparedStatement st;
	ResultSet rs;
	public resultdelete()
	{
		setTitle("Result Deleted");
		setSize(800,800);
		setLayout(null);
		getContentPane().setBackground(Color.GREEN);
		
		p1=new JLabel("Result Delete");
		p1.setBounds(250,20,250,30);
		p1.setFont(new Font("Times New Roman",Font.BOLD,40));
		p1.setForeground(Color.BLACK);
	
		add(p1);
		a=new JLabel("Ward ID");
		a.setBounds(250,70,200,50);
		a.setFont(new Font("Times New Roman",Font.BOLD,30));
		a.setForeground(Color.BLACK);
	
		add(a);
		t1=new JComboBox();
		t1.setBounds(500,70,200,40);
		add(t1);
		filldata();
		btn=new JButton("Delete");
		btn.setBounds(250,150,80,40);
		
	
		
		add(btn);
		btn.addActionListener(this);
		btn1=new JButton("Close");
		btn1.setBounds(380,150,80,40);
		add(btn1);
		btn1.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		resultdelete obj=new resultdelete();

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==btn)
		{
			try 
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection
						("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
				String x=t1.getSelectedItem().toString();
				String sql="delete from result where wardid=?";
				st=con.prepareStatement(sql);
				st.setString(1,x);
				int p=st.executeUpdate();
				JOptionPane.showMessageDialog(this,"Deleted");
				con.close();
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
		if(ae.getSource()==btn1)
		{
			this.dispose();
		}
		
	}
	void filldata()
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
			String sql="select wardid from result";
			Statement str=con.createStatement();
			ResultSet rst=str.executeQuery(sql);
			while(rst.next())
			{
				t1.addItem(rst.getString(1));
			}
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}

