import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class resultsave extends JFrame implements ActionListener {
	JLabel a,b,b1,b2;
	JTextField d;
	JButton btn,btn1,btn2;
	JComboBox d1,d2;
	public resultsave() {
		setTitle("Result");
		setSize(700,700);
		setLayout(null);
		a=new JLabel("Result Data Save");
		a.setFont(new Font("Arial",Font.BOLD,30));
		a.setForeground(Color.BLUE);
		a.setBounds(250,20,200,30);
		add(a);
		b=new JLabel("Ward Id");
		b.setFont(new Font("Arial",Font.BOLD,30));
		b.setForeground(Color.RED);
		b.setBounds(70,100,200,30);
		add(b);
		d=new JTextField();
		d.setBounds(350,100,100,30);
		add(d);
		b1=new JLabel("City Id");
		b1.setFont(new Font("Arial",Font.BOLD,30));
		b1.setForeground(Color.RED);
		b1.setBounds(70,140,200,30);
		add(b1);
		d1=new JComboBox();
		d1.setBounds(350,140,100,30);
		add(d1);
		filldata();
		b2=new JLabel("Candidate Id");
		b2.setFont(new Font("Arial",Font.BOLD,30));
		b2.setForeground(Color.RED);
		b2.setBounds(70,180,200,30);
		add(b2);
		d2=new JComboBox();
		d2.setBounds(350,180,100,30);
		add(d2);
		filldata1();
		btn=new JButton("Save");
		btn.setBackground(Color.GREEN);
		btn.setBounds(70,350,100,30);
		add(btn);
		btn.addActionListener(this);
		btn1=new JButton("Close");
		btn1.setBackground(Color.RED);
		btn1.setBounds(400,350,100,30);
		add(btn1);
		btn1.addActionListener(this);
		btn2=new JButton("New");
		btn2.setBackground(Color.ORANGE);
		btn2.setBounds(230,420,100,30);
		add(btn2);
		btn2.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		resultsave obj=new resultsave();
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==btn)
			
		{
			
			Connection con;
			PreparedStatement st;
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
				String xa=d.getText();
				String xb = d1.getSelectedItem().toString();
				String xc = d2.getSelectedItem().toString();
				
				String sql="insert into result values(?,?,?)";
				st=con.prepareStatement(sql);
				st.setString(1, xa);
				st.setString(2, xb);
				st.setString(3, xc);
				int p=st.executeUpdate();
				JOptionPane.showMessageDialog(this,"Data Saved");
				con.close();
				d.setText(" ");
				
				
			}
			
			catch(Exception ex)
			{
				
			}
			
		}
		
	
	if(ae.getSource()==btn1)
	{
		this.dispose();
	}
	if(ae.getSource()==btn2)
	{
		d.setText(" ");
		
		
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
			String sql="select cityid from citymaster";
			Statement str=con.createStatement();
			ResultSet rst=str.executeQuery(sql);
			while(rst.next())
			{
				d1.addItem(rst.getString(1));
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
			String sql="select cnadiadteid from cadidates";
			Statement str=con.createStatement();
			ResultSet rst=str.executeQuery(sql);
			while(rst.next())
			{
				d2.addItem(rst.getString(1));
			}
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	
}



