import java.applet.Applet;
import java.awt.*;
public class Applet3 extends Applet {
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillRect(250, 100, 5, 400);
		g.setColor(Color.black);
		g.drawRect(250, 100, 5, 400);
		
		g.setColor(Color.orange);
		g.fillRect(255, 102, 180, 40);
		g.setColor(Color.black);
		g.drawRect(255,102,180,40);
		
		g.setColor(Color.white);
		g.fillRect(255, 142, 180, 40);
		g.setColor(Color.black);
		g.drawRect(255,142,180,40);
		
		g.setColor(Color.green);
		g.fillRect(255, 182, 180, 40);
		g.setColor(Color.black);
		g.drawRect(255,182,180,40);
		
	}
}
