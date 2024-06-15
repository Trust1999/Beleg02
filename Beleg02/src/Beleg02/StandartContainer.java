package Beleg02;

public abstract class StandartContainer extends Container {

	private String art = "Standart Container";
	private String[] kann = {"Kisten", "Pakete", "Europaleten"};
	
	@Override
	public String getArt() {
		return this.art;
	}
	
	@Override
	public String[] getKann() {
		return this.kann;
	}
}
