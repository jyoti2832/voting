import java.applet.Applet;

import java.awt.*;
import java.awt.event.*;
public class event10 extends Applet implements KeyListener {
	Image ic;
	int x,y;
	
	public void init(){
		ic=getImage(getCodeBase(),"1000031547.jpg");
		x=200;
		y=200;
		addKeyListener(this);
				
				
	}
	public void paint(Graphics g) {
		g.drawImage(ic, x,y, 200, 200, this);
		
}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==e.VK_UP)
		{
			y=y-10;
			repaint();
		}
		if(e.getKeyCode()==e.VK_DOWN)
		{
			y=y+10;
			repaint();
		}
		if(e.getKeyCode()==e.VK_RIGHT)
		{
			x=x-10;
			repaint();
		}
		if(e.getKeyCode()==e.VK_LEFT)
		{
			x=x+10;
			repaint();
		}
		
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