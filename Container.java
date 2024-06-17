package Beleg02;

import java.util.Random;

public abstract class Container implements Abteilung {
	
	protected int id;
	public abstract String getID();
	private static int counter = 50000;
	
	public Container() {
		this.id = counter++;
	}
	
	public static Container erzeugeContainer() {
		Random zufall = new Random(); 
		
		switch(zufall.nextInt(6)) {	//6 verschiedene Unterklassen
		case 0: return new LangerContainer();
		case 1: return new KurzeContainer();
		case 2: return new KuehlContainer();
		case 3: return new FluessigkeitenContainer();
		case 4: return new RadioaktiverContainer();
		case 5: return new GasContainer();
		default: return null;
		}
	}
}
