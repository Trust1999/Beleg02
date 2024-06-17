package Beleg02;

public class KurzeContainer extends StandartContainer implements StandartWareBeladen{

	private String type = "Kurzer Container";
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
