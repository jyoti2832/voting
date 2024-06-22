import javax.swing.*;
import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class cadidatesupdate extends JFrame implements ActionListener{
	JLabel a1,a,b,c,d,e,f;
	JTextField t2,t3,t4,t5,t6;
	JComboBox t1;
	JButton btn,btn1,btn2;
	Connection con;
	PreparedStatement st;
	ResultSet rs;
	public cadidatesupdate()
	{
		setTitle(" Cadidates Update");
		setSize(800,800);
		setLayout(null);
		getContentPane().setBackground(Color.DARK_GRAY);
		
		
	
		a1=new JLabel("Cnadiadte Update ");
		a1.setBounds(300,20,500,80);
		a1.setFont(new Font("Times New Roman",Font.BOLD,50));
		a1.setForeground(Color.BLACK);
		add(a1);
		
		a=new JLabel("Cnadiadte Id");
		a.setBounds(250,140,200,50);
		a.setFont(new Font("Times New Roman",Font.BOLD,30));
		a.setForeground(Color.BLACK);
		add(a);
		t1=new JComboBox();
		t1.setBounds(500,140,150,40);
		t1.setFont(new Font("Times New Roman",Font.BOLD,20));
		t1.setForeground(Color.BLACK);
		add(t1);
		filldata();
		btn=new JButton("Find");
		btn.setBounds(335,210,80,40);
		btn.setFont(new Font("Times New Roman",Font.BOLD,20));
		btn.setForeground(Color.BLACK);
		add(btn);
		btn.addActionListener(this);
		b=new JLabel("Name");
		b.setBounds(250,270,200,50);
		b.setFont(new Font("Times New Roman",Font.BOLD,30));
		b.setForeground(Color.BLACK);
		add(b);
		t2=new JTextField();
		t2.setBounds(500,270,150,40);
		t2.setFont(new Font("Times New Roman",Font.BOLD,20));
		t2.setForeground(Color.BLACK);
		add(t2);
		c=new JLabel("Address");
		c.setBounds(250,340,200,50);
		c.setFont(new Font("Times New Roman",Font.BOLD,30));
		c.setForeground(Color.BLACK);
		add(c);
		t3=new JTextField();
		t3.setBounds(500,340,150,40);
		t3.setFont(new Font("Times New Roman",Font.BOLD,20));
		t3.setForeground(Color.BLACK);
		add(t3);
		
		d=new JLabel("Phone Number");
		d.setBounds(250,410,200,50);
		d.setFont(new Font("Times New Roman",Font.BOLD,30));
		d.setForeground(Color.BLACK);
		add(d);
		t4=new JTextField();
		t4.setBounds(500,410,150,40);
		t4.setFont(new Font("Times New Roman",Font.BOLD,20));
		t4.setForeground(Color.BLACK);
		add(t4);
		
		e=new JLabel("Legal Cases");
		e.setBounds(250,480,200,50);
		e.setFont(new Font("Times New Roman",Font.BOLD,30));
		e.setForeground(Color.BLACK);
		add(e);
		t5=new JTextField();
		t5.setBounds(500,480,150,40);
		t5.setFont(new Font("Times New Roman",Font.BOLD,20));
		t5.setForeground(Color.BLACK);
		add(t5);
		
		f=new JLabel("NOC");
		f.setBounds(250,550,200,50);
		f.setFont(new Font("Times New Roman",Font.BOLD,30));
		f.setForeground(Color.BLACK);
		add(f);
		t6=new JTextField();
		t6.setBounds(500,550,150,40);
		t6.setFont(new Font("Times New Roman",Font.BOLD,20));
		t6.setForeground(Color.BLACK);
		add(t6);

		
		
		
		btn1=new JButton("Update");
		btn1.setBounds(254,650,150,40);
		btn1.setFont(new Font("Times New Roman",Font.BOLD,20));
		btn1.setForeground(Color.BLACK);
		add(btn1);
		btn1.addActionListener(this);
		btn2=new JButton("Close");
		btn2.setBounds(500,650,150,40);
		btn2.setFont(new Font("Times New Roman",Font.BOLD,20));
		btn2.setForeground(Color.BLACK);
		add(btn2);
		btn2.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cadidatesupdate obj=new cadidatesupdate();

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
				String sql="Select name,address,phoneno,legalcases,noc from cadidates where cnadiadteid=?";
				st=con.prepareStatement(sql);
				st.setString(1, x);
				rs=st.executeQuery();
				if(rs.next())
				{
					t2.setText(rs.getString(1));
					t3.setText(rs.getString(2));
					
					t4.setText(rs.getString(3));
					t5.setText(rs.getString(4));
					t6.setText(String.valueOf(rs.getInt(5)));
					
					
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
			     String sql="update cadidates set name=?,address=?,phoneno=?,legalcases=?,noc=? where cnadiadteid=?";
			     st=con.prepareStatement(sql);
			     st.setString(1,t2.getText());
			     st.setString(2,t3.getText());
			     
			     st.setString(3,t4.getText());
			     st.setString(4,t5.getText());
			     st.setInt(5,Integer.parseInt(t6.getText()));
			     
			     
			     
			     st.setString(6,t1.getSelectedItem().toString());
			     int ff=st.executeUpdate();
			    JOptionPane.showMessageDialog(this, "Updated...");
			    t2.setText("");
			    t3.setText("");
			    t4.setText("");
			    t5.setText("");
			    t6.setText("");
			    
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
			String sql="select cnadiadteid from cadidates";
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
