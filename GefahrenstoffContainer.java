package Beleg02;

public abstract class GefahrenstoffContainer extends Container {
	
	private String abteilung = "Gefahrstoffbau";
	
	@Override
	public String getAbteilung() {
		return this.abteilung;
	}
}
