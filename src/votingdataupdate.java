import javax.swing.*;
import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class votingdataupdate extends JFrame implements ActionListener{
	JLabel a,b,c;
	JTextField t2,t3;
	JComboBox t1;
	JButton btn,btn1,btn2;
	Connection con;
	PreparedStatement st;
	ResultSet rs;
	public votingdataupdate()
	{
		setTitle(" Voting Data Update");
		setSize(800,800);
		setLayout(null);
		getContentPane().setBackground(Color.RED);
		
		
	

		
		
		a=new JLabel("Voter Id");
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
		b=new JLabel(" Candidate ID");
		b.setBounds(250,190,200,50);
		b.setFont(new Font("Times New Roman",Font.BOLD,30));
		b.setForeground(Color.BLACK);
		add(b);
		t2=new JTextField();
		t2.setBounds(500,190,120,40);
		t2.setFont(new Font("Times New Roman",Font.BOLD,20));
		t2.setForeground(Color.BLACK);
		add(t2);
		c=new JLabel("Vote Date");
		c.setBounds(250,260,200,50);
		c.setFont(new Font("Times New Roman",Font.BOLD,30));
		c.setForeground(Color.BLACK);
		add(c);
		t3=new JTextField();
		t3.setBounds(500,260,120,40);
		t3.setFont(new Font("Times New Roman",Font.BOLD,20));
		t3.setForeground(Color.BLACK);
		add(t3);
		
		btn1=new JButton("Update");
		btn1.setBounds(254,600,100,40);
		btn1.setFont(new Font("Times New Roman",Font.BOLD,20));
		btn1.setForeground(Color.BLACK);
		add(btn1);
		btn1.addActionListener(this);
		btn2=new JButton("Close");
		btn2.setBounds(500,600,100,40);
		btn2.setFont(new Font("Times New Roman",Font.BOLD,20));
		btn2.setForeground(Color.BLACK);
		add(btn2);
		btn2.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		votingdataupdate obj=new votingdataupdate();

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
				String sql="Select candidateid,votedate from votingdata where voterid=?";
				st=con.prepareStatement(sql);
				st.setString(1, x);
				rs=st.executeQuery();
				if(rs.next())
				{
					t2.setText(rs.getString(1));
					t3.setText(rs.getString(2));
					
						
					
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
			     String sql="update votingdata set candidateid=?,votedate=? where voterid=?";
			     st=con.prepareStatement(sql);
			     st.setString(1,t2.getText());
			     st.setString(2,t3.getText());
			     
			     			     
			     
			     
			     st.setString(3,t1.getSelectedItem().toString());
			     int ff=st.executeUpdate();
			    JOptionPane.showMessageDialog(this, "Updated...");
			    t2.setText("");
			    t3.setText("");
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
			String sql="select voterid from votingdata";
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
