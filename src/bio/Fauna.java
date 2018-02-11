package bio;

import java.awt.Color;
import java.awt.Graphics;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.GameView.Layer;

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
