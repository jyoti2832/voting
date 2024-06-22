import java.sql.*;
import java.awt.event.*;
import javax.swing.*;

public class billupdate extends JFrame implements ActionListener {
	JLabel j1,j2,j3,j4,j5,j6;
	JTextField tf,tf1,tf2,tf3,tf4,tf5;
	JButton jb,jb1,jb2;
	public billupdate() 
	{
	setTitle("myfour frame");
	setSize(800,800);
	setLayout(null);
	j1= new JLabel("Bill id :");
	j1.setBounds(50,50,100,100);
	add(j1);
	tf=new JTextField();
	tf.setBounds(160,90,100,20);
	add(tf);
	
	jb=new JButton("Find");
	jb.setBounds(50,130,80,20);
	add(jb);
	
	jb.addActionListener(this);
	
	j2= new JLabel("New customer id:");
	j2.setBounds(50,120,150,100);
	add(j2);
	
	tf1=new JTextField();
	tf1.setBounds(160,160,100,20);
	add(tf1);
	
	j3=new JLabel("New Name :");
	j3.setBounds(50,150,100,100);
	add(j3);
	
	tf2=new JTextField();
	tf2.setBounds(160,190,100,20);
	add(tf2);
	
	j4=new JLabel("New Adress:");
	j4.setBounds(50,180,100,100);
	add(j4);
	
	tf3=new JTextField();
	tf3.setBounds(160,220,100,20);
	add(tf3);
	
	j5=new JLabel("Amount :");
	j5.setBounds(50,210,100,100);
	add(j5);
	
	tf4=new JTextField();
	tf4.setBounds(160,250,100,20);
	add(tf4);
	
	jb1=new JButton("Change");
	jb1.setBounds(50,280,80,20);
	add(jb1);
	
	jb1.addActionListener(this);
	
	jb2=new JButton("Close");
	jb2.setBounds(150,280,80,20);
	add(jb2);
	
	jb2.addActionListener(this);
	
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
		
    
	
	
	}
	
	public static void main(String[] args) {
		billupdate ref=new billupdate();

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
					 
					 String sql="select custid,custname,address,amount  from billing where billid=?";
				     st=con.prepareStatement(sql);
				     st.setInt(1, xa);
				     ResultSet rs=st.executeQuery();
				     if (rs.next())
				     {
				    	 tf1.setText(String.valueOf(rs.getInt(1)));
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
		     String sql="update billing set custid=?,custname=?,address=?,amount=? where billid=?";
		     st=con.prepareStatement(sql);
		     st.setInt(1, Integer.parseInt(tf1.getText()));
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
