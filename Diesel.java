
public class Diesel extends Motorisation{

	public Diesel(Voiture v, float masse, float force) {
		super(v, masse, force);
	}

	public int prix() {
		return 1500+this.getVoiture().prix();
	}

	public String toString() {
		return "Diesel [prix()=" + prix() + "]";
	}
	
	
}
