public class Pq_Ergaenzung {

	public static void main(String[] args) {

		double p = 7;
		double q = 3;
		
		double unterWurzel = (p/2*p/2)-q;			
		double vorWurzel = 	-1*(p/2);
		
		if (unterWurzel<0){
			System.out.println("Es gibt keine Loesung.");
		} 	
		else{
			if (unterWurzel==0){
				System.out.println("Es gibt eine Loesung.");
			 	double loesung3 = vorWurzel +  Math.sqrt(unterWurzel);
			 	System.out.println("X1 =" + loesung3);
			}
			else{				
		
		double loesung1 = vorWurzel +  Math.sqrt(unterWurzel);
		double loesung2 = vorWurzel -  Math.sqrt(unterWurzel);
		
		System.out.println("X1 =" + loesung1);
		System.out.println("X2 =" + loesung2);
			}
		}
	}
}

