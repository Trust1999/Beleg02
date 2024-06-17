package Beleg02;

import java.util.Random;

public class StandartWare extends Waren {

	private String[] standardWaren = {"Kisten", "Pakete", "Europaletten"};
	
	@Override
	public String getWare() {
		Random zufall = new Random();
		return this.standardWaren[zufall.nextInt(standardWaren.length)] ;
	}
}
