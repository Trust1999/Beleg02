package Beleg02;

import java.util.Random;

public class RadioaktiveWaren extends Waren {

	private String[] standardWaren = {"Uranbrennstäbe", "MOX-Kugeln"};
	
	@Override
	public String getWare() {
		Random zufall = new Random();
		return this.standardWaren[zufall.nextInt(standardWaren.length)] ;
	}
}
