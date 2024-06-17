package Beleg02;

public abstract class SpezialContainer extends Container {

	private String abteilung = "Spezialbau";
	
	@Override
	public String getAbteilung() {
		return this.abteilung;
	}
}
