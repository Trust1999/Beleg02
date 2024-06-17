package Beleg02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main {
	
	static Random zufall = new Random();

	public static <T> void main(String[] args) {
				
		int ladungsAnzahl = 40 - zufall.nextInt(11);
		List<Inhalt> ladung = new ArrayList<>(ladungsAnzahl);
		WarenErstellung(ladung, ladungsAnzahl);
		
		int conatainerAnzahl = 15 - zufall.nextInt(6);
		List<Abteilung> container = new ArrayList<>(conatainerAnzahl);
		ContainerErstellung(container, conatainerAnzahl);

		
		List<Beladen> beladeneContainer = new ArrayList<>(conatainerAnzahl);
		ContainerBeladen(beladeneContainer ,container, ladung);	
		
		AusgabeCintainer(beladeneContainer,container, conatainerAnzahl);
		AusgabeWaren(ladung, ladungsAnzahl);
	}
	
	private static void AusgabeWaren(List<Inhalt> l, int la) {
		System.out.println("Waren gesamt (" + la + ") übrige Waren(" + l.size() + "):");
		for(Inhalt w: l) {
			System.out.println(w.getWare());
		}
	}

	private static void AusgabeCintainer(List<Beladen> bc, List<Abteilung> c, int ca) {
		System.out.println("Container(" + ca + "):");
		for(int i = 0; i < c.size(); i++) {
			Abteilung a = c.get(i);
			Beladen b = bc.get(i);
			System.out.println("Hergestellt von " + a.getAbteilung() + " Type: " + a.getType() +
							   " SN: " + a.getID() + " Ist beladen mit:");
			System.out.println(b.getWare());
		}
	}

	/*private static void ContainerBeladen(List<Beladen> bc, List<Abteilung> co, List<Inhalt> la) {
		for(Abteilung a: co)	{
			for(int i = 0; i < la.size(); i++) {
				try {
					((StandartWareBeladen) a).setWare((StandartWare) la.get(i));
					la.remove(i);
					i = la.size();
				}
				catch(Exception e) {}
				try {
					((LebensmittelBeladen) a).setWare((Lebensmittel) la.get(i));
					la.remove(i);
					la.size();
				}
				catch(Exception e) {}
				try {
					((FluessigLebensmittelBeladen) a).setWare((FluessigLebensmittel) la.get(i));
					la.remove(i);
					la.size();
				}
				catch(Exception e) {}
				try {
					((FluessigGefahrenstoffBeladen) a).setWare((FluessigGefahrenstoff) la.get(i));
					la.remove(i);
					la.size();
				}
				catch(Exception e) {}
				try {
					((GasWarenBeladen) a).setWare((GasWaren) la.get(i));
					la.remove(i);
					la.size();
				}
				catch(Exception e) {}
				try {
					((RadioaktiveWarenBeladen) a).setWare((RadioaktiveWaren) la.get(i));
					la.remove(i);
					la.size();
				}
				catch(Exception e) {}
				bc.add((Beladen) a);
			}
		}	
	}*/

	private static void ContainerBeladen(List<Beladen> bc, List<Abteilung> co, List<Inhalt> la) {
	    for (Abteilung a : co) {
	        for (int i = 0; i < la.size(); i++) {
	        	Inhalt l = la.get(i);
	            boolean beladen = false;

	            if (a instanceof StandartWareBeladen && l instanceof StandartWare) {
	                ((StandartWareBeladen) a).setWare((StandartWare) l);
	                beladen = true;
	            } else if (a instanceof LebensmittelBeladen && l instanceof Lebensmittel) {
	                ((LebensmittelBeladen) a).setWare((Lebensmittel) l);
	                beladen = true;
	            } else if (a instanceof FluessigLebensmittelBeladen && l instanceof FluessigLebensmittel) {
	                ((FluessigLebensmittelBeladen) a).setWare((FluessigLebensmittel) l);
	                beladen = true;
	            } else if (a instanceof FluessigGefahrenstoffBeladen && l instanceof FluessigGefahrenstoff) {
	                ((FluessigGefahrenstoffBeladen) a).setWare((FluessigGefahrenstoff) l);
	                beladen = true;
	            } else if (a instanceof GasWarenBeladen && l instanceof GasWaren) {
	                ((GasWarenBeladen) a).setWare((GasWaren) l);
	                beladen = true;
	            } else if (a instanceof RadioaktiveWarenBeladen && l instanceof RadioaktiveWaren) {
	                ((RadioaktiveWarenBeladen) a).setWare((RadioaktiveWaren) l);
	                beladen = true;
	            }

	            if (beladen) {
	                la.remove(i);
	                break;
	            }
	        }   
	        bc.add((Beladen) a);
	    }
	}
	
	private static void ContainerErstellung(List<Abteilung> c, int ca) {
		for(int i = 0; i < ca; i++) {
			c.add(Container.erzeugeContainer());
		}
	}
	

	private static void WarenErstellung(List<Inhalt> ladung, int la) {
		for(int i = 0; i < la ; i++) {
			ladung.add(Waren.erzeugeWaren());
		}
	}

}
