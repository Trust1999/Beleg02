package Beleg02;

public class FluessigkeitenContainer extends SpezialContainer 
				implements FluessigLebensmittelBeladen, FluessigGefahrenstoffBeladen{

	private String type = "Flüssigkeiten Container";
	private String inhalt = "Leer";

	@Override
	public String getID() {
		if(inhalt.equals("Wein") | inhalt.equals("Fruchtsaft"))
		{
			return "10-SF-" + id + "-FG-4";
		}
		return "10F-SD-" + id + "-FG-4";
	}

	@Override
	public void setWare(FluessigLebensmittel ware) {
		this.inhalt = ware.getWare();
	}

	@Override
	public String getWare() {
		return this.inhalt;
	}

	@Override
	public void setWare(FluessigGefahrenstoff ware) {
		this.inhalt = ware.getWare();		
	}

	@Override
	public String getType() {
		return this.type ;
	}
}
