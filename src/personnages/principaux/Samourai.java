package personnages.principaux;

public class Samourai extends Ronin {
	private String seigneur;
	
	public Samourai(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() { //Redefinition
		this.parler("Bonjour ! Je m'appelle "+ getNom() + ", je sers le seigneur "+ seigneur +" et j'aime boire du "+ getBoisson());
	}
	
	public void boire(String boisson) { //Surcharge
		this.parler("Mmmm, un bon verre de "+ boisson + " ! GLOUPS !");
	}
	
	//Petite permutation
		int j = 22;
		int x = 52;
		int tmp = x;
}
