
public class FreinageMagetique extends Freinage{

	public FreinageMagetique(Voiture v) {
		super(v);
	}

	public int prix(){
		return 2000+this.getV().prix();
	}
	
	public String getModele(){
		return this.getV().getModele();
	}

	public String toString() {
		return "FreinageMagetique [prix()=" + prix() + ", getModele()="
				+ getModele() + "]";
	}
	
	
	
}
