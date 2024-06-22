import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class votingdatashow extends JFrame {
	JTable jt;
	String rows []= {" VOTERID","CITYID","CANDIDATEID","Date"};
	DefaultTableModel model;
	
	public votingdatashow()

	

	{
		setTitle("Voting Data Table");
		setSize(800,800);
		jt= new JTable ();
		filldata();
		jt.setModel(model);
		JScrollPane jp=new JScrollPane(jt);
		add(jp);
		
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		votingdatashow	obj=new votingdatashow();
		


	}
	void filldata() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			 Statement st = con.createStatement();
			 ResultSet rs = st.executeQuery("select * from votingdata");
			 model=new DefaultTableModel();
			 model.setColumnIdentifiers(rows);
			 	while(rs.next())
			 	{
			 		
			 		String aa= rs.getString(1);
			 		String ab = rs.getString(2);
			 		String ac= rs.getString(3);
			 		String ad= rs.getString(4);
			 		model.addRow(new Object[] {aa,ab,ac,ad});
			 	}
			 	con.close();
			
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}

}