import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
import java.sql.*;
public class staffmasterallscreen extends JFrame implements ActionListener {
	JLabel a;
	JButton btn,btn1,btn2,btn3;
	public staffmasterallscreen()
	{
		setTitle("Staff");
		setSize(700,700);
		setLayout(null);
		a=new JLabel("Voting portal");
		a.setBounds(250,20,200,30);
		add(a);
		btn=new JButton("Insert");
		btn.setBounds(250,100,100,30);
		add(btn);
		btn.addActionListener(this);
		btn1=new JButton("Delete");
		btn1.setBounds(250,200,100,30);
		add(btn1);
		btn1.addActionListener(this);
		btn2=new JButton("Find");
		btn2.setBounds(250,300,100,30);
		add(btn2);
		btn2.addActionListener(this);
		btn3=new JButton("Update");
		btn3.setBounds(250,400,100,30);
		add(btn3);
		btn3.addActionListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staffmasterallscreen obj=new staffmasterallscreen();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn)
			
		{
			new staffmastersave();
		}
		if(e.getSource()==btn1)
			
		{
			new staffmasterdelete();
		}
		if(e.getSource()==btn2)
			
		{
			new staffmasterfind();
		}
		if(e.getSource()==btn3)
			
		{
			new staffmasterupdate();
		}
	}
	

}
