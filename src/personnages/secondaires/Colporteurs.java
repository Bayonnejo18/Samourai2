package personnages.secondaires;

import personnages.principaux.Commercant;

public class Colporteurs extends Commercant {

	public Colporteurs(String nom, int argent) {
		super(nom, argent);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int seFaireExtorquer() {
		int moitie = this.getArgent()/2;
		this.perdreArgent(moitie);
		this.parler("Je n'ai que " + moitie + " sous moi... hi hi hi !");
		return moitie;
	}
	
	

}
