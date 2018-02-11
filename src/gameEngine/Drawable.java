package gameEngine;

import java.awt.Graphics;
import java.awt.Graphics2D;

public interface Drawable {
	
	/**
	 * Draw this item to the GameView
	 * @param g 
	 */
	public void draw(Graphics g);
}
