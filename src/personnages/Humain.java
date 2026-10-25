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
		System.out.println("Bonjour ! Je m'appelle "+ this.nom + " et j'aime boire du "+ this.boisson);
	}
	
	public void boire() {
		System.out.println("Mmmm, un bon verre de "+ this.boisson + " ! GLOUPS !");
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
