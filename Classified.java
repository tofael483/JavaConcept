package hw4;

public class Classified {			//encapsulation
	private String superPower;
	private int wing = 00;
	private char Black;
	private char Brown;

	public String behaviour = "Adob lehaj gese";

	public String getSP() {
		return superPower;
	}

	public void setSP(String superPower) {
		this.superPower = superPower;
	}

	public int getWing() {
		return wing;
	}

	public void setWing(int wing) {
		this.wing = wing;
	}

	public char getB() {
		return Black;
	}

	public void setB(char b) {
		Black = b;
	}

	public char getBr() {
		return Brown;
	}

	public void setBr(char br) {
		Brown = br;
	}

	private void disableingSP() {						//private method cannot accessible into other class
		System.out.println("No Superpower");
	}

	public void displaySP() {							//giving an access to a private method to public
		disableingSP();
	}

}
