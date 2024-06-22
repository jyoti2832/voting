import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class from1 extends JFrame implements ActionListener{
	JLabel a,b,c,h;
	JTextField d,e,f,g;
	JButton btn;
	public from1()
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
		btn=new JButton("Save");
		btn.setBounds(250,380,100,30);
		add(btn);
		btn.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		from1 obj=new from1();
	}

	@Override
	public void actionPerformed(ActionEvent p) {
		// TODO Auto-generated method stub
		if(d.getText().length()==0 || e.getText().length()==0 || f.getText().length()==0 || g.getText().length()==0)
		{
			JOptionPane.showMessageDialog(this,"fill all data");
			
		}
		else
		{
			try
			{
				//step1
				int aa=Integer.parseInt(d.getText());
				String ab=e.getText();
				String ac=f.getText();
				int ad=Integer.parseInt(g.getText());
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
				String sql="insert into employee values(?,?,?,?)";
				PreparedStatement st=con.prepareStatement(sql);
				st.setInt(1,aa);
				st.setString(2,ab);
				st.setString(3,ac);
				st.setInt(4, ad);
				int x=st.executeUpdate();
				con.close();
				JOptionPane.showMessageDialog(this,"Data saved");
				d.setText(" ");
				e.setText(" ");
				f.setText(" ");
				g.setText(" ");
				
				
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		}
		
		

}
