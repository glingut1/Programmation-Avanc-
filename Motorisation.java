
public abstract class Motorisation extends Voiture {

	private float masse;
	private float force;
	private Voiture v;
	
	public Motorisation (Voiture v, float masse, float force){
		super();
		this.masse=masse;
		this.force=force;
		this.v=v;
	}
	
	

	public float getMasseMotVoit() {
		return this.masse+this.getVoiture().getMasse();
	}
	
	public float getMasse() {
		return masse;
	}



	public void setMasse(float masse) {
		this.masse = masse;
	}

	

	public float getForce() {
		return force;
	}



	public void setForce(float force) {
		this.force = force;
	}



	public Voiture getVoiture() {
		return v;
	}



	public void setV(Voiture v) {
		this.v = v;
	}



	public float acceleration(){
		return (this.force/this.masse);
	}
	
	public float distanceParcourue(int t){
		return ((0.5f*this.acceleration())+(t*t));
	}
	
	public abstract int prix();

	
	
}
