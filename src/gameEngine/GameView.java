package gameEngine;



public interface GameView {
	
	public static int numLayers = 4;
	public enum Layer{
		BACKGROUND, PLANT, ANIMAL, HUD
	}
	/**
	 * Add the drawable to the desired layer
	 * @param layer Layer to add drawable to
	 */
	public void addDrawable(Drawable item, Layer layer);
	
}
