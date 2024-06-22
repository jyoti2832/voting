import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class event7 extends JFrame {
	JLabel a;
	JSpinner jp;
	JButton btn,btn1,btn2;
	public event7()
	{
		setTitle("SpinBox");
		setSize(700,700);
		setLayout(null);
		a=new JLabel("Java");
		a.setFont(new Font("Arial",Font.BOLD,30));
		a.setForeground(Color.BLACK);
		a.setBounds(300,20,400,30);
		add(a);
		jp=new JSpinner();
		jp.setBounds(300,120,100,30);
		add(jp);
		btn=new JButton("Red");
		btn.setBounds(50,350,100,30);
		add(btn);
		btn1=new JButton("Green");
		btn1.setBounds(250,350,100,30);
		add(btn1);
		btn2=new JButton("Yellow");
		btn2.setBounds(450,350,100,30);
		add(btn2);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		event7 obj=new event7();
	}

}
