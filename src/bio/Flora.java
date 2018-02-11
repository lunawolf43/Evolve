package bio;

import java.awt.Graphics;

import gameEngine.Drawable;

public class Flora implements Drawable{
	
	int DNA[];
	int DNAstruct[];
	int weight;
	int ej_consumption;
	int ej_potential;
	int mat_ore_consum;
	
	public Flora(int fatherDNA[], int motherDNA[]){
		DNA = new int[fatherDNA.length * 2];
		
		
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}
