import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JRadioButton1 extends JFrame implements ActionListener{
	JRadioButton jb,jd,je;
	ButtonGroup bg;
	public JRadioButton1()
	{
		setTitle("RadioButton");
		setSize(800,800);
		setLayout(null);
		bg=new ButtonGroup();
		jb=new JRadioButton("Red");
		jd=new JRadioButton("Green");
		je=new JRadioButton("Blue");
		jb.setBounds(380,200,100,40);
		jd.setBounds(380,240,100,40);
		je.setBounds(380,280,100,40);
		bg.add(jb);
		bg.add(jd);
		bg.add(je);
		add(jb);
		add(jd);
		add(je);
		jd.addActionListener(this);
		je.addActionListener(this);
		jb.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JRadioButton1 obj=new JRadioButton1();
		

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==jb)
			getContentPane().setBackground(Color.RED);
		if(ae.getSource()==jd)
			getContentPane().setBackground(Color.GREEN);
		if(ae.getSource()==je)
			getContentPane().setBackground(Color.BLUE);
		
	}

}

