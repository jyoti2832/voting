import java.applet.Applet;
import java.awt.*;
public class AppletTwo extends Applet {
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillRect(100, 100, 200, 100);
		g.setColor(Color.YELLOW);
		g.fillOval(100, 350, 100, 80);
		
		
	}
	
}
