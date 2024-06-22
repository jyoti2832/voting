import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Myframe8 extends JFrame implements ActionListener{
	JTextField tf;
	JButton btn1,btn2;
	public Myframe8()
	{
		setTitle("Event handlig");
		setSize(800,800);
		setLayout(null);
		tf=new JTextField();
		tf.setBounds(100,100,100,50);
		add(tf);
		btn1=new JButton("Square");
		btn1.setBounds(150,500,100,30);
		add(btn1);
		btn1.addActionListener(this);
		btn2=new JButton("Cube");
		btn2.setBounds(100,300,100,30);
		add(btn2);
		btn2.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myframe8 obj=new Myframe8();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==btn1)
		{
			int x=Integer.parseInt(tf.getText());
			int y=x*x;
			JOptionPane.showMessageDialog(this,y);
		}
		if(ae.getSource()==btn2)
		{
			int x=Integer.parseInt(tf.getText());
			int y=x*x*x;
			JOptionPane.showMessageDialog(this,y);
		}
	}

}
