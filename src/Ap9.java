import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class Ap9 extends Applet implements Runnable,KeyListener{
	Thread t;
	int x,y,w,h,i;
	
	
	public void init()
	{
		x=300;
		y=50;
		w=150;
		h=150;
		i=0;
		addKeyListener(this);
		t=new Thread(this);
		
	}
	public void paint(Graphics g)
	{
		g.drawOval(x, y, w, h);
		g.drawString("J",x+70,y+70);
		
		g.drawOval(x+160,y,w,h);
		g.drawString("Y",x+230,y+70);
		
		g.drawOval(x+320,y,w,h);
		g.drawString("O",x+390,y+70);
		
		g.drawOval(x+480,y,w,h);
		g.drawString("T",x+550,y+70);
		
		g.drawOval(x+640,y,w,h);
		g.drawString("I",x+710,y+70);
	
	}
	public void Run()
	{
		try
		{
			while(i<=50)
			{
				Thread.sleep(1000);
				y=y+20;
				repaint();
				i=i+1;
			}
		}
		catch(Exception e)
		{
			
		}
	}
	@Override
	public void keyPressed(KeyEvent ae) {
		// TODO Auto-generated method stub
		if (ae.getKeyChar()=='j' || ae.getKeyChar()=='J' );
		{
		t.start();	
		}
		if (ae.getKeyChar()=='y' || ae.getKeyChar()=='Y' );
		{
		t.start();	
		}
		if (ae.getKeyChar()=='o' || ae.getKeyChar()=='O' );
		{
		t.start();	
		}
		if (ae.getKeyChar()=='t' || ae.getKeyChar()=='T' );
		{
		t.start();	
		}
		if (ae.getKeyChar()=='i' || ae.getKeyChar()=='I' );
		{
		t.start();	
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
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
