
public class Essence extends Motorisation{

	public Essence(Voiture v, float masse, float force) {
		super(v, masse, force);
	}

	public int prix() {
		return 1000+this.getVoiture().prix();
	}

	public String toString() {
		return "Essence [prix()=" + prix() + "]";
	}
	
	
}
