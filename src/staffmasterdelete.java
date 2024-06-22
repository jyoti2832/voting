import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


import javax.swing.*;

public class staffmasterdelete extends JFrame implements ActionListener{
	JLabel a,b;
	JTextField d;
	JButton btn2,btn1;
	public staffmasterdelete() {
		setTitle("staffmaster Delete");
		setSize(700,700);
		setLayout(null);
		a=new JLabel("Staff Delete");
		a.setFont(new Font("Times New Roman",Font.BOLD,30));
		a.setForeground(Color.BLACK);
		a.setBounds(250,20,200,30);
		add(a);
		b=new JLabel("Staff Id");
		b.setFont(new Font("Times New Roman",Font.BOLD,30));
		b.setForeground(Color.BLACK);
		b.setBounds(70,100,200,30);
		add(b);
		d=new JTextField();
		d.setBounds(350,100,100,30);
		add(d);
		btn2=new JButton("Delete");
		btn2.setBackground(Color.CYAN);
		btn2.setBounds(150,220,100,30);
		add(btn2);
		btn2.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staffmasterdelete obj=new staffmasterdelete();
	}
	@Override
	public void actionPerformed(ActionEvent an) {
		// TODO Auto-generated method stub
		if(an.getSource()==btn2)
		{
			Connection con;
			PreparedStatement st;
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
				int xa=Integer.parseInt(d.getText());
				String sql="delete from staffmaster where staffid=?";
				st=con.prepareStatement(sql);
				st.setInt(1,xa);
				int k=st.executeUpdate();
				JOptionPane.showMessageDialog(this,"Deleted");
				con.close();
				d.setText("");
			}
			catch(Exception ex)
			{
				
			}
		}
	
	}

}
