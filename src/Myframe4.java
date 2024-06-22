import javax.swing.*;

public class Myframe4 extends JFrame {
	JTable jt;
public Myframe4()
	
	{
	setTitle("Myjframe");
	setSize(800,800);
	String rows[]= {"rollno","name","marks"};
	String data[][]= {{"101","ravi","45"},{"102","deepak","78"},{"103","Jyoti","67"}};
	jt=new JTable(data,rows);
	JScrollPane jp=new JScrollPane(jt);
	add(jp);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myframe4 obj=new Myframe4();
	}

}
