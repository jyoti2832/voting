import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class cadidatessave extends JFrame implements ActionListener {
	JLabel a,b,b1,b2,b3,b4,b5;
	JTextField d,d1,d2,d3,d4,d5;
	JButton btn,btn1,btn2;
	
	public cadidatessave() {
		setTitle("Cadidates");
		setSize(700,700);
		setLayout(null);
		getContentPane().setBackground(Color.RED);
		a=new JLabel("Cadidates Save");
		a.setFont(new Font("Times New Roman",Font.BOLD,40));
		a.setForeground(Color.BLACK);
		a.setBounds(250,40,500,30);
		add(a);
		b=new JLabel("Cnadidte Id");
		b.setFont(new Font("Times New Roman",Font.BOLD,30));
		b.setForeground(Color.BLACK);
		b.setBounds(70,100,200,30);
		add(b);
		d=new JTextField();
		d.setBounds(350,100,100,30);
		d.setFont(new Font("Times New Roman",Font.BOLD,20));
		d.setForeground(Color.BLACK);

		add(d);
		b1=new JLabel("Name");
		b1.setFont(new Font("Times New Roman",Font.BOLD,30));
		b1.setForeground(Color.BLACK);
		b1.setBounds(70,140,200,30);
		add(b1);
		d1=new JTextField();
		d1.setBounds(350,140,100,30);
		d1.setFont(new Font("Times New Roman",Font.BOLD,20));
		d1.setForeground(Color.BLACK);

		add(d1);
		b2=new JLabel("Address");
		b2.setFont(new Font("Times New Roman",Font.BOLD,30));
		b2.setForeground(Color.BLACK);
		b2.setBounds(70,180,200,30);
		add(b2);
		d2=new JTextField();
		d2.setFont(new Font("Times New Roman",Font.BOLD,20));
		d2.setForeground(Color.BLACK);

		d2.setBounds(350,180,100,30);
		add(d2);
		b3=new JLabel("Phone Number");
		b3.setFont(new Font("Times New Roman",Font.BOLD,30));
		b3.setForeground(Color.BLACK);
		b3.setBounds(70,220,200,30);
		add(b3);
		d3=new JTextField();
		
		d3.setBounds(350,220,100,30);
		d3.setFont(new Font("Times New Roman",Font.BOLD,20));
		d3.setForeground(Color.BLACK);

		add(d3);
		b4=new JLabel("Legal Cases");
		b4.setFont(new Font("Times New Roman",Font.BOLD,30));
		b4.setForeground(Color.BLACK);
		b4.setBounds(70,260,200,30);
		add(b4);
		d4=new JTextField();
		d4.setFont(new Font("Times New Roman",Font.BOLD,20));
		d4.setForeground(Color.RED);
		d4.setBounds(350,260,100,30);
		add(d4);
		
		b5=new JLabel("NOC");
		b5.setFont(new Font("Times New Roman",Font.BOLD,30));
		b5.setForeground(Color.BLACK);
		b5.setBounds(70,300,200,30);
		add(b5);
		d5=new JTextField();
		d5.setFont(new Font("Times New Roman",Font.BOLD,20));
		d5.setForeground(Color.RED);
		d5.setBounds(350,300,100,30);
		add(d5);
		
		btn=new JButton("Save");
		btn.setBackground(Color.PINK);
		btn.setBounds(70,350,100,30);
		add(btn);
		btn.addActionListener(this);
		btn1=new JButton("Close");
		btn1.setBackground(Color.CYAN);
		btn1.setBounds(400,350,100,30);
		add(btn1);
		btn1.addActionListener(this);
		btn2=new JButton("New");
		btn2.setBackground(Color.GRAY);
		btn2.setBounds(230,420,100,30);
		add(btn2);
		btn2.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cadidatessave obj=new cadidatessave();
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
				String xc=d2.getText();
				String xd=d3.getText();
				String xe=d4.getText();
				int xf=Integer.parseInt(d5.getText());
				String sql="insert into cadidates values(?,?,?,?,?,?)";
				st=con.prepareStatement(sql);
				st.setString(1, xa);
				st.setString(2, xb);
				st.setString(3, xc);
				st.setString(4, xd);
				st.setString(5, xe);
				st.setInt(6, xf);
				
				int p=st.executeUpdate();
				JOptionPane.showMessageDialog(this,"Data Saved");
				con.close();
				d.setText(" ");
				d1.setText(" ");
				d2.setText(" ");
				d3.setText(" ");
				d4.setText(" ");
				d5.setText(" ");
				
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
		d2.setText(" ");
		d3.setText(" ");
		d4.setText(" ");
		d5.setText(" ");
	}
	}
}

