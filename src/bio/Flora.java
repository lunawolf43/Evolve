package bio;

import java.awt.Graphics;

import gameEngine.Drawable;

public class Flora implements Drawable{
	
	int DNA[];
	int DNAstruct[];
	int weight = 0;
	int ej_consumption = 0;
	int ej_potential = 0;
	int mat_ore_consum[];
	int age = 0;
	
	public Flora(int fatherDNA[], int motherDNA[]){
		DNA = new int[fatherDNA.length * 2];
		
		//copy the DNA alternating between mother and father DNA
		//DNA is genderless, the use of mother and father is only to discriminate between parents.
		//most plants have both male and female parts so... whatever
		int j = 0;
		for(int i = 0; i < DNA.length; i ++) {
			DNA[i]= fatherDNA[j];
			i += 1;
			DNA[i] = motherDNA[j];
			j+=1;
		}
		
		//use DNA to determine the characteristics of the plant:
		for (int i = 0; i < DNA.length%14; i++) {
			//variables for the individual chunk of DNA
			int type;
			int children;
			children = 0;
			int structure[];
			structure = new int[6];
			int colora;
			int colorb;
			int size;
			size = 0;
			
			for (j = 0; j < 14; j++){
				
				//type section
				if (j==0 || j == 1){
					type = DNA[i*14+j];
				}
				
				//children section
				if (j == 2 || j == 3){
					children = DNA[i*14+j];
				}
				
				//cell structure section
				if (j > 3 && j < 10){
					structure[j] = DNA[i*14+j];
				}
				
				//size section
				if (j == 10 || j ==11){
					size += DNA[i*14+j];
				}
				
				//coloration
				if(j > 11){
					if (j == 12){
						colora = DNA[i*14+j];
					}
					if (j == 13){
						colorb = DNA[i*14+j];
					}
				}
				
			}
			
			//calculate amounts based on this piece's characteristics
			int lweight=0;
			int lpot=0;
			int lcons=0;
			int lstrength=0;
			int lgen=0;
			int lret=0;
			for ( j = 0; j < 6; j++){
				//storage type
				if (j == 0){
					lweight += 10;
					lpot += 10;
					lcons += 2;
					lstrength += 8;
				}
				//structural type
				if (j==1){
					lweight += 5;
					lpot += 1;
					lcons += 3;
					lstrength += 10;
				}
				//generator type
				if (j == 2){
					lweight += 1;
					lpot += 1;
					lcons += 1;
					lstrength += 1;
					lgen +=5;
				}
				//retrieval type
				if (j == 3){
					lweight += 1;
					lpot += 1;
					lcons += 1;
					lstrength += 1;
					lret+=5;
				}
			}
			
			//calculate local values:
			lweight *= size;
			lpot *= size;
			lcons *= size;
			lstrength *= size;
			lgen*= size;
			lret *= size;
			
		}
		
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}
