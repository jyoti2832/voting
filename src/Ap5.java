import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Ap5 extends Applet implements KeyListener {
	Image ic;
	int x=100;int y=200;
	public void init()
	{
		
		ic=getImage(getCodeBase(),"bike1.jpg");
		addKeyListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawImage(ic,x,y,100,100,this);
		
	}
	@Override
	public void keyPressed(KeyEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getKeyCode()==ae.VK_RIGHT)
		{
			x=x+20;
			repaint();
		}
		if(ae.getKeyCode()==ae.VK_LEFT)
		{
			x=x-20;
			repaint();
		}
		if(ae.getKeyCode()==ae.VK_UP)
		{
			y=y+20;
			repaint();
		}
		if(ae.getKeyCode()==ae.VK_DOWN)
		{
			y=y-20;
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
