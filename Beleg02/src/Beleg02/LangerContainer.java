package Beleg02;

public class LangerContainer extends StandartContainer implements Ladung{

	private String type = "Langer Container";
	private String inhalt;

	@Override
	public String getType() {
		return this.type ;
	}

	@Override
	public String getID() {
		return "10-P-" + id + "-FG-4";
	}

	@Override
	public void setInhalt(String w) {
		this.inhalt = w;
	}

	@Override
	public String getInhalt() {
		return this.inhalt;
	}
	
	

}
