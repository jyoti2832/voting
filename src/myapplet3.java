import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
public class myapplet3 extends Applet {
	Image ic;
	AudioClip ac;
	public void init(){
		ic=getImage(getCodeBase(),"1000031547.jpg");
		ac=getAudioClip(getCodeBase(),"sample-3s.wav");
	}
	public void paint(Graphics g) {
		g.drawImage(ic, 200, 200, 200, 200, this);
		ac.play();
		
	}

}
