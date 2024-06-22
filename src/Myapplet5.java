import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class Myapplet5 extends Applet {
	int x[]= {200,450,600};
	int y[]= {600,450,600};
	public void init () {
		

	}
	public void paint (Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(200,100,300,400);
		g.setColor(Color.YELLOW);
		g.fillOval(200,300,200,100);
		g.setColor(Color.GREEN);
		g.setColor(Color.RED);
		g.fillPolygon(x,y,3);
		
	}

}
