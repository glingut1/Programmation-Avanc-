
public class Abs extends Freinage{

	public Abs(Voiture v) {
		super(v);
	}

	public int prix(){
		return 2000+this.getV().prix();
	}
	
	public String getModele(){
		return this.getV().getModele();
	}

	public String toString() {
		return "Abs [prix()=" + prix() + ", getModele()=" + getModele() + "]";
	}
	
}