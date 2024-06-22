import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class servicecentrefind extends JFrame implements ActionListener {
	JLabel serviceid,servicename,serviceaddress,serviceemail,servicephone,serviceregno;
	JTextField serviceid1,servicename1,serviceaddress1,serviceemail1,servicephone1,serviceregno1;
	JButton btn;
	public servicecentrefind()
	{
		setTitle("servicecentre");
		setSize(700,700);
		setLayout(null);
		serviceid=new JLabel("Service ID");
		serviceid.setBounds(50,60,200,30);
		add(serviceid);
		serviceid1=new JTextField();
		serviceid1.setBounds(550,60,100,30);
		add(serviceid1);
		servicename=new JLabel("Service Name");
		servicename.setBounds(50,120,200,30);
		add(servicename);
		servicename1=new JTextField();
		servicename1.setBounds(550,120,100,30);
		add(servicename1);
		serviceaddress=new JLabel("Service Address");
		serviceaddress.setBounds(50,180,200,30);
		add(serviceaddress);
		serviceaddress1=new JTextField();
		serviceaddress1.setBounds(550,180,100,30);
		add(serviceaddress1);
		serviceemail=new JLabel("Service Email");
		serviceemail.setBounds(50,240,200,30);
		add(serviceemail);
		serviceemail1=new JTextField();
		serviceemail1.setBounds(550,240,100,30);
		add(serviceemail1);
		servicephone=new JLabel("Service Phone");
		servicephone.setBounds(50,240,200,30);
		add(servicephone);
		servicephone1=new JTextField();
		servicephone1.setBounds(550,240,100,30);
		add(servicephone1);
		serviceregno=new JLabel("Service Regno");
		serviceregno.setBounds(50,240,200,30);
		add(serviceregno);
		serviceregno1=new JTextField();
		serviceregno1.setBounds(550,240,100,30);
		add(serviceregno1);
		btn=new JButton("Find");
		btn.setBounds(250,380,100,30);
		add(btn);
		btn.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		servicecentrefind obj=new servicecentrefind();
	}

	@Override
	public void actionPerformed(ActionEvent p) {
		// TODO Auto-generated method stub
		if(p.getSource()==btn)
		try
		{
			//step1
			int aa=Integer.parseInt(serviceid.getText());
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			String sql="select sername,seraddress,servemail,servphone,regno from servicecentre where servid=?";
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1,aa);
						
			int x=st.executeUpdate();
			ResultSet rs=st.executeQuery();
			if(rs.next()) 
			{
				servicename1.setText(rs.getString(1));
				serviceaddress1.setText(rs.getString(2));
				serviceemail1.setText(rs.getString(3));
				servicephone1.setText(rs.getString(4));
				serviceregno1.setText(rs.getString(5));
				serviceid1.setText(String.valueOf(rs.getInt(1)));
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

