import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class from5 extends JFrame implements ActionListener{
	JLabel a,b,c,h;
	JTextField d,e,f,g;
	JButton btn;
	public from5()
	{
		setTitle("Form");
		setSize(700,700);
		setLayout(null);
		a=new JLabel("stuid");
		a.setBounds(50,60,200,30);
		add(a);
		d=new JTextField();
		d.setBounds(550,60,100,30);
		add(d);
		b=new JLabel("name");
		b.setBounds(50,120,200,30);
		add(b);
		e=new JTextField();
		e.setBounds(550,120,100,30);
		add(e);
		c=new JLabel("course");
		c.setBounds(50,180,200,30);
		add(c);
		f=new JTextField();
		f.setBounds(550,180,100,30);
		add(f);
		h=new JLabel("marks");
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
		from5 obj=new from5();
	}

	@Override
	public void actionPerformed(ActionEvent p) {
		// TODO Auto-generated method stub
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
