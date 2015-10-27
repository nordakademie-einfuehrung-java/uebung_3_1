package uebung_3_1;

public class PQFormel_Neu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p = 2;
		double q = 200;
		
		double unterDerWurzel = ((p/2)*(p/2))-q;
		double vorDerWurzel = -1 * p / 2;
		
		double loesung1 = vorDerWurzel + Math.sqrt(unterDerWurzel);
		double loesung2 = vorDerWurzel - Math.sqrt(unterDerWurzel); 
		
	//ab hier Änderung für Aufgabe 3_1
		
			if (unterDerWurzel > 0) {
		System.out.println("x1 = " + loesung1);
		System.out.println("x2 = " + loesung2); }
			else { System.out.println("keine Lösung");}
	}

}
