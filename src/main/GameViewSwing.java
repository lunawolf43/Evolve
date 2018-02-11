package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.LinkedList;

import javax.swing.JComponent;

import gameEngine.Drawable;
import gameEngine.GameView;

public class GameViewSwing extends JComponent implements GameView{

	//Maintain list of all drawables, by layer
	static LinkedList<Drawable> drawables[];
	
	@SuppressWarnings("unchecked")
	public GameViewSwing(){
		
		drawables = new LinkedList[GameView.numLayers];
		for( int i = 0; i < GameView.numLayers; i++) {
		    drawables[i] = new LinkedList<Drawable>();
		}
		
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.black);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		for( int i = 0; i < GameView.numLayers; i++) {
		    for(Drawable d : drawables[i]){
		    	d.draw(g);
		    }
		}
	}

	@Override
	public void addDrawable(Drawable item, Layer layer) {
		switch(layer){
		case BACKGROUND:
			drawables[0].add(item);
			break;
		case PLANT:
			drawables[1].add(item);
			break;
		case ANIMAL:
			drawables[2].add(item);
			break;
		case HUD:
			drawables[3].add(item);
			break;
		}
	}

	@Override
	public void update() {
		repaint();
	}
	
}
