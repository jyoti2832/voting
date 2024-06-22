import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;


public class servicecentreupdate extends JFrame implements ActionListener {
	JLabel serviceid,servicename,serviceaddress,serviceemail,servicephone,regno;
	JTextField serviceid1,servicename1,serviceaddress1,serviceemail1,servicephone1,regno1;
	JButton btn,btn1;
	public servicecentreupdate()
	{
		setTitle("Servicecentreupdate");
		setSize(700,700);
		setLayout(null);
		serviceid=new JLabel("ServiceId");
		serviceid.setBounds(50,60,200,30);
		
		
		
		add(serviceid);
		
		serviceid1=new JTextField();
		serviceid1.setBounds(550,60,100,30);
		
		
		add(serviceid1);
		btn=new JButton("Find");
		btn.setBounds(250,100,100,30);
		add(btn);
		btn.addActionListener(this);
		servicename=new JLabel("Service Name");
		servicename.setBounds(50,120,200,30);
		
		
		
		add(servicename);
		servicename1=new JTextField();
		servicename1.setBounds(550,120,100,30);
		add(servicename1);
		serviceaddress=new JLabel("Service Address");
		serviceaddress.setBounds(50,180,200,30);
		
		
		add(serviceaddress);
		
		serviceaddress1=new JTextField();
		serviceaddress1.setBounds(550,180,100,30);
		add(serviceaddress1);
		serviceemail=new JLabel("Service Email");
		serviceemail.setBounds(50,240,200,30);
		
		
		
		add(serviceemail);
		serviceemail1=new JTextField();
		serviceemail1.setBounds(550,240,100,30);
		add(serviceemail1);
		servicephone=new JLabel("Service Phone");
		servicephone.setBounds(50,300,200,30);
				
		
		add(servicephone);
		servicephone1=new JTextField();
		servicephone1.setBounds(550,300,100,30);
		add(servicephone1);
		regno=new JLabel("Regno");
		regno.setBounds(50,360,200,30);
		
		
		
		add(regno);
		regno1=new JTextField();
		regno1.setBounds(550,360,100,30);
		add(regno1);
		
		btn1=new JButton("Update");
		btn1.setBounds(250,420,100,30);
		add(btn1);
		btn.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		servicecentreupdate obj=new servicecentreupdate();
	}

	@Override
	public void actionPerformed(ActionEvent p) {
		// TODO Auto-generated method stub
		try
		{
			//step1
			int serviceid=Integer.parseInt(serviceid1.getText());
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			String sql="select servicename,serviceaddress,serviceemail,servicephone,regno from servicecentre where servid=?";
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1,serviceid);
						
			int x=st.executeUpdate();
			ResultSet rs=st.executeQuery();
			if(rs.next()) 
			{
				servicename.setText(rs.getString(1));
				serviceemail.setText(rs.getString(2));
				serviceaddress.setText(String.valueOf(rs.getString(3)));
			}
			else
			{
				JOptionPane.showMessageDialog(this,"Not Found");
			}
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

}
