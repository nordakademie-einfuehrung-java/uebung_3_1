package uebung_3_1;

public class ergaenzungPqFormel {

	public static void main(String[] args) {
		double p = 8;
		double q = 15;

		double unterDerWurzel = ((p / 2) * (p / 2)) - q;
		double vorDerWurzel = -1 * p / 2;

		if (unterDerWurzel < 0) {
			System.out.println("Es gibt keine Lösungen.");
		} else {

			double loesung1 = vorDerWurzel + Math.sqrt(unterDerWurzel);
			double loesung2 = vorDerWurzel - Math.sqrt(unterDerWurzel);

			if (unterDerWurzel == 0) {
				System.out.println("x =" + loesung1);
			} else {

				System.out.println("x1 = " + loesung1);
				System.out.println("x2 = " + loesung2);
			}
		}

	}

}
