import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;
public class votingportal1 extends JFrame implements ActionListener {
	JLabel a;
	JButton btn,btn1;
	public votingportal1()
	{
		setTitle("voting");
		setSize(2000,2000);
		setLayout(null);
		getContentPane().setBackground(Color.PINK);
		a=new JLabel("Voting portal System");
		a.setFont(new Font("Times New Roman",Font.BOLD,60));
		a.setForeground(Color.BLACK);
		a.setBounds(700,30,800,100);
		add(a);
		btn=new JButton("Admin");
		btn.setFont(new Font("Times New Roman",Font.BOLD,35));
		btn.setForeground(Color.RED);
		btn.setBackground(Color.YELLOW);
		btn.setBounds(900,200,150,100);
		add(btn);
		btn.addActionListener(this);
		btn1=new JButton("Voter");
		btn1.setFont(new Font("Times New Roman",Font.BOLD,35));
		btn1.setForeground(Color.RED);
		btn1.setBackground(Color.cyan);
		btn1.setBounds(900,350,150,100);
		add(btn1);
		btn1.addActionListener(this);
	

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		votingportal1 obj=new votingportal1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn)
			
		{
			new votingsystemjmenubaar();
		}
		if(e.getSource()==btn1)
			
		{
			new voterjmenubaar();
		}
		}
	

}