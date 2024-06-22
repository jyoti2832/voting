import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class staffmasterupdate extends JFrame implements ActionListener {
	JLabel j1,j2,j3,j4,j5,j6;
	JTextField tf,tf1,tf2,tf3,tf4,tf5;
	JButton jb,jb1,jb2;
	public staffmasterupdate() 
	{
	setTitle("Staffmaster");
	setSize(800,800);
	setLayout(null);
	j1= new JLabel("Staffid");
	j1.setFont(new Font("Times New Roman",Font.BOLD,30));
	j1.setForeground(Color.BLACK);
	j1.setBounds(100,100,200,30);
	add(j1);
	tf=new JTextField();
	tf.setBounds(350,100,100,30);
	add(tf);
	
	jb=new JButton("Find");
	jb.setBounds(100,140,100,30);
	add(jb);
	
	jb.addActionListener(this);
	
	j2= new JLabel("Name");
	j2.setFont(new Font("Times New Roman",Font.BOLD,30));
	j2.setForeground(Color.BLACK);
	j2.setBounds(100,180,200,30);
	add(j2);
	
	tf1=new JTextField();
	tf1.setBounds(350,180,100,30);
	add(tf1);
	
	j3=new JLabel("Address");
	j3.setFont(new Font("Times New Roman",Font.BOLD,30));
	j3.setForeground(Color.BLACK);
	j3.setBounds(100,220,200,30);
	add(j3);
	
	tf2=new JTextField();
	tf2.setBounds(350,220,100,30);
	add(tf2);
	
	j4=new JLabel("Department");
	j4.setFont(new Font("Times New Roman",Font.BOLD,30));
	j4.setForeground(Color.BLACK);
	j4.setBounds(100,260,200,30);
	add(j4);
	
	tf3=new JTextField();
	tf3.setBounds(350,260,100,30);
	add(tf3);
	
	j5=new JLabel("Amount :");
	j5.setFont(new Font("Times New Roman",Font.BOLD,30));
	j5.setForeground(Color.BLACK);
	j5.setBounds(100,300,200,30);
	add(j5);
	
	tf4=new JTextField();
	tf4.setBounds(350,300,100,30);
	add(tf4);
	
	jb1=new JButton("Change");
	jb1.setBounds(230,350,100,30);
	add(jb1);
	
	jb1.addActionListener(this);
	
	jb2=new JButton("Close");
	jb2.setBounds(100,350,100,30);
	add(jb2);
	
	jb2.addActionListener(this);
	
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
		
    
	
	
	}
	
	public static void main(String[] args) {
		staffmasterupdate ref=new staffmasterupdate();

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// find 
		if(ae.getSource()==jb)
				{
					Connection con;
					PreparedStatement st;
					try {
						Class.forName("oracle.jdbc.driver.OracleDriver");
					 con=DriverManager.getConnection
						("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
				     int xa=Integer.parseInt(tf.getText());
					 
					 String sql="select name,address,department,amount  from staffmaster where staffid=?";
				     st=con.prepareStatement(sql);
				     st.setInt(1, xa);
				     ResultSet rs=st.executeQuery();
				     if (rs.next())
				     {
				    	 tf1.setText(rs.getString(1));
				    	 tf2.setText(rs.getString(2));
				    	 tf3.setText(rs.getString(3));
				    	 tf4.setText(String.valueOf(rs.getInt(4)));
				     }
				     else
				     {
				    	 JOptionPane.showMessageDialog(this,"Not Found");
				     }
					}
				
			catch(Exception ex)
					{
				System.out.println(ex);
				
					}
		
				}
		if (ae.getSource()==jb1)
		{
			Connection con;
			PreparedStatement st;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			 con=DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		     String sql="update staffmaster set name=?,address=?,department=?,amount=? where staffid=?";
		     st=con.prepareStatement(sql);
		     st.setString(1,tf1.getText());
		     st.setString(2,tf2.getText());
		     st.setString(3,tf3.getText());
		     st.setInt(4, Integer.parseInt(tf4.getText()));
		     st.setInt(5, Integer.parseInt(tf.getText()));
		     int ff=st.executeUpdate();
		    JOptionPane.showMessageDialog(this, "Updated...");
		    tf.setText("");
		    tf1.setText("");
		    tf2.setText("");
		    tf3.setText("");
		    tf4.setText("");
		    con.close();
			}
		
	catch(Exception ex)
			{
		System.out.println(ex);
		
			}

		}
	}
}
