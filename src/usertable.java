import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class usertable extends JFrame implements ActionListener{
	JLabel b,c;
	JTextField d,e;
	JButton btn1,btn2;
	Connection con;
	PreparedStatement st;
	ResultSet rs;
	public usertable()
	{
		setTitle("Login");
		setSize(700,700);
		setLayout(null);
		b=new JLabel("UserId");
		b.setFont(new Font("Arial",Font.BOLD,30));
		b.setForeground(Color.BLUE);
		b.setBounds(70,100,200,30);
		add(b);
		d=new JTextField();
		d.setBounds(350,100,100,30);
		add(d);
		c=new JLabel("Password");
		c.setFont(new Font("Arial",Font.BOLD,30));
		c.setForeground(Color.BLUE);
		c.setBounds(70,150,200,30);
		add(c);
		e=new JTextField();
		e.setBounds(350,150,100,30);
		add(e);
		btn1=new JButton("Login");
		btn1.setBackground(Color.RED);
		btn1.setBounds(150,220,100,30);
		add(btn1);
		btn1.addActionListener(this);
		btn2=new JButton("New Save");
		btn2.setBackground(Color.GREEN);
		btn2.setBounds(300,220,100,30);
		add(btn2);
		btn2.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usertable obj=new usertable();
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
				String x=d.getText();
				String y=e.getText();
				String sql="select * from usertable where userid=? and password=?";
				st=con.prepareStatement(sql);
				st.setString(1, x);
				st.setString(2, y);
				rs=st.executeQuery();
				if(rs.next())
				{
					JOptionPane.showMessageDialog(this,"Login Success");
					new usertable1();
				}
				else
				{
					JOptionPane.showMessageDialog(this,"Login Failed");
				}
				
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
	}

}
