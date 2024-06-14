package Beleg02;

public class KurzeContainer extends StandartContainer implements Ladung{

	private String type = "Kurzer Container";
	private String inhalt;
	
	
	@Override
	public String getType() {
		return this.type;
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
