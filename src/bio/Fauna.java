package bio;

import java.awt.Color;
import java.awt.Graphics;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.GameView.Layer;

/**
 * A creature of Fauna consists of two parts: the organs, which may have attached nerves, and the DNA, which
 * lists organs and may be passed on. 
 */
public class Fauna implements Drawable{
	public static GameEngine gameEngine;
	public int x;
	public int y;
	
	public Fauna() {
		gameEngine.View.addDrawable(this, Layer.ANIMAL);
		
		
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawOval(200, 200, 200, 200);
	}

}
