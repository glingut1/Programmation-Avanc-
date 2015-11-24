
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Voiture ferr = new Ferrari("Ferrari 458 Spider",1,2);
		Voiture por = new Porshe("Porshe 911 S",2,1);
		Motorisation ferr2 = new Essence(ferr, 1.5f,2f);
		Motorisation por2 = new Diesel(por, 2f,3f);
		
		System.out.println(ferr2);
		System.out.println(por2);
		System.out.println(por2.getMasse());
		
	}

}
