package bio;

import java.awt.Color;
import java.awt.Graphics;

import gameEngine.Drawable;

public class Fauna implements Drawable{

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawOval(200, 200, 200, 200);
	}

}
