package uebung_3_1;

public class PQ_Formel {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	double p = 2;
	double q = 1;
	double unterderwurzel = (((p/2)*(p/2))-q);
	double vorderwurzel = (-p/2);
	
	if (unterderwurzel < 0 ) {
		System.out.println("Es ist keine Lösung möglich.");
		}
		else {
			double x1 = (vorderwurzel - Math.sqrt(unterderwurzel));
			double x2 = (vorderwurzel + Math.sqrt(unterderwurzel));
			
			if (x1 == x2) {
				System.out.println("Das Ergebnis ist " + x1 + ".");
			}
				else {
					System.out.println("Die Ergebnisse:");
					System.out.println("x1 = " +x1);
					System.out.println("x2 = " +x2);
			}
			
		};
	
	
	
	
}

}
