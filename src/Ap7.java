import java.applet.Applet;
import java.awt.*;

public class Ap7 extends Applet implements Runnable {
    
	Thread t;
	int y=100;
	int x=100;
	public void init()
	{
		
		t=new Thread(this);
		t.start();
	}
	
	public void paint(Graphics g)
	{
		
	g.drawString("name", y, x);	
	}
	
	public void run()
	{
		
		
			
		try {
			while(x<900)
			{
			Thread.sleep(500);
			y=y-5;
			repaint();
		}
		}
		catch(Exception e){
			
			
		}
		
	}
	
}