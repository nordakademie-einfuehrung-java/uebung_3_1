public class PQFormel {

	public static void main(String[] args) {
		double p = 0;
		double q = 0;

		double udw = ((p * p / 4) - q);
		double vdw = -1 * p / 2;
		if (udw < 0) {
			System.out.println("keine Loesung");
		} else {
			if (udw == 0) {
				double loesung1 = vdw + Math.sqrt(udw);
				System.out.println("x1= x2 = " + loesung1);
			} else {
				double loesung1 = vdw + Math.sqrt(udw);
				double loesung2 = vdw - Math.sqrt(udw);
				System.out.println("x1= " + loesung1);
				System.out.println("x2= " + loesung2);
			}

		}
	}
}
