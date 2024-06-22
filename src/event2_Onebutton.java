import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
public class event2_Onebutton extends JFrame implements ActionListener {

	JButton btn,btn1,btn2;
	public event2_Onebutton() {
		setSize(800,800);
		setLayout(null);
		btn=new JButton("Red");
		btn.setBounds(200,10,100,100);
		add(btn);
		btn.addActionListener(this);
		btn1=new JButton("Green");
		btn1.setBounds(200,150,100,100);
		add(btn1);
		btn1.addActionListener(this);
		btn2=new JButton("Blue");
		btn2.setBounds(200,310,100,100);
		add(btn2);
		btn2.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[]args) {
		//TODO Auto-generated method stub
		event2_Onebutton obj=new event2_Onebutton();
		
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stubX
		if(e.getSource()==btn)
			getContentPane().setBackground(Color.RED);
		if(e.getSource()==btn1)
			getContentPane().setBackground(Color.GREEN);
		if(e.getSource()==btn2)
			getContentPane().setBackground(Color.BLUE);
	}
}