import javax.swing.*;

public class Myframe3 extends JFrame {
	JLabel a;
	JList jt;
	JProgressBar jp;
	
public Myframe3()
	
	{
	setTitle("Myjframe");
	setSize(800,800);
	setLayout(null);
	a=new JLabel("Language");
	a.setBounds(50,50,100,40);
	add(a);
	String ct[]= {"c++","java","pyton"};
	jt=new JList(ct);
	jt.setBounds(450,50,100,40);
	add(jt);
	jp=new JProgressBar();
	jp.setMinimum(1);
	jp.setMinimum(100);
	jp.setValue(50);
	jp.setBounds(450,150,100,40);
	add(jp);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myframe3 obj=new Myframe3();
	}

}
