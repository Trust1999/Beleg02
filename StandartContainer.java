package Beleg02;

public abstract class StandartContainer extends Container {
	
	private String abteilung = "Standardfertigung";
	
	@Override
	public String getAbteilung() {
		return this.abteilung;
	}
}
