package Program;

import clase.Masa;
import clase.StareOcupata;

public class Program {

	public static void main(String[] args) {
		Masa masa=new Masa(1);
		
		masa.elibereaza();
		masa.rezerva();
		masa.elibereaza();
		masa.ocupa();
		masa.elibereaza();
		
		
		
//		StareOcupata ocupata=new StareOcupata(); //nu se poate folosi pentru ca nu am facut validari in stareOcupata(schimbare stare)
//		ocupata.schimbareStare(masa);  //validarile pe care le-am facut in ocupa trebuie sa le fac in starea ocupata(clasa)

	}

}
