import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class partymastersave extends JFrame implements ActionListener {
	JLabel a,b,b1,b2;
	JTextField d,d1,d2;
	JButton btn,btn1,btn2;
	public partymastersave() {
		setTitle("Party Master");
		setSize(700,700);
		setLayout(null);
		getContentPane().setBackground(Color.RED);
		a=new JLabel("Party Master Save");
		a.setFont(new Font("Times New Roman",Font.BOLD,30));
		a.setForeground(Color.BLACK);
		a.setBounds(250,20,200,30);
		add(a);
		b=new JLabel("Party Id");
		b.setFont(new Font("Times New Roman",Font.BOLD,30));
		b.setForeground(Color.BLACK);
		b.setBounds(70,100,200,30);
		add(b);
		d=new JTextField();
		d.setBounds(350,100,100,30);
		add(d);
		b1=new JLabel("Party Name");
		b1.setFont(new Font("Times New Roman",Font.BOLD,30));
		b1.setForeground(Color.BLACK);
		b1.setBounds(70,140,200,30);
		add(b1);
		d1=new JTextField();
		d1.setBounds(350,140,100,30);
		add(d1);
		b2=new JLabel("Symbal");
		b2.setFont(new Font("Times New Roman",Font.BOLD,30));
		b2.setForeground(Color.BLACK);
		b2.setBounds(70,180,200,30);
		add(b2);
		d2=new JTextField();
		d2.setBounds(350,180,100,30);
		add(d2);
	
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
		partymastersave obj=new partymastersave();
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
				
				String sql="insert into partymaster values(?,?,?)";
				st=con.prepareStatement(sql);
				st.setString(1, xa);
				st.setString(2, xb);
				st.setString(3, xc);
				int p=st.executeUpdate();
				JOptionPane.showMessageDialog(this,"Data Saved");
				con.close();
				d.setText(" ");
				d1.setText(" ");
				d2.setText(" ");
				
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
		
	}
	}
}

