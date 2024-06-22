import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
public class event5 extends JFrame implements KeyListener {
	public event5() {
		setTitle("KEYLISTENER");
		setSize(800,800);
		setLayout(null);
		addKeyListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[]args) {
		//TODO Auto-generated method stub
		event5 obj=new event5();

	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyChar()=='r'|| e.getKeyChar()=='R')
			getContentPane().setBackground(Color.RED);
		if(e.getKeyChar()=='g'|| e.getKeyChar()=='G')
			getContentPane().setBackground(Color.GREEN);
		if(e.getKeyChar()=='b'|| e.getKeyChar()=='B')
			getContentPane().setBackground(Color.BLUE);
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}