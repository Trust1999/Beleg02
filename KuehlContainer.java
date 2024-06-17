package Beleg02;

public class KuehlContainer extends SpezialContainer implements LebensmittelBeladen{
	
	private String type = "Kühl Container";
	private String inhalt = "Leer";

	@Override
	public String getID() {
		return "10-SF-" + id + "-FG-4";
	}

	@Override
	public String getWare() {
		return this.inhalt;
	}

	@Override
	public void setWare(Lebensmittel waren) {
		this.inhalt = waren.getWare();		
	}
	
	@Override
	public String getType() {
		return this.type  ;
	}
}
