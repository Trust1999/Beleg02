package Beleg02;

public class LangerContainer extends StandartContainer implements StandartWareBeladen{

	private String type = "Langer Container";
	private String inhalt = "Leer";

	@Override
	public String getID() {
		return "10-P-" + id + "-FG-4";
	}

	@Override
	public String getWare() {
		return this.inhalt;
	}

	@Override
	public void setWare(StandartWare waren) {
		this.inhalt = waren.getWare();
	}
	
	@Override
	public String getType() {
		return this.type  ;
	}
}
