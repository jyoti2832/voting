import javax.swing.*;
import java.awt.*;
public class frame6 extends Jframe {
	JLabel a,b,c;
	JTextField h,g;
	
	public frame6()
	{
		setTitle("Myfram");
		setSize(800,800);
		setLayout(null);
		a=new JLabel("Registration form");
		a.setBounds(450,20,400,30);
		add(a);
		b=new JLabel("Name");
		b.setBounds(50,60,200,30);
		add(b);
		h=new JTextField();
		h.setBounds(550,60,100,30);
		add(h);
		c=new JLabel("Mother Name");
		c.setBounds(50,90,200,30);
		add(c);
		g=new JTextField();
		g.setBounds(550,90,100,30);
		add(g);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frame6 obj=new frame6();
	}

}
