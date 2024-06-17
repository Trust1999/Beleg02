package Beleg02;

import java.util.Random;

public class Lebensmittel extends Waren {

	private String[] standardWaren = {"Obst", "Gemüse", "Fleisch"};
	
	@Override
	public String getWare() {
		Random zufall = new Random();
		return this.standardWaren[zufall.nextInt(standardWaren.length)] ;
	}

}
