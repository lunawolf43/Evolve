package gameEngine;

import java.awt.Color;
import java.awt.Graphics;

public class Ticker implements Drawable {

	long startTime;
	
	public Ticker(long StartTime){
		startTime = StartTime;
	}
	
	@Override
	public void draw(Graphics g) {
		String str = "REALTIME: "+(System.currentTimeMillis() - startTime)/1000+"."+((System.currentTimeMillis() - startTime)%1000)/100;
		g.setColor(Color.WHITE);
		g.drawString(str, 5, 12);

	}

}
