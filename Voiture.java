
public abstract class Voiture {
	private String modele;
	private float masse;
	private int numero;
	
	public Voiture(){
		this.modele ="";
		this.masse = 0;
		this.numero=0;
	}
	
	public Voiture(String modele){
		this.modele = modele;
		this.masse = 0;
		this.numero=0;
	}
	
	
	public Voiture(String modele, float masse, int numero) {
		super();
		this.modele = modele;
		this.masse = masse;
		this.numero = numero;
	}

	public abstract int prix();

	
	public String toString() {
		return "Voiture [modele=" + modele + ", masse=" + masse + ", numero="
				+ numero + "]";
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public float getMasse() {
		return masse;
	}

	public void setMasse(float masse) {
		this.masse = masse;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
}