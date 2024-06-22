import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class customersinsert extends JFrame implements ActionListener{
	JLabel custid,ename,address,email,phone,regno;
	JTextField custid1,ename1,address1,email1,phone1,regno1;
	JButton btn,btn1;
	public customersinsert()
	{
		setTitle("servicecentre");
		setSize(700,700);
		setLayout(null);
		custid=new JLabel("custid");
		custid.setBounds(50,60,200,30);
		add(custid);
		custid1=new JTextField();
		custid1.setBounds(550,60,100,30);
		add(custid1);
		ename=new JLabel("Name");
		ename.setBounds(50,120,200,30);
		add(ename);
		ename1=new JTextField();
		ename1.setBounds(550,120,100,30);
		add(ename1);
		address=new JLabel("Address");
		address.setBounds(50,180,200,30);
		add(address);
		address1=new JTextField();
		address1.setBounds(550,180,100,30);
		add(address1);
		email=new JLabel("Email");
		email.setBounds(50,240,200,30);
		add(email);
		email1=new JTextField();
		email1.setBounds(550,240,100,30);
		add(email1);
		phone=new JLabel("Phone");
		phone.setBounds(50,300,200,30);
		add(phone);
		phone1=new JTextField();
		phone1.setBounds(550,300,100,30);
		add(phone1);
		regno=new JLabel("Regno");
		regno.setBounds(50,360,200,30);
		add(regno);
		regno1=new JTextField();
		regno1.setBounds(550,360,100,30);
		add(regno1);
		
		
		btn=new JButton("Save");
		btn.setBounds(250,420,100,30);
		add(btn);
		btn.addActionListener(this);
		btn1=new JButton("Close");
		btn1.setBounds(400,420,100,30);
		add(btn1);
		btn1.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customersinsert obj=new customersinsert();
	}

	@Override
	public void actionPerformed(ActionEvent p) {
		// TODO Auto-generated method stub
		if(custid1.getText().length()==0 || ename1.getText().length()==0 || address1.getText().length()==0 || email1.getText().length()==0)
		{
			JOptionPane.showMessageDialog(this,"fill all data");
			
		}
		else
		{
			try
			{
				//step1
				int custid=Integer.parseInt(custid1.getText());
				String ename=ename1.getText();
				String address=address1.getText();
				String email=email1.getText();
				String phone=phone1.getText();
				String regno=regno1.getText();
				
				int id1=Integer.parseInt(custid1.getText());
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
				String sql="insert into customers values(?,?,?,?,?,?)";
				PreparedStatement st=con.prepareStatement(sql);
				st.setInt(1,custid);
				st.setString(2,ename);
				st.setString(3,address);
				st.setString(4, email);
				st.setString(5,phone);
				st.setString(6,regno);
				
				
				int x=st.executeUpdate();
				con.close();
				JOptionPane.showMessageDialog(this,"Data saved");
				custid1.setText(" ");
				ename1.setText(" ");
				address1.setText(" ");
				email1.setText(" ");
				phone1.setText(" ");
				regno1.setText(" ");
				
				
				
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		}
		
		

}

