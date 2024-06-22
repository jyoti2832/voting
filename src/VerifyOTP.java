import javax.swing.*;
import java.sql.*;
import java.util.Random;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class VerifyOTP extends JFrame implements ActionListener {
    JLabel j1, j2;
    JTextField tf1, tf2;
    JButton jb1;
    String otp;
public VerifyOTP() {
    setTitle("Votersone");
    setLayout(null);
    setSize(500, 650);

    // Set background color of the frame
    getContentPane().setBackground(new Color(245, 245, 245));

    // Font for labels and text fields
    
    // Creating labels and text fields with custom styling
    j1 = new JLabel("EMAIL ID :");
    j1.setBounds( 70, 30, 100, 30);
    add(j1);
    tf1 = new JTextField();
    tf1.setBounds(220, 30, 200, 30);
    add(tf1);
    j2 = new JLabel("OTP :");
    j2.setBounds( 70, 70, 140, 30);
    add(j2);
    tf2 = new JTextField();
    tf2.setBounds( 220, 70, 200, 30);

    add(tf2);
    jb1=new JButton("Verify");
    jb1.setBounds(100, 300, 100, 50);
    add(jb1);
    jb1.addActionListener(this);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VerifyOTP();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		 Connection con = null;
	        PreparedStatement st = null;
	        ResultSet rs;
	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");

	            String xb = tf1.getText();
	            int xc=Integer.parseInt(tf2.getText());
	            String sql = "select * from votingotp where email=? and otp=? and status=0";
	            st = con.prepareStatement(sql);
	            st.setString(1, xb);
	            st.setInt(2, xc);
	            rs=  st.executeQuery();
	            if (rs.next())
	            {
	            JOptionPane.showMessageDialog(this, "OTP verified" );
	            new votingdatasave();
	            }
	            else
	            {
	            	JOptionPane.showMessageDialog(this, "OTP /Email Wrong" );	
	            }
	            con.close();
	        }
	        catch(Exception ex) {
	        	System.out.println(ex.toString());
	        }
	}
}