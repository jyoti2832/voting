import java.sql.*;
import javax.swing.*;
import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class GetResult extends JFrame implements ActionListener {
	JLabel a;
	JTextArea b,c;
	JComboBox cmb;JButton btn;
	public GetResult() {
		// TODO Auto-generated constructor stub
		setTitle("Delete Data Election");
		setSize(800,800);
		setLayout(null);
		a = new JLabel(" Election Result");
		a.setFont(new Font("Arial",Font.ITALIC,35));
		a.setBounds(300,50,550,40);
		add(a);
		cmb=new JComboBox();
		cmb.setBounds(300, 150, 100, 50);
		add(cmb);
		fillcitydata();
		btn=new JButton("Check Now");
		btn.setBounds(450,150,100,50);
		add(btn);
		btn.addActionListener(this);
		b = new JTextArea();
		b.setFont(new Font("Arial",Font.ITALIC,25));
		b.setForeground(Color.BLUE);
		b.setBounds(60,250,100,400);
		add(b);
		c = new JTextArea();
		c.setFont(new Font("Arial",Font.ITALIC,25));
		c.setForeground(Color.BLUE);
		c.setBounds(300,250,100,400);
		add(c);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GetResult();
	}
	void fillcitydata() {
	    Connection con ;
	    Statement stmt ;
	    ResultSet rst ;
	    try {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
	        String sql = "select cityid from citymaster";
	        
	       
	        stmt = con.createStatement();
	        rst = stmt.executeQuery(sql);
	        while (rst.next()) {
	        cmb.addItem(rst.getString(1));
	     
	       
	        }
	    } catch (Exception ex) {
	      System.out.println(ex);
	    }
	}
	void getResults()
	{
		    Connection con ;
		    PreparedStatement stmt ;
		    ResultSet rst ;
		    String can="\n";String res="\n";
		    try {
		        Class.forName("oracle.jdbc.driver.OracleDriver");
		        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
		        String sql = "select candidateid,count(candidateid) from votingdata where cityid=? group by candidateid order by count(candidateid) desc";
		        
		       System.out.println(cmb.getSelectedItem().toString());
		        stmt = con.prepareStatement(sql);
		        stmt.setString(1, cmb.getSelectedItem().toString());
		        rst = stmt.executeQuery();
		        while (rst.next()) {
		        	can=can+rst.getString(1)+"\n";
		        	res=res+String.valueOf(rst.getInt(2))+"\n";
		        	
		        	//res=res+String.valueOf(rst.getInt(1))+"\n";
		        }
		        System.out.println(can);
		        System.out.println(res);
		        b.setText(can);
		        c.setText(res);
		    } catch (Exception ex) {
		      System.out.println(ex);
		    }
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn)
		{
			getResults();
		}
	}
}
