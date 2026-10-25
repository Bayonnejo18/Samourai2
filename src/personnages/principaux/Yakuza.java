package personnages.principaux;

import personnages.Humain;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson);
		this.clan = clan;
	}

	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant commercant) {
		this.gagnerArgent(commercant.getArgent());
		commercant.seFaireExtorquer();
		this.reputation += 1;
		this.parler("Je viens d'extorquer ce pauvre commercant !");
	}
	
	public void gagnerDuel() {
		this.reputation += 1;
		this.parler("Ah ah victoire");
	}
	
	public int perdreDuel() {
		this.perdreArgent(this.getArgent());
		this.reputation -= 1;
		this.parler("Oh non je viens de perdre mon buttin !");
		return reputation;
	}
}
