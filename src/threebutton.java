import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class threebutton extends JFrame implements ActionListener{
	JButton btn,btn2,btn3;
	public threebutton()
	{
		setTitle("Event handlig");
		setSize(800,800);
		setLayout(null);
		btn=new JButton("Green");
		btn.setBounds(100,50,200,30);
		add(btn);
		btn.addActionListener(this);
		btn2=new JButton("White");
		btn2.setBounds(100,100,200,30);
		add(btn2);
		btn2.addActionListener(this);
		btn3=new JButton("Black");
		btn3.setBounds(100,150,200,30);
		add(btn3);
		btn3.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threebutton obj=new threebutton();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this,"welcome here.");
	}

}
