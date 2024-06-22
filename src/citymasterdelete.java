import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;

public class citymasterdelete extends JFrame implements ActionListener{
	JLabel a1,a;
	JComboBox t1;
	JButton btn,btn1;
	Connection con;
	PreparedStatement st;
	ResultSet rs;
	public citymasterdelete()
	{
		setTitle("City Master Deleted");
		setSize(2000,2000);
		setLayout(null);
		getContentPane().setBackground(Color.CYAN);
		
		a1=new JLabel("City Master Delete");
		a1.setBounds(800,50,600,80);
		a1.setFont(new Font("Times New Roman",Font.BOLD,50));
		a1.setForeground(Color.BLACK);
		add(a1);
		a=new JLabel("Cityid");
		a.setBounds(800,150,600,80);
		a.setFont(new Font("Times New Roman",Font.BOLD,40));
		a.setForeground(Color.BLACK);
		add(a);
		t1=new JComboBox();
		t1.setBounds(950,170,100,40);
		t1.setFont(new Font("Times New Roman",Font.BOLD,20));
		t1.setForeground(Color.BLACK);
		t1.setBackground(Color.ORANGE);
		add(t1);
		filldata();
		btn=new JButton("Delete");
		btn.setBounds(800,300,120,80);
		btn.setFont(new Font("Times New Roman",Font.BOLD,20));
		btn.setForeground(Color.BLACK);
		btn.setBackground(Color.PINK);
		add(btn);
		btn.addActionListener(this);
		btn1=new JButton("Close");
		btn1.setFont(new Font("Times New Roman",Font.BOLD,20));
		btn1.setForeground(Color.BLACK);
		btn1.setBounds(1000,300,120,80);
		btn1.setBackground(Color.GRAY);
		add(btn1);
		btn1.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		citymasterdelete obj=new citymasterdelete();

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
				String sql="delete from citymaster where cityid=?";
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
			String sql="select cityid from citymaster";
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
