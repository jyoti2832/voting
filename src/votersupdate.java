import javax.swing.*;
import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class votersupdate extends JFrame implements ActionListener{
	JLabel a,b,c,d,e,f,g,h,i,j,k,l;
	JTextField t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
	JComboBox t1;
	JButton btn,btn1,btn2;
	Connection con;
	PreparedStatement st;
	ResultSet rs;
	public votersupdate()
	{
		setTitle(" Cadidates Update");
		setSize(800,1100);
		setLayout(null);
		getContentPane().setBackground(Color.RED);
		
		
	

		
		
		a=new JLabel("Voters Id");
		a.setBounds(250,70,200,50);
		a.setFont(new Font("Times New Roman",Font.BOLD,30));
		a.setForeground(Color.BLACK);
		add(a);
		t1=new JComboBox();
		t1.setBounds(500,70,120,40);
		t1.setFont(new Font("Times New Roman",Font.BOLD,20));
		t1.setForeground(Color.BLACK);
		add(t1);
		filldata();
		btn=new JButton("Find");
		btn.setBounds(335,130,80,40);
		btn.setFont(new Font("Times New Roman",Font.BOLD,20));
		btn.setForeground(Color.BLACK);
		add(btn);
		btn.addActionListener(this);
		b=new JLabel("Voter Name");
		b.setBounds(250,190,200,50);
		b.setFont(new Font("Times New Roman",Font.BOLD,30));
		b.setForeground(Color.BLACK);
		add(b);
		t2=new JTextField();
		t2.setBounds(500,190,120,40);
		t2.setFont(new Font("Times New Roman",Font.BOLD,20));
		t2.setForeground(Color.BLACK);
		add(t2);
		c=new JLabel("Father Name");
		c.setBounds(250,260,200,50);
		c.setFont(new Font("Times New Roman",Font.BOLD,30));
		c.setForeground(Color.BLACK);
		add(c);
		t3=new JTextField();
		t3.setBounds(500,260,120,40);
		t3.setFont(new Font("Times New Roman",Font.BOLD,20));
		t3.setForeground(Color.BLACK);
		add(t3);
		
		d=new JLabel("Spouse Name");
		d.setBounds(250,340,200,50);
		d.setFont(new Font("Times New Roman",Font.BOLD,30));
		d.setForeground(Color.BLACK);
		add(d);
		t4=new JTextField();
		t4.setBounds(500,340,120,40);
		t4.setFont(new Font("Times New Roman",Font.BOLD,20));
		t4.setForeground(Color.BLACK);
		add(t4);
		
		e=new JLabel("Gender");
		e.setBounds(250,410,200,50);
		e.setFont(new Font("Times New Roman",Font.BOLD,30));
		e.setForeground(Color.BLACK);
		add(e);
		t5=new JTextField();
		t5.setBounds(500,410,120,40);
		t5.setFont(new Font("Times New Roman",Font.BOLD,20));
		t5.setForeground(Color.BLACK);
		add(t5);
		
		f=new JLabel("Date Of Birth");
		f.setBounds(250,480,200,50);
		f.setFont(new Font("Times New Roman",Font.BOLD,30));
		f.setForeground(Color.BLACK);
		add(f);
		t6=new JTextField();
		t6.setBounds(500,480,120,40);
		t6.setFont(new Font("Times New Roman",Font.BOLD,20));
		t6.setForeground(Color.BLACK);
		add(t6);

		g=new JLabel("Address");
		g.setBounds(250,550,200,50);
		g.setFont(new Font("Times New Roman",Font.BOLD,30));
		g.setForeground(Color.BLACK);
		add(g);
		t7=new JTextField();
		t7.setBounds(500,550,120,40);
		t7.setFont(new Font("Times New Roman",Font.BOLD,20));
		t7.setForeground(Color.BLACK);
		add(t7);
		
		h=new JLabel("Email");
		h.setBounds(250,620,200,50);
		h.setFont(new Font("Times New Roman",Font.BOLD,30));
		h.setForeground(Color.BLACK);
		add(h);
		t8=new JTextField();
		t8.setBounds(500,620,120,40);
		t8.setFont(new Font("Times New Roman",Font.BOLD,20));
		t8.setForeground(Color.BLACK);
		add(t8);
		
		i=new JLabel("Ward Number");
		i.setBounds(250,690,200,50);
		i.setFont(new Font("Times New Roman",Font.BOLD,30));
		i.setForeground(Color.BLACK);
		add(i);
		t9=new JTextField();
		t9.setBounds(500,690,120,40);
		t9.setFont(new Font("Times New Roman",Font.BOLD,20));
		t9.setForeground(Color.BLACK);
		add(t9);
		
		j=new JLabel("City Id");
		j.setBounds(250,750,200,50);
		j.setFont(new Font("Times New Roman",Font.BOLD,30));
		j.setForeground(Color.BLACK);
		add(j);
		t10=new JTextField();
		t10.setBounds(500,750,120,40);
		t10.setFont(new Font("Times New Roman",Font.BOLD,20));
		t10.setForeground(Color.BLACK);
		add(t10);

		k=new JLabel("City");
		k.setBounds(250,820,200,50);
		k.setFont(new Font("Times New Roman",Font.BOLD,30));
		k.setForeground(Color.BLACK);
		add(k);
		t11=new JTextField();
		t11.setBounds(500,820,120,40);
		t11.setFont(new Font("Times New Roman",Font.BOLD,20));
		t11.setForeground(Color.BLACK);
		add(t11);
		
		l=new JLabel("Disable disable");
		l.setBounds(250,890,200,50);
		l.setFont(new Font("Times New Roman",Font.BOLD,30));
		l.setForeground(Color.BLACK);
		add(l);
		t12=new JTextField();
		t12.setBounds(500,890,120,40);
		t12.setFont(new Font("Times New Roman",Font.BOLD,20));
		t12.setForeground(Color.BLACK);
		add(t12);


		
		
		btn1=new JButton("Update");
		btn1.setBounds(254,950,100,40);
		btn1.setFont(new Font("Times New Roman",Font.BOLD,20));
		btn1.setForeground(Color.BLACK);
		add(btn1);
		btn1.addActionListener(this);
		btn2=new JButton("Close");
		btn2.setBounds(500,950,100,40);
		btn2.setFont(new Font("Times New Roman",Font.BOLD,20));
		btn2.setForeground(Color.BLACK);
		add(btn2);
		btn2.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		votersupdate obj=new votersupdate();

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
						("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
				String x=t1.getSelectedItem().toString();
				String sql="Select votername,fathername,spousename,gender,dob,address,email,wardno,cityid,city,disablenodisable from voters where voterid=?";
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
					
					t7.setText(rs.getString(6));
					t8.setText(rs.getString(7));
					t9.setText(rs.getString(8));
					t10.setText(rs.getString(9));
					
					t11.setText(rs.getString(10));
					
					t12.setText(String.valueOf(rs.getInt(11)));
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
			     String sql="update voters set votername=?, fathername=?,spousename=?,gender=?,dob=?,address=?,email=?,wardno=?,cityid=?,city=?,disablenodisable=? where voterid=?";
			     st=con.prepareStatement(sql);
			     st.setString(1,t2.getText());
			     st.setString(2,t3.getText());
			     
			     st.setString(3,t4.getText());
			     
			     
			     st.setString(4,t5.getText());
			     
			     st.setInt(5,Integer.parseInt(t6.getText()));
			     
			     
			     st.setString(6,t7.getText());
			     st.setString(7,t8.getText());
			     st.setString(8,t9.getText());
			     st.setString(9,t10.getText());
			     
			     st.setString(10,t11.getText());
			     st.setInt(11,Integer.parseInt(t12.getText()));
			     
			     
			     
			     st.setString(12,t1.getSelectedItem().toString());
			     int ff=st.executeUpdate();
			    JOptionPane.showMessageDialog(this, "Updated...");
			    t2.setText("");
			    t3.setText("");
			    t4.setText("");
			    t5.setText("");
			    t6.setText("");
			    t7.setText("");
			    t8.setText("");
			    t9.setText("");
			    t10.setText("");
			    t11.setText("");
			    t12.setText("");
			    
			    
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
					("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			String sql="select voterid from voters";
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
