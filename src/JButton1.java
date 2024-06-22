import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class JButton1 extends JFrame implements MouseListener{
	JButton btn;
	int x=300,y=300;
	public JButton1()
	{
		setTitle("Button");
		setSize(800,800);
		setLayout(null);
		btn=new JButton("Hello");
		btn.setBounds(x,y,100,30);
		add(btn);
		addMouseListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JButton1 obj=new JButton1();
	}
	@Override
	public void mouseClicked(MouseEvent ae) {
		// TODO Auto-generated method stub
		x=ae.getX();
		y=ae.getY();
		btn.setBounds(x,y,100,50);
		
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
