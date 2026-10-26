package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson); 
	}
	
	public void donnerArgent(int argent, Commercant commercant) {
		
		commercant.gagnerArgent(argent);
		this.perdreArgent(argent);
	}
	
	public void provoquerDuel(Yakuza yakuza) {
		if (2*honneur > yakuza.getReputation()) {
			this.gagnerArgent(yakuza.getArgent());
			yakuza.perdreDuel();
			this.honneur += 1;
			this.parler("La justice finit toujours par triompher !");
		}
		
		else {
			yakuza.gagnerDuel();
			this.honneur -= 1;
			this.parler("Oh non, j'y étais presque !");
		}
	}
	
	

}
