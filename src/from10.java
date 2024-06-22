import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class from10 extends JFrame implements ActionListener{
	JLabel a,b,c,h;
	JTextField d,e,f,g;
	JButton btn,btn1;
	public from10()
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
		btn=new JButton("Find");
		btn.setBounds(200,90,100,30);
		add(btn);
		btn.addActionListener(this);
		btn1=new JButton("Update");
		btn1.setBounds(300,380,100,30);
		add(btn1);
		btn1.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		from10 obj=new from10();
	}

	@Override
	public void actionPerformed(ActionEvent pa) {
		// TODO Auto-generated method stub
		if(pa.getSource()==btn)
		{
			try
			{
				// step1
				int aa=Integer.parseInt(d.getText());
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
				String sql="select name,city,salary from employee where empid=?";
				PreparedStatement st=con.prepareStatement(sql);
				st.setInt(1,aa);
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
		if(pa.getSource()==btn1)
		{
			try
			{
				// step1
				int x=Integer.parseInt(d.getText());
				String xa=e.getText();
				String xb=f.getText();
				int xd=Integer.parseInt(g.getText());
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
				String sql="update employee set name=?,city=?,salary=? where empid=?";
				PreparedStatement st=con.prepareStatement(sql);
				st.setString(1,xa);
				st.setString(2,xb);
				st.setInt(3,xd);
				st.setInt(4,x);
				int p=st.executeUpdate();
				con.close();
				JOptionPane.showMessageDialog(this,"Data Uptated");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		

	}

}

