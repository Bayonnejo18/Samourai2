package histoires;

import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Ronin;
import personnages.principaux.Yakuza;

public class MonHistoire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Humain humain = new Humain("Prof", 10, "Porto");
		humain.direBonjour();
		humain.boire();
		Commercant commercant = new Commercant("Marchand", 35);
		commercant.direBonjour();
		Yakuza yakusa = new Yakuza("Yaku␣le␣noir", 42, "biere", "WarSong");
		yakusa.direBonjour();
		yakusa.extorquer(commercant);
		Ronin ronin = new Ronin("Roro", 61, "sake");
		ronin.donnerArgent(10, commercant );
		ronin.provoquerDuel(yakusa);
		ronin.direBonjour();

	}

}
