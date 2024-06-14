package Beleg02;

public abstract class GefahrenstoffContainer extends Container {
//public  class GefahrenstoffContainer extends Container {	
	
	private String art = "Gefahrenstoff Container";
	
	@Override
	public String getArt() {
		return this.art;
	}
}
