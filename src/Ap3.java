import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Ap3 extends Applet implements MouseMotionListener{
	int x,y;
	public void init() {
		x=0;
		y=0;
		addMouseMotionListener(this);
	}
	public void paint(Graphics g) {
		g.drawString("x is"+x+"y is"+y,200,100);
	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent ae) {
		// TODO Auto-generated method stub
		x=ae.getX();
		y=ae.getY();
		repaint();
	}
}
