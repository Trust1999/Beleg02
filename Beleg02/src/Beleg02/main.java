package Beleg02;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class main {
	
	static Random zufall = new Random();

	public static void main(String[] args) {
		
		int ladungsAnzahl = 40 - zufall.nextInt(11);
		String[] ladung = WarenErstellung(ladungsAnzahl);
		
		int conatainerAnzahl = 15 - zufall.nextInt(6);
		List<Abteilung> container = new LinkedList<>();
		ContainerErstellung(container, conatainerAnzahl);
		
		for(String l: ladung) {
			System.out.println(l);
		}
		
		List<Ladung> beladeneContainer = new LinkedList<>();
		ContainerBeladen(container, beladeneContainer, ladung);
		
		System.out.println("Anzahl der Container(" + conatainerAnzahl + ")");
		System.out.println("Anzahl der Waren (" + ladungsAnzahl + "), Inhalt:");
		for(String l: ladung) {
			System.out.println(l);
		}
		
		for(int i = 0; i < container.size(); i++) {
			 Abteilung a = container.get(i);
			 Ladung l = beladeneContainer.get(i);
			System.out.println(a.getArt() + " - " + a.getType()  + " - " + a.getID());
			System.out.println("Beladen mit: " + l.getInhalt());
			}
	}

	private static void ContainerBeladen(List<Abteilung> co, List<Ladung> bc, String[] la) {
		for(Abteilung a: co) { 
			for(int i = 0; i < la.length; i++) {
				if(WelcherInhalt(a.getKann(), la[i])) {
					((Ladung) a).setInhalt(la[i]);
					bc.add((Ladung) a);
					la[i] = "0";
					break;
				}
				else {
					((Ladung) a).setInhalt("leer");
					bc.add((Ladung) a);			
				}
			}
		}
	}

	private static boolean WelcherInhalt(String[] k, String l) {
	    for (String c : k) {
	    	if (c.equals(l)) {
	    		System.out.println(c +" "+l);
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

	private static String[] WarenErstellung(int la) {
		String[] alleWaren = {"Kisten", "Packete", "Europaletten", "Obst", "Gemüse",
							  "Fleich", "Wein", "Fruchtsaft", "Dünnsäure", 
							  "Natron-Wasserglas", "Uranbrenstäbe", "MOX-Kugeln", 
							  "Stickstoff", "Ethin(Acetylen)"};
		String lieferWare[] = new String[la];

		for(int i = 0; i < la ; i++) {
			lieferWare[i] = alleWaren[zufall.nextInt(alleWaren.length)];
		}
		return lieferWare;
	}

}
