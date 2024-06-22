import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListener1 extends JFrame implements KeyListener{
	public KeyListener1()
	{
		setTitle("KeyListener");
		setSize(800,800);
		setLayout(null);
		addKeyListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyListener1 obj=new KeyListener1();
	}
	@Override
	public void keyPressed(KeyEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getKeyChar()=='r'|| ae.getKeyChar()=='R')
			getContentPane().setBackground(Color.RED);
		if(ae.getKeyChar()=='g'|| ae.getKeyChar()=='G')
			getContentPane().setBackground(Color.GREEN);
		if(ae.getKeyChar()=='b'|| ae.getKeyChar()=='B')
			getContentPane().setBackground(Color.BLUE);
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
