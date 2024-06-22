import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
public class event4 extends JFrame implements ActionListener {
	JTextField t1,t2;
	JButton btn,btn1,btn2,btn3;
	public event4() {
		setSize(800,800);
		setLayout(null);
		t1=new JTextField();
		t1.setBounds(200,100,100,30);
		add(t1);
		t2=new JTextField();
		t2.setBounds(200,150,100,30);
		add(t2);
		btn=new JButton("+");
		btn.setBounds(50,300,70,30);
		add(btn);
		btn.addActionListener(this);
		btn1=new JButton("-");
		btn1.setBounds(150,300,70,30);
		add(btn1);
		btn1.addActionListener(this);
		btn2=new JButton("*");
		btn2.setBounds(250,300,70,30);
		add(btn2);
		btn2.addActionListener(this);
		btn3=new JButton("/");
		btn3.setBounds(350,300,70,30);
		add(btn3);
		btn3.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[]args) {
		//TODO Auto-generated method stub
		event4 obj=new event4();
		
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn)
		{
			int x=Integer.parseInt(t1.getText());
			int y=Integer.parseInt(t2.getText());
			int p=x+y;
			JOptionPane.showMessageDialog(this,"Sum is "+String.valueOf(p));
		}
		if(e.getSource()==btn1)
		{
			int x=Integer.parseInt(t1.getText());
			int y=Integer.parseInt(t2.getText());
			int p=x-y;
			JOptionPane.showMessageDialog(this,"Subtract is "+String.valueOf(p));
		}
		if(e.getSource()==btn2)
		{
			int x=Integer.parseInt(t1.getText());
			int y=Integer.parseInt(t2.getText());
			int p=x*y;
			JOptionPane.showMessageDialog(this,"Mul is "+String.valueOf(p));
		}
		if(e.getSource()==btn3)
		{
			int x=Integer.parseInt(t1.getText());
			int y=Integer.parseInt(t2.getText());
			int p=x/y;
			JOptionPane.showMessageDialog(this,"Div is "+String.valueOf(p));
		}
	}
}