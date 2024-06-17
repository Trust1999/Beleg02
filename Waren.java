package Beleg02;

import java.util.Random;

public abstract class Waren implements Inhalt {
	
	public static Waren erzeugeWaren() {
		
		Random zufall = new Random(); 
		
		switch(zufall.nextInt(6)) {	//6 verschiedene Unterklassen
		case 0: return new StandartWare();
		case 1: return new Lebensmittel();
		case 2: return new FluessigLebensmittel();
		case 3: return new FluessigGefahrenstoff();
		case 4: return new RadioaktiveWaren();
		case 5: return new GasWaren();
		default: return null;	
		}
	}
	
}
