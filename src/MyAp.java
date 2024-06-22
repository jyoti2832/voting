import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class MyAp extends Applet implements KeyListener {
	Image ic;
	int x=100;int y=200;
	public void init()
	{
		
		ic=getImage(getCodeBase(),"1000031547.jpg");
		addKeyListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawImage(ic,x,y,100,100,this);
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==e.VK_UP);
		{
			y=y-20;
			repaint();
		}
		if(e.getKeyCode()==e.VK_DOWN);
		{
			y=y+20;
			repaint();
		}
		if(e.getKeyCode()==e.VK_RIGHT);
		{
			x=x-20;
			repaint();
		}
		if(e.getKeyCode()==e.VK_LEFT);
		{
			x=x+20;
			repaint();
		}
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
