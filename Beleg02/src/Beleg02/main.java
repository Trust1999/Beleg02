package Beleg02;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class main {
	
	static Random zufall = new Random();

	public static void main(String[] args) {
		
		int ladungsAnzahl = 40 - zufall.nextInt(11);
		List<String> ladung = new LinkedList<>();
		WarenErstellung(ladung, ladungsAnzahl);
		
		int conatainerAnzahl = 15 - zufall.nextInt(6);
		List<Abteilung> container = new LinkedList<>();
		ContainerErstellung(container, conatainerAnzahl);
		
		List<Ladung> beladeneContainer = new LinkedList<>();
		ContainerBeladen(container, beladeneContainer, ladung);	
		
		System.out.println("Container(" + conatainerAnzahl + "):");
		for(int i = 0; i < container.size(); i++) {
			 Abteilung a = container.get(i);
			 Ladung l = beladeneContainer.get(i);
			System.out.println(a.getArt() + " - " + a.getType()  + " - " + a.getID());
			System.out.println("Beladen mit: " + l.getInhalt());
			}
		
		System.out.println("Waren gesamt (" + ladungsAnzahl + ") übrige Waren(" + ladung.size() + "):");
		for(String l: ladung) {
			System.out.println(l);
		}
	}

	private static void ContainerBeladen(List<Abteilung> co, List<Ladung> bc, List<String> la) {
		for (Abteilung a : co) {
			boolean beladen = false;
	        for (int i = 0; i < la.size(); i++) {
	        	if (WelcherInhalt(a.getKann(), la.get(i))) {
	        		((Ladung) a).setInhalt(la.get(i));
	                bc.add((Ladung) a);
	                la.remove(i);
	                beladen = true;
	                break; // Exit the loop once the item is loaded
	            }
	        }
	        if (!beladen) {
	        	((Ladung) a).setInhalt("leer");
	            bc.add((Ladung) a);
	        }
	    }
	}

	private static boolean WelcherInhalt(String[] k, String l) {
	    for (String c : k) {
	    	if (c.equals(l)) {
	    		return true;
	    	}
        }
        return false; 
	}

	private static void ContainerErstellung(List<Abteilung> c, int ca) {
		for(int i = 0; i < ca; i++) {
			c.add(Container.erzeugeContainer());
		}
	}

	private static void WarenErstellung(List<String> ladung, int la) {
		String[] alleWaren = {"Kisten", "Pakete", "Europaletten", "Obst", "Gemüse",
							  "Fleich", "Wein", "Fruchtsaft", "Dünnsäure", 
							  "Natron-Wasserglas", "Uranbrenstäbe", "MOX-Kugeln", 
							  "Stickstoff", "Ethin(Acetylen)"};

		for(int i = 0; i < la ; i++) {
			ladung.add(alleWaren[zufall.nextInt(alleWaren.length)]);
		}
	}

}
