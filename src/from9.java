
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class from9 extends JFrame implements ActionListener{
	JLabel a;
	JComboBox d;
	JButton btn;
	public from9()
	{
		setTitle("Form");
		setSize(700,700);
		setLayout(null);
		a=new JLabel("EmpId");
		a.setBounds(50,60,200,30);
		add(a);
		d=new JComboBox();
		filldata();
		d.setBounds(550,60,100,30);
		add(d);
		btn=new JButton("Delete");
		btn.setBounds(250,200,100,30);
		add(btn);
		btn.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		from9 obj=new from9();
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
			String sql="delete from employee where empid=?";
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1, aa);
			int x=st.executeUpdate();
			con.close();
			JOptionPane.showMessageDialog(this,"Data Deleted");
			d.setText(" ");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}
	void filldata() {
		try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		String sql="select empid from employee";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		
		
		while(rs.next())
		{
			d.addItem(String.valueOf(rs.getInt(1)));
		}
		con.close();
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

}
}