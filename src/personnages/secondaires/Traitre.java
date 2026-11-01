package personnages.secondaires;

import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Samourai;

public class Traitre extends Samourai {
	private int traitrise = 0;
	
	public Traitre(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson, seigneur);
	}
	
	public void extorquer(Commercant commercant) {
		if (traitrise == 3) {
			this.gagnerArgent(commercant.getArgent());
			commercant.seFaireExtorquer();
			this.traitrise += 1;
			this.parler("Exorther un peu, n'est si grave que ça !");
		}
		
		else {
			this.parler("Je ne peux plus extorquer !");
		}
	}
	
	@Override
	public void direBonjour() { //Redefinition
		super.direBonjour();
		this.parler("Mon niveau niveau de traitrise est de " + this.traitrise + " !");
	}
	
	public void faireLeGentil(Humain humain,int somme) {
		this.perdreArgent(somme);
		humain.gagnerArgent(somme);
		this.parler("Tiens cette somme d'argent, c'est juste pour faire ami-ami !!!");
		int dixieme = somme/10;
		if (this.traitrise - dixieme >= 0) {
			this.traitrise -= dixieme;
		}
		
		else {
			this.traitrise = 0;
		}
	}

}
