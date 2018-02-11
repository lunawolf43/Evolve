package gameEngine;

import bio.Fauna;
import gameEngine.GameView.Layer;
import main.GameViewSwing;

//1,000,000 lines of code
//let's go!

public class GameEngine {
	
	public GameView View;
	public long startTime;
	
	
	public GameEngine(GameView gameView) {
		View = gameView;
		Fauna.gameEngine = this;
		
		startTime = System.currentTimeMillis();
		View.addDrawable(new Ticker(startTime), Layer.HUD);
		
		setupField();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				while(true){
					View.update();
				}
			}
			
		}).start();
	}
	
	public void setupField(){
		new Fauna();
	}
}
