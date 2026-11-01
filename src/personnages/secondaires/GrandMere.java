package personnages.secondaires;

import java.util.Random;

import personnages.Humain;

public class GrandMere extends Humain {
	private Humain [] memoire = new Humain [30];
	private static String boisson = "tisane";
	private Random random = new Random();
	private int nbConnaissances = 0;

	public GrandMere(String nom, int argent) {
		super(nom, argent, boisson);
		// TODO Auto-generated constructor stub
	}
	
	private String humainHasard() {
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
		if (nbConnaissances < 30) {
			memoire[nbConnaissances] = humain;
			nbConnaissances++;
		}
		else {
			this.parler("Oh ma mémoire de vieille dame ne me permet plus de retenir autant de personnes !");
		}
	}
	
	public void ragoter() {
		for (int i= 0; i < nbConnaissances; i++) {
			Humain h = memoire[i];
			
			if (h instanceof Traitre) {
				this.parler("Je sais que " + h.getNom() + " est un traître !");
			}
			else {
				this.parler("Je crois " + h.getNom() + " est un " + humainHasard());
			}
		}
	}

}
