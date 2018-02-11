package main;

import javax.swing.JFrame;

import bio.Creature;
import gameEngine.GameEngine;
import gameEngine.GameView;


public class Main extends JFrame{
//champagne! we did it!
	
	public static void main(String[] args){
		new Main();
	}
	
	public Main(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize( 1536, 1024);
		setTitle("EVOLVE");
		GameEngine engine = new GameEngine(new GameViewSwing());
		add((GameViewSwing)engine.View);
		setVisible(true);
		
		engine.View.addDrawable(new Creature(), GameView.Layer.ANIMAL);
	}
	
}
