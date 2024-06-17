package Beleg02;

import java.util.Random;

public class GasWaren extends Waren {

	private String[] standardWaren = {"Stickstoff", "Ethin(Acetylen)"};
	
	@Override
	public String getWare() {
		Random zufall = new Random();
			return this.standardWaren[zufall.nextInt(standardWaren.length)] ;
	}
}
