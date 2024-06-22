import java.applet.Applet;
import java.awt.*;
public class Appletfour extends Applet {
	int x[]= {100,200,350};
	int y[]= {200,50,200};
	Image ic;
	public void init() {
		ic=getImage(getCodeBase(),"1000032877.jpg");
	}
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillPolygon(x,y,3);
		g.drawImage(ic,200,300,200,250,this);
	}
		
}
