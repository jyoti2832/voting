import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class from8 extends JFrame implements ActionListener {
	JLabel a,b,c,h;
	JTextField d,e,f,g;
	JButton btn,btn1;
	public from8()
	{
		setTitle("Form");
		setSize(700,700);
		setLayout(null);
		a=new JLabel("EmpId");
		a.setBounds(50,60,200,30);
		add(a);
		d=new JTextField();
		d.setBounds(550,60,100,30);
		add(d);
		btn=new JButton("find");
		btn.setBounds(250,100,100,30);
		add(btn);
		btn.addActionListener(this);
		b=new JLabel("Name");
		b.setBounds(50,120,200,30);
		add(b);
		e=new JTextField();
		e.setBounds(550,120,100,30);
		add(e);
		c=new JLabel("City");
		c.setBounds(50,180,200,30);
		add(c);
		f=new JTextField();
		f.setBounds(550,180,100,30);
		add(f);
		h=new JLabel("Salary");
		h.setBounds(50,240,200,30);
		add(h);
		g=new JTextField();
		g.setBounds(550,240,100,30);
		add(g);
		btn1=new JButton("update");
		btn1.setBounds(250,380,100,30);
		add(btn1);
		btn.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		from8 obj=new from8();
	}

	@Override
	public void actionPerformed(ActionEvent p) {
		// TODO Auto-generated method stub
		try
		{
			//step1
			int aa=Integer.parseInt(d.getText());
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			String sql="select name,city,salary from employee where empid=?";
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1,aa);
						
			int x=st.executeUpdate();
			ResultSet rs=st.executeQuery();
			if(rs.next()) 
			{
				e.setText(rs.getString(1));
				f.setText(rs.getString(2));
				g.setText(String.valueOf(rs.getInt(3)));
			}
			else
			{
				JOptionPane.showMessageDialog(this,"Not Found");
			}
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

}
