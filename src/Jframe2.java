import javax.swing.*;

public class Jframe2 extends JFrame {
	JTable jt;
	String row[]= {"ROLLNO","NAME","CLASS","SUBJECT","PHONE"};
	String data[][]= {{"2251868","JYOTI","BA","COMPUTER","8266046926"},{"2251866","ANJALI TIWARI","BA","FINACE","8650565678"},{"2251867","BHAWNA","BA","GD","8656005678"}};
	public Jframe2() {
		setTitle("Myframe");
		setSize(900,900);
		jt=new JTable(data,row);
		JScrollPane jp=new JScrollPane(jt);
		add(jp);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jframe2 obj=new Jframe2();
	}

}
