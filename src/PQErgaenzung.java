
public class PQErgaenzung {

	public static void main(String[] args) {
	
		double q = 2;
		double p = 2;

	
		double unterDerWurzel = ((p / 2) * (p / 2)) - q;
		
		double vorDerWurzel = -1 * p / 2;

		if (unterDerWurzel < 0) {
			System.out.println("keine Lösung: Diskriminante < 0");
		} else if (unterDerWurzel == 0) {
			System.out.println("Es gibt nur eine Lösung:");
			System.out.println(vorDerWurzel);
		} else {			
			double loesung1 = vorDerWurzel + Math.sqrt(unterDerWurzel);
			double loesung2 = vorDerWurzel - Math.sqrt(unterDerWurzel);
			System.out.println("x1 = " + loesung1);
			System.out.println("x2 = " + loesung2);
		}

	}

}
