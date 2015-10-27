public class PQFormel {
	public static void main(String[] args) {
		// Initialisierung der Werte für p und q
		double q = 1;
		double p = 2;

		// Berechnung des Terms unter der Wurzel
		double unterDerWurzel = ((p / 2) * (p / 2)) - q;
		// Berechnung des Terms vor der Wurzel
		double vorDerWurzel = -1 * p / 2;

		// Berechnung der 2 Lösungen
		double loesung1 = vorDerWurzel + Math.sqrt(unterDerWurzel);
		double loesung2 = vorDerWurzel - Math.sqrt(unterDerWurzel);

		if (unterDerWurzel<0){
			System.out.println("Es gibt keine Loesung.");
		}else{ 
		
			if(unterDerWurzel==0){
				System.out.println("Es gibt nur eine Loesung.");
			}
		// Ausgabe der Lösungen
		System.out.println("x1 = " + loesung1);
		System.out.println("x2 = " + loesung2);
		
		}
	}
}
