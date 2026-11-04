package personnages.secondaires;

import java.util.Random;

import personnages.Humain;

public class GrandMere extends Humain {
	private Humain [] memoire = new Humain [30];
	private static String boisson = "tisane";

	public GrandMere(String nom, int argent) {
		super(nom, argent, boisson);
		// TODO Auto-generated constructor stub
	}
	
	private String humainHasard() {
		Random random = new Random();
		int n = random.nextInt(4);
		switch (n) {
		case 0: return "Commerçant";
		case 1: return "Ronin";
		case 2: return "Samouraï";
		case 3: return "Yakuza";
		default : return "Ronin";
		}
	}
	
	public void faireConnaissanceAvec(Humain humain) {
		int i = 0;
		if (i < 30) {
			memoire[i] = humain;
			i++;
		}
		else {
			this.parler("Oh ma mémoire de vieille dame ne me permet plus de retenir autant de personnes !");
		}
	}
	
	public void ragoter() {
		for (int i= 0; i < memoire.length; i++) {
			Humain h = memoire[i];
			
			if (h instanceof Traitre) {
				this.parler("Je sais que " + h.getNom() + " est un traître !");
			}
			else {
				this.parler("Je crois " + h.getNom() + " est un " + humainHasard());
			}
		}
	}
	
	//Petite permutation
		int j = 22;
		int x = 52;
		int tmp = x;

}
