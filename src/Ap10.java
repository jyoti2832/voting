import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Ap10 extends Applet implements Runnable,KeyListener{
	int x,y,w,h,i,x1,y1,w1,h1;
	int p=0;
	Thread t;
	public void init() {
		x=300;
		y=80;
		w=80;
		h=80;
		i=0;
		x1=400;
		y1=80;
		addKeyListener(this);
		t=new Thread(this);
		
	}
	public void paint(Graphics g) {
		g.drawOval(x, y, w, h);
		g.drawOval(x1, y1, w, h);
		g.drawString("P", x+35, y);
		g.drawString("R", x1, y1);
			
	}
	public void run() {
		try {
			while(i<=100)
			{
			if (p==1)
			{
					y=y+20;
					Thread.sleep(500);
					repaint();
				
			}
			if (p==2)
			{
					y1=y1+20;
					Thread.sleep(500);
					repaint();
			}
			i=i+1;
			}
		}
		catch(Exception e) {
		}
	}
	@Override
	public void keyPressed(KeyEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getKeyChar()=='p' || ae.getKeyChar()=='P')
		{
			p=1;
			t.start();
		}
		if(ae.getKeyChar()=='r' || ae.getKeyChar()=='R')
		{
			p=2;
			t.start();
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
