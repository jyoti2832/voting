import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class votersfind extends JFrame implements ActionListener{
	JLabel a,b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
	JTextField d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11;
	JButton btn1,btn2;
	Connection con;
	PreparedStatement st;
	ResultSet rs;
	JComboBox d;
	public votersfind() {
		setTitle("Voters");
		setSize(800,800);
		setLayout(null);
		getContentPane().setBackground(Color.RED);
		a=new JLabel("Voters Find");
		a.setFont(new Font("Times New Roman",Font.BOLD,30));
		a.setForeground(Color.BLUE);
		a.setBounds(250,20,200,30);
		add(a);
		b=new JLabel("Voters Id");
		b.setFont(new Font("Times New Roman",Font.BOLD,30));
		b.setForeground(Color.GREEN);
		b.setBounds(70,100,200,30);
		add(b);
		
		d=new JComboBox();
		d.setBounds(350,100,150,30);
		d.setFont(new Font("Times New Roman",Font.BOLD,20));
		d.setForeground(Color.GREEN);
		add(d);
		filldata();
		btn1=new JButton("Find");
		btn1.setBackground(Color.BLUE);
		btn1.setBounds(100,140,150,30);
		add(btn1);
		btn1.addActionListener(this);
		b1=new JLabel("Voter Name");
		b1.setFont(new Font("Times New Roman",Font.BOLD,30));
		b1.setForeground(Color.GREEN);
		b1.setBounds(70,180,200,30);
		add(b1);
		d1=new JTextField();
		d1.setBounds(350,180,150,30);
		d1.setFont(new Font("Times New Roman",Font.BOLD,20));
		d1.setForeground(Color.BLACK);
		add(d1);
		b2=new JLabel("Father Name");
		b2.setFont(new Font("Times New Roman",Font.BOLD,30));
		b2.setForeground(Color.GREEN);
		b2.setBounds(70,220,200,30);
		add(b2);
		d2=new JTextField();
		d2.setBounds(350,220,150,30);
		d2.setFont(new Font("Times New Roman",Font.BOLD,20));
		d2.setForeground(Color.BLACK);
	
		add(d2);
		b3=new JLabel("Spouse Name");
		b3.setFont(new Font("Times New Roman",Font.BOLD,30));
		b3.setForeground(Color.GREEN);
		b3.setBounds(70,260,200,30);
		add(b3);
		d3=new JTextField();
		d3.setBounds(350,260,150,30);
		d3.setFont(new Font("Times New Roman",Font.BOLD,20));
		d3.setForeground(Color.BLACK);
	
		add(d3);
		
		b4=new JLabel("Gender");
		b4.setFont(new Font("Times New Roman",Font.BOLD,30));
		b4.setForeground(Color.GREEN);
		b4.setBounds(70,300,200,30);
		add(b4);
		d4=new JTextField();
		d4.setBounds(350,300,150,30);
		d4.setFont(new Font("Times New Roman",Font.BOLD,20));
		d4.setForeground(Color.BLACK);
	
		add(d4);
		
		b5=new JLabel("Date Of Birth");
		b5.setFont(new Font("Times New Roman",Font.BOLD,30));
		b5.setForeground(Color.GREEN);
		b5.setBounds(70,340,200,30);
		add(b5);
		d5=new JTextField();
		d5.setBounds(350,340,150,30);
		d5.setFont(new Font("Times New Roman",Font.BOLD,20));
		d5.setForeground(Color.BLACK);
	
		add(d5);
		
		b6=new JLabel("Address");
		b6.setFont(new Font("Times New Roman",Font.BOLD,30));
		b6.setForeground(Color.GREEN);
		b6.setBounds(70,380,200,30);
		add(b6);
		d6=new JTextField();
		d6.setBounds(350,380,150,30);
		d6.setFont(new Font("Times New Roman",Font.BOLD,20));
		d6.setForeground(Color.BLACK);
	
		add(d6);
		
		b7=new JLabel("Email");
		b7.setFont(new Font("Times New Roman",Font.BOLD,30));
		b7.setForeground(Color.GREEN);
		b7.setBounds(70,420,200,30);
		add(b7);
		d7=new JTextField();
		d7.setBounds(350,420,150,30);
		d7.setFont(new Font("Times New Roman",Font.BOLD,20));
		d7.setForeground(Color.BLACK);
	
		add(d7);
	
		b8=new JLabel("Ward Number");
		b8.setFont(new Font("Times New Roman",Font.BOLD,30));
		b8.setForeground(Color.GREEN);
		b8.setBounds(70,460,200,30);
		add(b8);
		d8=new JTextField();
		d8.setBounds(350,460,150,30);
		d8.setFont(new Font("Times New Roman",Font.BOLD,20));
		d8.setForeground(Color.BLACK);
	
		add(d8);
	
		b9=new JLabel("City Id");
		b9.setFont(new Font("Times New Roman",Font.BOLD,30));
		b9.setForeground(Color.GREEN);
		b9.setBounds(70,500,200,30);
		add(b9);
		d9=new JTextField();
		d9.setBounds(350,500,150,30);
		d9.setFont(new Font("Times New Roman",Font.BOLD,20));
		d9.setForeground(Color.BLACK);
	
		add(d9);
		
		b10=new JLabel("City");
		b10.setFont(new Font("Times New Roman",Font.BOLD,30));
		b10.setForeground(Color.GREEN);
		b10.setBounds(70,540,200,30);
		add(b10);
		d10=new JTextField();
		d10.setBounds(350,540,150,30);
		d10.setFont(new Font("Times New Roman",Font.BOLD,20));
		d10.setForeground(Color.BLACK);
	
		add(d10);
	
		b11=new JLabel("Disable End Nodisable");
		b11.setFont(new Font("Times New Roman",Font.BOLD,30));
		b11.setForeground(Color.GREEN);
		b11.setBounds(70,580,200,30);
		add(b11);
		d11=new JTextField();
		d11.setBounds(350,580,150,30);
		d11.setFont(new Font("Times New Roman",Font.BOLD,20));
		d11.setForeground(Color.BLACK);
	
		add(d11);
		
		
		
		
				
		btn2=new JButton("Close");
		btn2.setBackground(Color.RED);
		btn2.setBounds(230,700,100,30);
		add(btn2);
		btn2.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		votersfind obj=new votersfind();
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
				String sql="select votername,fathername,spousename,gender,dob,address,email,wardno,cityid,city,disablenodisable from voters where voterid=?";
				st=con.prepareStatement(sql);
				st.setString(1,x);
				rs=st.executeQuery();
				if(rs.next())
				{
					d1.setText(rs.getString(1));
					d2.setText(rs.getString(2));
					d3.setText(rs.getString(3));
					d4.setText(rs.getString(4));
					
					d5.setText(String.valueOf(rs.getString(5)));
					
					d6.setText(rs.getString(6));
					d7.setText(rs.getString(7));
					d8.setText(rs.getString(8));
					d9.setText(rs.getString(9));
					d10.setText(rs.getString(10));
					d11.setText(String.valueOf(rs.getString(11)));
					
					
					
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
			String sql="select voterid from voters";
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
