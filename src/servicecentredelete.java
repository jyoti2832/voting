import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class servicecentredelete extends JFrame implements ActionListener{
	JLabel id;
	JTextField id1;
	JButton btn;
	public servicecentredelete()
	{
		setTitle("Servicecentre");
		setSize(700,700);
		setLayout(null);
		id=new JLabel("SerCentId");
		id.setBounds(50,60,200,30);
		add(id);
		id1=new JTextField();
		id1.setBounds(550,60,100,30);
		add(id1);
		btn=new JButton("Delete");
		btn.setBounds(250,200,100,30);
		add(btn);
		btn.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		servicecentredelete obj=new servicecentredelete();
	}

	@Override
	public void actionPerformed(ActionEvent p) {
		// TODO Auto-generated method stub
		try
		{
			//step1
			int id2=Integer.parseInt(id1.getText());
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			String sql="delete from servicecentre where servid=?";
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1, id2);
			int x=st.executeUpdate();
			con.close();
			JOptionPane.showMessageDialog(this,"Data Deleted");
			id1.setText(" ");
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}

}

