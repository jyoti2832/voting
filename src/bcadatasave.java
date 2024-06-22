import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class bcadatasave extends JFrame implements ActionListener {
	JLabel a,b,b1,b2,b3,b4;
	JTextField d,d1,d2,d3,d4;
	JButton btn,btn1,btn2;
	public bcadatasave() {
		setTitle("bcadata Insert");
		setSize(700,700);
		setLayout(null);
		a=new JLabel("bcadata");
		a.setFont(new Font("Arial",Font.BOLD,30));
		a.setForeground(Color.BLUE);
		a.setBounds(250,20,200,30);
		add(a);
		b=new JLabel("rollno");
		b.setFont(new Font("Arial",Font.BOLD,30));
		b.setForeground(Color.RED);
		b.setBounds(70,100,200,30);
		add(b);
		d=new JTextField();
		d.setBounds(350,100,100,30);
		add(d);
		b1=new JLabel("name");
		b1.setFont(new Font("Arial",Font.BOLD,30));
		b1.setForeground(Color.RED);
		b1.setBounds(70,140,200,30);
		add(b1);
		d1=new JTextField();
		d1.setBounds(350,140,100,30);
		add(d1);
		b2=new JLabel("city");
		b2.setFont(new Font("Arial",Font.BOLD,30));
		b2.setForeground(Color.RED);
		b2.setBounds(70,180,200,30);
		add(b2);
		d2=new JTextField();
		d2.setBounds(350,180,100,30);
		add(d2);
		b3=new JLabel("sem");
		b3.setFont(new Font("Arial",Font.BOLD,30));
		b3.setForeground(Color.RED);
		b3.setBounds(70,220,200,30);
		add(b3);
		d3=new JTextField();
		d3.setBounds(350,220,100,30);
		add(d3);
		b4=new JLabel("marks");
		b4.setFont(new Font("Arial",Font.BOLD,30));
		b4.setForeground(Color.RED);
		b4.setBounds(70,260,200,30);
		add(b4);
		d4=new JTextField();
		d4.setBounds(350,260,100,30);
		add(d4);
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
		bcadatasave obj=new bcadatasave();
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
				int xa=Integer.parseInt(d.getText());
				String xb=d1.getText();
				String xc=d2.getText();
				int xd=Integer.parseInt(d3.getText());
				int xe=Integer.parseInt(d4.getText());
				String sql="insert into bcadata values(?,?,?,?,?)";
				st=con.prepareStatement(sql);
				st.setInt(1, xa);
				st.setString(2, xb);
				st.setString(3, xc);
				st.setInt(4, xd);
				st.setInt(5, xe);
				int p=st.executeUpdate();
				JOptionPane.showMessageDialog(this,"Data Saved");
				con.close();
				b.setText("");
				b1.setText("");
				b2.setText("");
				b3.setText("");
				b4.setText("");
				
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
			d.setText("");
			d1.setText("");
			d2.setText("");
			d3.setText("");
			d4.setText("");
		}
	}

}

