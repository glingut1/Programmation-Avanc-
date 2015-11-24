
public abstract class Freinage extends Voiture {
	
	private Voiture v;
	
	public Freinage(Voiture v){
		this.v = v;
	}
	
	public String getModele(){
		return this.getV().getModele();
	}
	
	public Voiture getV() {
		return v;
	}

	public void setV(Voiture v) {
		this.v = v;
	}

	public abstract int prix();
	
}
