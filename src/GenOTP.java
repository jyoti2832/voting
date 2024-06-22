import javax.swing.*;
import java.sql.*;
import java.util.Random;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class GenOTP extends JFrame implements ActionListener {
    JLabel j1, j2;
    JTextField tf1, tf2;
    JButton jb1;
    String otp;
public GenOTP() {
    setTitle("Votersone");
    setLayout(null);
    setSize(500, 650);

    // Set background color of the frame
    getContentPane().setBackground(new Color(245, 245, 245));

    // Font for labels and text fields
    
    // Creating labels and text fields with custom styling
    j1 = new JLabel("VOTERS ID :");
    j1.setBounds( 70, 30, 100, 30);
    add(j1);
    tf1 = new JTextField();
    tf1.setBounds(220, 30, 200, 30);
    add(tf1);
    j2 = new JLabel("EMAIL :");
    j2.setBounds( 70, 70, 140, 30);
    add(j2);
    tf2 = new JTextField();
    tf2.setBounds( 220, 70, 200, 30);

    add(tf2);
    jb1=new JButton("OTP");
    jb1.setBounds(100, 300, 100, 50);
    add(jb1);
    jb1.addActionListener(this);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GenOTP();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		TextMail obj=new TextMail();
	Random r=new Random();
   otp=String.valueOf(Math.abs(r.nextInt()*9000));         
	obj.sendMessage(tf2.getText(),otp);
	insertdata();
	}
	void insertdata() {
		 Connection con = null;
	        PreparedStatement st = null;
	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");

	            String xb = tf1.getText();
	            String xc = tf2.getText();
	            String sql = "insert into votingotp values(?,?,?,?)";
	            st = con.prepareStatement(sql);
	            st.setString(1, xb);
	            st.setString(2, xc);
	            st.setInt(3, Integer.parseInt(otp));
	            st.setInt(4, 0);
	            int p = st.executeUpdate();
	            JOptionPane.showMessageDialog(this, "OTP Send and save" );
	            con.close();
	        }
	        catch(Exception ex) {
	        	System.out.println(ex.toString());
	        }
	}
}