import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class electionschedulesave extends JFrame implements ActionListener {
	JLabel a,b,b1,b2,b3;
	JTextField d,d1,d3;
	JButton btn,btn1,btn2;
	JComboBox d2;
	public electionschedulesave() {
		setTitle("Election Schedule");
		setSize(700,700);
		setLayout(null);
		getContentPane().setBackground(Color.RED);
		a=new JLabel("Election Schedule Save");
		a.setFont(new Font("Times New Roman",Font.BOLD,30));
		a.setForeground(Color.BLACK);
		a.setBounds(250,20,200,30);
		add(a);
		b=new JLabel("Election Id");
		b.setFont(new Font("Times New Roman",Font.BOLD,30));
		b.setForeground(Color.BLACK);
		b.setBounds(70,100,200,30);
		add(b);
		d=new JTextField();
		d.setBounds(350,100,100,30);
		add(d);
		b1=new JLabel("Election Type");
		b1.setFont(new Font("Times New Roman",Font.BOLD,30));
		b1.setForeground(Color.BLACK);
		b1.setBounds(70,140,200,30);
		add(b1);
		d1=new JTextField();
		d1.setBounds(350,140,100,30);
		add(d1);
		b2=new JLabel("City Id");
		b2.setFont(new Font("Times New Roman",Font.BOLD,30));
		b2.setForeground(Color.BLACK);
		b2.setBounds(70,180,200,30);
		add(b2);
		d2=new JComboBox();
		d2.setBounds(350,180,100,30);
		add(d2);
		filldata();
		b3=new JLabel("Election Date");
		b3.setFont(new Font("Times New Roman",Font.BOLD,30));
		b3.setForeground(Color.BLACK);
		b3.setBounds(70,220,200,30);
		add(b3);
		d3=new JTextField();
		d3.setBounds(350,220,100,30);
		add(d3);
		
	
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
		electionschedulesave obj=new electionschedulesave();
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
				String xb=d1.getText();
				String xc = d2.getSelectedItem().toString();
				String xd=d3.getText();
				
				String sql="insert into electionschedule values(?,?,?,?)";
				st=con.prepareStatement(sql);
				st.setString(1, xa);
				st.setString(2, xb);
				st.setString(3, xc);
				st.setString(4, xd);
				int p=st.executeUpdate();
				JOptionPane.showMessageDialog(this,"Data Saved");
				con.close();
				d.setText(" ");
				d1.setText(" ");
				
				d3.setText(" ");
				
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
		d1.setText(" ");
		
		d3.setText(" ");
		
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

