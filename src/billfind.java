import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class billfind extends JFrame implements ActionListener{
	JLabel a,b,b1,b2,b3,b4;
	JTextField d,d1,d2,d3,d4;
	JButton btn1,btn2;
	Connection con;
	PreparedStatement st;
	ResultSet rs;
	public billfind() {
		setTitle("Bill Find");
		setSize(700,700);
		setLayout(null);
		a=new JLabel("Bill Find");
		a.setFont(new Font("Arial",Font.BOLD,30));
		a.setForeground(Color.BLUE);
		a.setBounds(250,20,200,30);
		add(a);
		b=new JLabel("Billid");
		b.setFont(new Font("Arial",Font.BOLD,30));
		b.setForeground(Color.GREEN);
		b.setBounds(70,100,200,30);
		add(b);
		d=new JTextField();
		d.setBounds(350,100,100,30);
		add(d);
		btn1=new JButton("Find");
		btn1.setBackground(Color.BLUE);
		btn1.setBounds(100,140,100,30);
		add(btn1);
		btn1.addActionListener(this);
		b1=new JLabel("Custid");
		b1.setFont(new Font("Arial",Font.BOLD,30));
		b1.setForeground(Color.GREEN);
		b1.setBounds(70,180,200,30);
		add(b1);
		d1=new JTextField();
		d1.setBounds(350,180,100,30);
		add(d1);
		b2=new JLabel("Name");
		b2.setFont(new Font("Arial",Font.BOLD,30));
		b2.setForeground(Color.GREEN);
		b2.setBounds(70,220,200,30);
		add(b2);
		d2=new JTextField();
		d2.setBounds(350,220,100,30);
		add(d2);
		b3=new JLabel("Address");
		b3.setFont(new Font("Arial",Font.BOLD,30));
		b3.setForeground(Color.GREEN);
		b3.setBounds(70,260,200,30);
		add(b3);
		d3=new JTextField();
		d3.setBounds(350,260,100,30);
		add(d3);
		b4=new JLabel("Amount");
		b4.setFont(new Font("Arial",Font.BOLD,30));
		b4.setForeground(Color.GREEN);
		b4.setBounds(70,300,200,30);
		add(b4);
		d4=new JTextField();
		d4.setBounds(350,300,100,30);
		add(d4);
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
		billfind obj=new billfind();
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
				int x=Integer.parseInt(d.getText());
				String sql="select custid,custname,address,amount from billing where billid=?";
				st=con.prepareStatement(sql);
				st.setInt(1,x);
				rs=st.executeQuery();
				if(rs.next())
				{
					d1.setText(String.valueOf(rs.getInt(1)));
					d2.setText(rs.getString(2));
					d3.setText(rs.getString(3));
					d4.setText(String.valueOf(rs.getInt(4)));
					
				}
				con.close();
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
	}

}
