import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class voterssave extends JFrame implements ActionListener {
	JLabel a,b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
	JTextField d,d1,d2,d3,d4,d5,d6,d7,d10,d11;
	JButton btn,btn1,btn2;
	JComboBox d8,d9;
	public voterssave() {
		setTitle("Voters");
		setSize(800,800);
		setLayout(null);
		a=new JLabel("Voters Save");
		a.setFont(new Font("Arial",Font.BOLD,40));
		a.setForeground(Color.BLUE);
		a.setBounds(250,20,400,60);
		add(a);
		b=new JLabel("Voters Id");
		b.setFont(new Font("Arial",Font.BOLD,30));
		b.setForeground(Color.RED);
		b.setBounds(70,100,200,30);
		add(b);
		d=new JTextField();
		d.setBounds(350,100,100,30);
		add(d);
		b1=new JLabel("Voter Name");
		b1.setFont(new Font("Arial",Font.BOLD,30));
		b1.setForeground(Color.RED);
		b1.setBounds(70,140,200,30);
		add(b1);
		d1=new JTextField();
		d1.setBounds(350,140,100,30);
		add(d1);
		b2=new JLabel("Father Name");
		b2.setFont(new Font("Arial",Font.BOLD,30));
		b2.setForeground(Color.RED);
		b2.setBounds(70,180,200,30);
		add(b2);
		d2=new JTextField();
		d2.setBounds(350,180,100,30);
		add(d2);
		
		b3=new JLabel("Spouse Name");
		b3.setFont(new Font("Arial",Font.BOLD,30));
		b3.setForeground(Color.RED);
		b3.setBounds(70,220,200,30);
		add(b3);
		d3=new JTextField();
		d3.setBounds(350,220,100,30);
		add(d3);
		
		b4=new JLabel("Gender");
		b4.setFont(new Font("Arial",Font.BOLD,30));
		b4.setForeground(Color.RED);
		b4.setBounds(70,260,200,30);
		add(b4);
		d4=new JTextField();
		d4.setBounds(350,260,100,30);
		add(d4);
		
		b5=new JLabel("Date Of Birth");
		b5.setFont(new Font("Arial",Font.BOLD,30));
		b5.setForeground(Color.RED);
		b5.setBounds(70,300,200,30);
		add(b5);
		d5=new JTextField();
		d5.setBounds(350,300,100,30);
		add(d5);
		
		b6=new JLabel("Address");
		b6.setFont(new Font("Arial",Font.BOLD,30));
		b6.setForeground(Color.RED);
		b6.setBounds(70,340,200,30);
		add(b6);
		d6=new JTextField();
		d6.setBounds(350,340,100,30);
		add(d6);
		
		b7=new JLabel("Email");
		b7.setFont(new Font("Arial",Font.BOLD,30));
		b7.setForeground(Color.RED);
		b7.setBounds(70,380,200,30);
		add(b7);
		
		d7=new JTextField();
		d7.setBounds(350,380,100,30);
		add(d7);
		
		
		
		b8=new JLabel("Ward Number");
		b8.setFont(new Font("Arial",Font.BOLD,30));
		b8.setForeground(Color.RED);
		b8.setBounds(70,420,200,30);
		add(b8);
		d8=new JComboBox();
		d8.setBounds(350,420,100,30);
		add(d8);
		filldata();
		
		
		b9=new JLabel("City Id");
		b9.setFont(new Font("Arial",Font.BOLD,30));
		b9.setForeground(Color.RED);
		b9.setBounds(70,460,200,30);
		add(b9);
		d9=new JComboBox();
		d9.setBounds(350,460,100,30);
		add(d9);
		filldata1();
		
		b10=new JLabel("City");
		b10.setFont(new Font("Arial",Font.BOLD,30));
		b10.setForeground(Color.RED);
		b10.setBounds(70,500,200,30);
		add(b10);
		d10=new JTextField();
		d10.setBounds(350,500,100,30);
		add(d10);
		
		
		
		b11=new JLabel("DisableNoDisavle");
		b11.setFont(new Font("Arial",Font.BOLD,30));
		b11.setForeground(Color.RED);
		b11.setBounds(70,540,200,30);
		add(b11);
		d11=new JTextField();
		d11.setBounds(350,540,100,30);
		add(d11);
		

		

		

	
		btn=new JButton("Save");
		btn.setBackground(Color.GREEN);
		btn.setBounds(70,700,100,30);
		add(btn);
		btn.addActionListener(this);
		btn1=new JButton("Close");
		btn1.setBackground(Color.RED);
		btn1.setBounds(400,700,100,30);
		add(btn1);
		btn1.addActionListener(this);
		btn2=new JButton("New");
		btn2.setBackground(Color.ORANGE);
		btn2.setBounds(230,700,100,30);
		add(btn2);
		btn2.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		voterssave obj=new voterssave();
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==btn)
			
		{
			ResultSet rs;
			Connection con;
			PreparedStatement st;
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
				String xa=d.getText();
				String xb=d1.getText();
				String xc=d2.getText();
				String xd=d3.getText();
				String xe=d4.getText();
				int xf=Integer.parseInt(d5.getText());
				String xg=d6.getText();
				String xh=d7.getText();
				int xi=Integer.parseInt(d8.getSelectedItem().toString());
				String xj=d9.getSelectedItem().toString();
				String xk=d10.getText();
				int  xl=Integer.parseInt(d11.getText());
				
				
				String sql="insert into voters values(?,?,?,?,?,?,?,?,?,?,?,?)";
				st=con.prepareStatement(sql);
				st.setString(1, xa);
				st.setString(2, xb);
				st.setString(3, xc);
				st.setString(4, xd);
				st.setString(5, xe);
				st.setInt(6, xf);
				st.setString(7, xg);
				st.setString(8, xh);
				st.setInt(9, xi);
				st.setString(10, xj);
				st.setString(11, xk);
				st.setInt(12, xl);
				
				
				int p=st.executeUpdate();
				JOptionPane.showMessageDialog(this,"Data Saved");
				con.close();
				d.setText(" ");
				d1.setText(" ");
				d2.setText(" ");
				d3.setText(" ");
				d4.setText(" ");
				d5.setText(" ");
				d6.setText(" ");
				d7.setText(" ");
				
				
				d10.setText(" ");
				d11.setText(" ");
				
			}
			
			catch(Exception ex)
			{
				System.out.println(ex);
			}
			
		}
		
	
	if(ae.getSource()==btn1)
	{
		this.dispose();
	}
	if(ae.getSource()==btn2)
	{
		d.setText(" ");
		d1.setText(" ");
		d2.setText(" ");
		d3.setText(" ");
		d4.setText(" ");
		d5.setText(" ");
		d6.setText(" ");
		d7.setText(" ");
		
		
		d10.setText(" ");
		d11.setText(" ");
		
	}
	}
	void filldata()
	{
		Connection con;
		PreparedStatement st;
		ResultSet rs; 
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","System","manager");
			String sql="select wardno from wardmaster";
			Statement str=con.createStatement();
			ResultSet rst=str.executeQuery(sql);
			while(rst.next())
			{
				d8.addItem(rst.getInt(1));
			}
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	
	void filldata1()
	{
		Connection con;
		PreparedStatement st;
		ResultSet rs; 
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
				d9.addItem(rst.getString(1));
			}
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

	
}



