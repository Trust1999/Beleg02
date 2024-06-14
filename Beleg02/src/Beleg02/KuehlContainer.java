package Beleg02;

public class KuehlContainer extends SpezialContainer implements Ladung{

	private String type = "Kühl Container";
	private String[] kann = {"Obst", "Gemüse", "Fleich"};
	private String inhalt;
	
	@Override
	public String getType() {
		return this.type ;
	}

	@Override
	public String getID() {
		return "10-SF-" + id + "-FG-4";
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
