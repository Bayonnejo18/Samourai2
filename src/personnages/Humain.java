package personnages;

public class Humain {
	private String nom;
	private int argent;
	private String boisson;
	
	public Humain(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}
	
	public void parler(String texte) {
		System.out.println("(<"+ this.nom +">) -" +texte);
	}
	
	public void direBonjour() {
		this.parler("Bonjour ! Je m'appelle "+ nom + " et j'aime boire du "+ boisson);
	}
	
	public void boire() {
		this.parler("Mmmm, un bon verre de "+ boisson + " ! GLOUPS !");
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public String getBoisson() {
		return boisson;
	}
	
	public void gagnerArgent(int argent) {
		this.argent += argent;
	}

	public void perdreArgent(int argent) {
		this.argent -= argent;
	}	

}
