package Beleg02;

public class FluessigkeitenContainer extends SpezialContainer implements Ladung{

	private String type = "Flüssigkeiten Container";
	private String[] kann = {"Wein", "Fruchtsaft", "Dünnsäure", "Natron-Wasserglas"};
	private String inhalt;

	@Override
	public String getType() {
		return this.type ;
	}

	@Override
	public String getID() {
		return "10-SF-" + id + "-FG-4";
		//return "10F-SD-" + id + "-FG-4"
	}
	
	@Override
	public void setInhalt(String w) {
		this.inhalt = w;
	}

	@Override
	public String getInhalt() {
		return this.inhalt;
	}

	@Override
	public String[] getKann() {
		return this.kann;
	}

}
