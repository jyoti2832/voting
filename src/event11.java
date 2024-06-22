import java.applet.Applet;

import java.awt.*;
import java.awt.event.*;

public class event11 extends Applet implements MouseListener {
	Image ic;
	int x,y;
	
	public void init(){
		ic=getImage(getCodeBase(),"1000031547.jpg");
		x=200;
		y=200;
		addMouseListener(this);
	}
	public void paint(Graphics g) {
		g.drawImage(ic, x,y,200, 200, this);
				
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		x=e.getX();
		y=e.getY();
		repaint();
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
