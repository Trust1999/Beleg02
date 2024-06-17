package Beleg02;

public class RadioaktiverContainer extends GefahrenstoffContainer implements RadioaktiveWarenBeladen{

	private String type = "Radioaktiver Container";
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
	public void setWare(RadioaktiveWaren waren) {
		this.inhalt = waren.getWare();
	}
	
	@Override
	public String getType() {
		return this.type  ;
	}
}
