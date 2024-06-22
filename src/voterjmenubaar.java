import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class voterjmenubaar extends JFrame implements ActionListener{
	JMenuBar mb;
	JMenu f;
	JMenuItem m1,m2;
	public voterjmenubaar()
	{
		setTitle("Menu");
		setSize(700,700);
		setLayout(null);
		mb=new JMenuBar();
		f=new JMenu("Voters");
		m1=new JMenuItem("Update");
		m2=new JMenuItem("Find");
		
		m1.addActionListener(this);
		m2.addActionListener(this);
			
		f.add(m1);
		f.addSeparator();
		f.add(m2);
		f.addSeparator();
		mb.add(f);
	
		setJMenuBar(mb);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		voterjmenubaar obj=new voterjmenubaar();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==m1)
		{
			new votersupdate();
		}
		if(e.getSource()==m2)
		{
			new votersfind();
		}
		

		
	}

}
