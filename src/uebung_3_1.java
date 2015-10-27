

public class uebung_3_1 {

	public static void main(String[] args) {
		double p = 4;
		double q = 4;

		double unterDerWurzel = ((p / 2) * (p / 2)) - q;
		double vorDerWurzel = -1 * p / 2;

		if (unterDerWurzel < 0) {
			System.out.println("keine Loesung");
		}

		else {
			if (unterDerWurzel > 0) {
				double loesung1 = vorDerWurzel + Math.sqrt(unterDerWurzel);
				double loesung2 = vorDerWurzel - Math.sqrt(unterDerWurzel);
				System.out.println("x1 = " + loesung1);
				System.out.println("x2 = " + loesung2);
			} else {
				System.out.println("x1 = x2 = " + vorDerWurzel);
			}
		}
	}
}
