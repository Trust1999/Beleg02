package Beleg02;


public class GasContainer extends GefahrenstoffContainer implements GasWarenBeladen{

	private String type = "Gas Container";
	private String inhalt = "Leer";
	
	@Override
	public String getID() {
		return "10-D-" + id + "-FG-4";
	}

	@Override
	public String getWare() {
		return this.inhalt;
	}

	@Override
	public void setWare(GasWaren waren) {
		this.inhalt = waren.getWare();
	}
	
	@Override
	public String getType() {
		return this.type  ;
	}
}
