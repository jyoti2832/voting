import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class electionschedulefind extends JFrame implements ActionListener{
	JLabel a,b,b1,b2,b3;
	JTextField d1,d2,d3;
	JButton btn1,btn2;
	Connection con;
	PreparedStatement st;
	ResultSet rs;
	JComboBox d;
	public electionschedulefind() {
		setTitle("Election Schedule");
		setSize(700,700);
		setLayout(null);
		getContentPane().setBackground(Color.RED);
		a=new JLabel(" Election Schedule Find");
		a.setFont(new Font("Arial",Font.BOLD,30));
		a.setForeground(Color.BLUE);
		a.setBounds(250,20,200,30);
		add(a);
		b=new JLabel("Election Id");
		b.setFont(new Font("Arial",Font.BOLD,30));
		b.setForeground(Color.GREEN);
		b.setBounds(70,100,200,30);
		add(b);
		
		d=new JComboBox();
		d.setBounds(350,100,100,30);
		add(d);
		filldata();
		btn1=new JButton("Find");
		btn1.setBackground(Color.BLUE);
		btn1.setBounds(100,140,100,30);
		add(btn1);
		btn1.addActionListener(this);
		b1=new JLabel("Election Type");
		b1.setFont(new Font("Arial",Font.BOLD,30));
		b1.setForeground(Color.GREEN);
		b1.setBounds(70,180,200,30);
		add(b1);
		d1=new JTextField();
		d1.setBounds(350,180,100,30);
		d1.setFont(new Font("Arial",Font.BOLD,20));
		d1.setForeground(Color.BLACK);
		add(d1);
		b2=new JLabel("City Id");
		b2.setFont(new Font("Arial",Font.BOLD,30));
		b2.setForeground(Color.GREEN);
		b2.setBounds(70,220,200,30);
		add(b2);
		d2=new JTextField();
		d2.setBounds(350,220,100,30);
		d2.setFont(new Font("Arial",Font.BOLD,20));
		d2.setForeground(Color.BLACK);
	
		add(d2);
		
		b3=new JLabel("Election Date");
		b3.setFont(new Font("Arial",Font.BOLD,30));
		b3.setForeground(Color.GREEN);
		b3.setBounds(70,260,200,30);
		add(b3);
		d3=new JTextField();
		d3.setBounds(350,260,100,30);
		d3.setFont(new Font("Arial",Font.BOLD,20));
		d3.setForeground(Color.BLACK);
	
		add(d2);
		
		btn2=new JButton("Close");
		btn2.setBackground(Color.RED);
		btn2.setBounds(230,420,100,30);
		add(btn2);
		btn2.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		electionschedulefind obj=new electionschedulefind();
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==btn1)
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
				String x=d.getSelectedItem().toString();
				String sql="select electiontype,cityid,electiondate from electionschedule where electionid=?";
				st=con.prepareStatement(sql);
				st.setString(1,x);
				rs=st.executeQuery();
				if(rs.next())
				{
					d1.setText(rs.getString(1));
					d2.setText(rs.getString(2));
					d3.setText(rs.getString(3));
					
					
				}
				con.close();
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}	
		}
		if(ae.getSource()==btn2)
		{
			this.setVisible(false);
		}
		
	}
	void filldata()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
			String sql="select electionid from electionschedule";
			Statement str=con.createStatement();
			ResultSet rst=str.executeQuery(sql);
			while(rst.next())
			{
				d.addItem(rst.getString(1));
			}
		
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}	
}
