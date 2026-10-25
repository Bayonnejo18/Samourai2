package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain {
	private static String boisson = "thé";
	
	public Commercant(String nom, int argent) {
		super(nom, argent, boisson);
	}
	
	public int seFaireExtorquer() {
		this.perdreArgent(0);
		this.parler("Le monde est vraiment trop injuste !");
		return this.getArgent();
	}
	
	public void recevoir(int argent) {
		this.gagnerArgent(argent);
		this.parler("Merci !!!");
	}
	
}
