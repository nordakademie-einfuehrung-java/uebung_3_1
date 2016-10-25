package uebung_3_1;

public class ErgaenzungPQFormel {

	public static void main(String[] args) {
		double p= -1;
		double q= 15;
		
		double unterDerWurzel = ((p/2)*(p/2))-q;
		double vorDerWurzel = -1*p/2;
		
		double loesung1;
		double loesung2;
// Strg + Shfit + F --> korrigiert die Formatierung (einrücken von Zeilen...)
		
		if (unterDerWurzel < 0 ) {
			System.out.println( "Negative Wurzel, kein Ergebnis möglich");
		}
		else {
			if (unterDerWurzel == 0) {
				double loesung = vorDerWurzel + 0;
				System.out.println("x = " + loesung);
			}
			else {
				loesung1 = vorDerWurzel + Math.sqrt(unterDerWurzel);
				loesung2= vorDerWurzel - Math.sqrt(unterDerWurzel);
				System.out.println("x1 = " + loesung1);
				System.out.println("x2= " + loesung2);
			}
		}
		

	}

}
