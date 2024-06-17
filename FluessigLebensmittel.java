package Beleg02;

import java.util.Random;

public class FluessigLebensmittel extends Waren {

	private String[] standardWaren = {"Wein", "Fruchtsaft"};
		
	@Override
	public String getWare() {
		Random zufall = new Random();
			return this.standardWaren[zufall.nextInt(standardWaren.length)] ;
	}
}
