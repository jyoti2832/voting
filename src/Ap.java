import java.applet.Applet;
import java.awt.*;

public class Ap extends Applet implements Runnable{
	int i;
	Thread t;
	int x,y,w,h;
	Color c[]= {Color.RED,Color.GREEN,Color.BLACK,Color.BLUE,Color.RED,Color.PINK,Color.GRAY,Color.CYAN,Color.BLACK};
	public void init()
	{
		i=0;
		x=500;
		y=400;
		w=100;
		h=120;
		t=new Thread(this);
		t.start();
	}
	
	
	public void paint(Graphics g) {
		g.setColor(c[i]);
		
		g.fillRect(x, y, w, h);
		}
	public void run()
	{
		try
		{
			while(i<=10)
			{
				x=x-20;
				y=y-20;
				w=w+30;
				h=h+30;
				Thread.sleep(1000);
				repaint();
				i=i+1;
			}
		}
		catch(Exception e)
		{
			
		}
	}

}
