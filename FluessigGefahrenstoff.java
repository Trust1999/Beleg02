package Beleg02;

import java.util.Random;

public class FluessigGefahrenstoff extends Waren {

	private String[] standardWaren = {"Dünnsäure", "Natron-Wasserglas"};
	
	@Override
	public String getWare() {
		Random zufall = new Random();
			return this.standardWaren[zufall.nextInt(standardWaren.length)] ;
	}

}
