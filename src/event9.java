import javax.swing.*;
import java.awt.event.*;

import java.awt.*;
public class event9 extends JFrame implements MouseListener{
	JLabel jt;
	public event9( ) {
		setTitle("frame");
		setSize(700,700);
		setLayout(null);
		jt=new JLabel("hello");
		jt.setBounds(200,150,100,10);
		add(jt);
		addMouseListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		event9 obj=new event9();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		{
			int x=e.getX();
			int y=e.getY();
			jt.setBounds(x,y,100,30);
		}
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
