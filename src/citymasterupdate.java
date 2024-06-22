import javax.swing.*;
import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class citymasterupdate extends JFrame implements ActionListener{
	JLabel a,b,c,d,e;
	JTextField t2,t3,t4,t5;
	JComboBox t1;
	JButton btn,btn1,btn2;
	Connection con;
	PreparedStatement st;
	ResultSet rs;
	public citymasterupdate()
	{
		setTitle(" City Master Update");
		setSize(800,800);
		setLayout(null);
		getContentPane().setBackground(Color.PINK);
		a=new JLabel("City Id");
		a.setBounds(250,70,100,50);
		a.setFont(new Font("Times New Roman",Font.BOLD,30));
		a.setForeground(Color.BLACK);
		add(a);
		
		t1=new JComboBox();
		t1.setBounds(400,70,120,40);
		a.setFont(new Font("Times New Roman",Font.BOLD,30));
		a.setForeground(Color.BLACK);
		add(t1);
		filldata();
		btn=new JButton("Find");
		btn.setBounds(335,130,80,40);
		btn.setFont(new Font("Times New Roman",Font.BOLD,20));
		btn.setForeground(Color.BLACK);
		add(btn);
		btn.addActionListener(this);
		b=new JLabel("City Name");
		b.setBounds(250,190,200,50);
		b.setFont(new Font("Times New Roman",Font.BOLD,30));
		b.setForeground(Color.BLACK);
		add(b);
		t2=new JTextField();
		t2.setBounds(400,190,120,40);
		t2.setFont(new Font("Times New Roman",Font.BOLD,20));
		t2.setForeground(Color.BLACK);
		add(t2);
		c=new JLabel("Population");
		c.setBounds(250,260,100,50);
		c.setFont(new Font("Times New Roman",Font.BOLD,30));
		c.setForeground(Color.BLACK);
		add(c);
		t3=new JTextField();
		t3.setBounds(400,260,120,40);
		t3.setFont(new Font("Times New Roman",Font.BOLD,20));
		t3.setForeground(Color.BLACK);
		add(t3);
		
		d=new JLabel("State");
		d.setBounds(250,340,100,50);
		d.setFont(new Font("Times New Roman",Font.BOLD,30));
		d.setForeground(Color.BLACK);
		add(d);
		t4=new JTextField();
		t4.setBounds(400,340,120,40);
		t4.setFont(new Font("Times New Roman",Font.BOLD,20));
		t4.setForeground(Color.BLACK);
		add(t4);
		
		e=new JLabel("Pincode");
		e.setBounds(250,410,100,50);
		e.setFont(new Font("Times New Roman",Font.BOLD,30));
		e.setForeground(Color.BLACK);
		add(e);
		t5=new JTextField();
		t5.setBounds(400,410,120,40);
		t5.setFont(new Font("Times New Roman",Font.BOLD,20));
		t5.setForeground(Color.BLACK);
		add(t5);
		
		
		
		
		btn1=new JButton("Update");
		btn1.setBounds(250,550,80,40);
		add(btn1);
		btn1.addActionListener(this);
		btn2=new JButton("Close");
		btn2.setBounds(450,550,80,40);
		add(btn2);
		btn2.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		citymasterupdate obj=new citymasterupdate();

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
				String sql="Select cityname,population,state,pincode from citymaster where cityid=?";
				st=con.prepareStatement(sql);
				st.setString(1, x);
				rs=st.executeQuery();
				if(rs.next())
				{
					t2.setText(rs.getString(1));
					t3.setText(String.valueOf(rs.getInt(2)));
					t4.setText(rs.getString(3));
					t5.setText(rs.getString(4));
				}
				con.close();
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
		if(ae.getSource()==btn1)
		{
			try 
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				 con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			     String sql="update citymaster set cityname=?,population=?,state=?,pincode=? where cityid=?";
			     st=con.prepareStatement(sql);
			     st.setString(1,t2.getText());
			     st.setInt(2,Integer.parseInt(t3.getText()));
			     st.setString(3,t4.getText());
			     st.setString(4,t5.getText());
			     
			     st.setString(5,t1.getSelectedItem().toString());
			     int ff=st.executeUpdate();
			    JOptionPane.showMessageDialog(this, "Updated...");
			    t2.setText("");
			    t3.setText("");
			    t4.setText("");
			    t5.setText("");
			    
			    con.close();
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
		if(ae.getSource()==btn2)
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
