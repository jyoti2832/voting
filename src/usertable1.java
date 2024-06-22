import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class usertable1 extends JFrame {
	
	JButton btn1,btn2,btn3;
	public usertable1()
	{
		setTitle("Button");
		setSize(700,700);
		setLayout(null);


		btn1=new JButton("Insert");
		btn1.setBackground(Color.GREEN);
		btn1.setBounds(250,220,100,30);
		add(btn1);
		btn2=new JButton("Find");
		btn2.setBackground(Color.RED);
		btn2.setBounds(250,280,100,30);
		add(btn2);
		btn3=new JButton("Delete");
		btn3.setBackground(Color.BLUE);
		btn3.setBounds(250,340,100,30);
		add(btn3);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usertable1 obj=new usertable1();
	}

}
