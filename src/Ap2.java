import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Ap2 extends Applet implements KeyListener {
	int x,y;
	Color c;
	
	public void init() {
		c=Color.RED;
		x=200;
		y=100;
		addKeyListener(this);
				
		
	}
	public void paint(Graphics g) {
		g.drawRect(x, y, 100, 150);
		g.setColor(c);
		g.fillOval(200,300,200,200);
		
	}

	@Override
	public void keyPressed(KeyEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getKeyChar()=='g'|| ae.getKeyChar()=='G'){
			c=Color.green;
			repaint();}
				
			
			if(ae.getKeyChar()=='b'|| ae.getKeyChar()=='B'){
				c=Color.BLUE;
				repaint();}
				if(ae.getKeyChar()=='r'|| ae.getKeyChar()=='R'){
					c=Color.RED;
					repaint();}
	}
	@Override
	public void keyReleased(KeyEvent ae) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent ae) {
		// TODO Auto-generated method stub
		
	}
}
