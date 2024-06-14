package Beleg02;

public class RadioaktiverContainer extends GefahrenstoffContainer implements Ladung{

	private String type = "Radioaktiver Container";
	private String[] kann = {"Uranbrenstäbe", "MOX-Kugeln"};
	private String inhalt;

	@Override
	public String getType() {
		return this.type ;
	}

	@Override
	public String getID() {
		return "10-D-" + id + "-FG-4";
	}
	
	@Override
	public void setInhalt(String w) {
		this.inhalt = w;
	}

	@Override
	public String getInhalt() {
		return this.inhalt;
	}

	@Override
	public String[] getKann() {
		return this.kann;
	}

}
