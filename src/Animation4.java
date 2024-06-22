import java.applet.Applet;
import java.awt.*;
public class Animation4 extends Applet implements Runnable{
	int x,y,w,h;
	Thread t;
	int i=0;
	public void init()
	{
		x=200;
		y=200;
		w=100;
		h=100;
		t=new Thread(this);
		t.start();
	}
	public void paint(Graphics g) {
		g.drawRect(x,y,w,h);
	}
	public void run()
	{
		try
		 {
			while (i<=10)
			{
				Thread.sleep(1000);
				x=x-15;
				y=y+15;
				w=w+20;
				h=h+20;
				i=i+1;
				
				repaint();
				
			}
		 }
		catch (Exception e)
		{
			
		}
	 }
	
}
