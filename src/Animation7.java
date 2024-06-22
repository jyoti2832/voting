import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class Animation7 extends Applet implements Runnable {
	Color c[]= {Color.RED,Color.GREEN,Color.BLUE,Color.PINK,Color.CYAN};
	int i,h,w,y;
	Thread t;
	
	public void init()
	{
	i=0;
	t=new Thread(this);
	t.start();
	}
	public void run()
	{
		try
		{
			while(i<60)
			{
				Thread.sleep(3000);
				repaint();
				if(i==4)
				{
					i=-1;
					h=200;
					w=200;
					y=200;
					
				}
				i++;
			}
		}
		catch(Exception e)
		{
			
		}
	}
		public void paint(Graphics g) {
			{
				setBackground(c[i]);
				g.drawRect(i,y,w,y);
			}
	}
}


