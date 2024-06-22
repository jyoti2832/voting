import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Myframe7 extends JFrame implements ActionListener{
	JButton btn,btn1,btn2,btn3;
	public Myframe7()
	{
		setTitle("Event handlig");
		setSize(800,800);
		setLayout(null);
		btn=new JButton("Red");
		btn.setBounds(150,500,100,30);
		add(btn);
		btn.addActionListener(this);
		btn1=new JButton("Green");
		btn1.setBounds(150,550,100,30);
		add(btn1);
		btn1.addActionListener(this);
		btn2=new JButton("Blue");
		btn2.setBounds(150,600,100,30);
		add(btn2);
		btn2.addActionListener(this);
		btn3=new JButton("Blue");
		btn3.setBounds(150,650,100,30);
		add(btn3);
		btn3.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myframe7 obj=new Myframe7();
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==btn)
		getContentPane().setBackground(Color.RED);
		if(ae.getSource()==btn1)
			getContentPane().setBackground(Color.GREEN);
		if(ae.getSource()==btn2)
			getContentPane().setBackground(Color.BLUE);
		if(ae.getSource()==btn3)
			this.dispose();
	}

}
