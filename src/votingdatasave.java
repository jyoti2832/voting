import javax.swing.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
public class votingdatasave extends JFrame implements ActionListener{
	JLabel a,b,c,d;

	JComboBox t1,t2,t3;
	JButton btn,btn1,btn2;
	Connection con;
	PreparedStatement st;
	ResultSet rs;
	Date dt;
	public votingdatasave()
	{
		setTitle("Votingdate Data Save");
		setSize(800,800);
		setLayout(null);
		getContentPane().setBackground(Color.CYAN);
		//getContentPane().setBackground(Color.darkGray);
		
		
		
		a=new JLabel("Voting Save Date");
		a.setFont(new Font("Times New Roman",Font.BOLD,40));
		
		a.setBounds(270,30,450,50);
		add(a);
		
		b=new JLabel("Voter Id");
		b.setFont(new Font("Times New Roman",Font.BOLD,30));
		b.setForeground(Color.BLUE);
		b.setBounds(250,100,150,40);
		add(b);
		t1=new JComboBox();
		t1.setFont(new Font("Times New Roman",Font.BOLD,20));
		t1.setForeground(Color.BLACK);

		t1.setBounds(460,100,150,40);
		add(t1);
		
		c=new JLabel("City Id");
		c.setFont(new Font("Times New Roman",Font.BOLD,30));
		c.setForeground(Color.BLUE);
		c.setBounds(250,150,150,40);
		add(c);
		t2=new JComboBox();

		t2.setFont(new Font("Times New Roman",Font.BOLD,20));
		t2.setForeground(Color.BLACK);
		t2.setBounds(460,150,150,40);
		add(t2);
		filldata();
		
		d=new JLabel("Candidate Id");
		d.setFont(new Font("Times New Roman",Font.BOLD,30));
		d.setForeground(Color.BLUE);
		d.setBounds(250,200,400,50);
		add(d);
		t3=new JComboBox();

		t3.setFont(new Font("Times New Roman",Font.BOLD,20));
		t3.setForeground(Color.BLACK);
		t3.setBounds(460,200,150,40);
		add(t3);
	
		
		btn=new JButton("SAVE");
		btn.setFont(new Font("Times New Roman",Font.BOLD,20));
		btn.setForeground(Color.BLACK);
		btn.setBounds(270,270,150,40);
		add(btn);
		btn.addActionListener(this);
		
		btn1=new JButton("CLOSE");
		btn1.setFont(new Font("Times New Roman",Font.BOLD,20));
		btn1.setForeground(Color.BLACK);
		btn1.setBounds(450,270,150,40);
		add(btn1);
		btn1.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		filldataone();
		filldata();
		filldataTwo();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		votingdatasave obj= new  votingdatasave();

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
				
				boolean rt=checkvote();
				if (rt==false)
				{
					JOptionPane.showMessageDialog(this, "Failed");
				}
				else {
					String x=t1.getSelectedItem().toString();
				String xa=t2.getSelectedItem().toString();
				String xb=t3.getSelectedItem().toString();
				dt=new Date();
				SimpleDateFormat df=new SimpleDateFormat("dd-MMM-YYYY");
				String gg=df.format(dt);
				
				String sql="insert into votingdata values(?,?,?,?)";
				st=con.prepareStatement(sql);
				st.setString(1, x);
				st.setString(2, xa);
				st.setString(3, xb);
				st.setString(4, gg);
				
				int p=st.executeUpdate();
				JOptionPane.showMessageDialog(this,"Saved");
				con.close();
			    }
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
		if(ae.getSource()==btn1)
		{
			this.setVisible(false);
		}
		if(ae.getSource()==btn2)
		{
	//		t1.setText("");
		}
		
		
	}
	boolean checkvote()
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			String sql="select to_char(electiondate,'DD-MON-YYYY') from electionschedule where cityid=?";
			st=con.prepareStatement(sql);
			st.setString(1, t2.getSelectedItem().toString());
			rs=st.executeQuery();
			SimpleDateFormat dt1=new SimpleDateFormat("dd-MMM-yyyy");
			String ss=dt1.format(new Date());
			System.out.println(ss);
			//System.out.println(rs.getString(1));
			if (rs.next()) {
				System.out.println(rs.getString(1));
			if (rs.getString(1).equalsIgnoreCase(ss))
			{
				JOptionPane.showMessageDialog(this, "Your vote has been cast");
				return true;
				}
				
			else
			{
				JOptionPane.showMessageDialog(this, "Your vote is not cast");
				return false;
			}
			}
			con.close();
			return false;
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
			return false;
		}
	}
	void filldata()
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			String sql="select cityid from citymaster";
			Statement str=con.createStatement();
			ResultSet rst=str.executeQuery(sql);
			while(rst.next())
			{
				t2.addItem(rst.getString(1));
			}
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	void filldataone()
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			String sql="select cnadiadteid from cadidates";
			Statement str=con.createStatement();
			ResultSet rst=str.executeQuery(sql);
			while(rst.next())
			{
				t3.addItem(rst.getString(1));
			}
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}


void filldataTwo()
{
	try 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		String sql="select voterid from voters where voterid not in(select voterid from votingdata)";
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
