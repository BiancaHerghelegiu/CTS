package seminar11_facade;

public class Facade {
	
	public static boolean verificaPersoanaPentruCreareCont(Persoana persoana) {
		if(persoana.getVarsta()>=18) {
			if(Politie.esteUrmarita(persoana.getCNP())) {
				if(ANAF.areDatorii(persoana.getCNP())) {
					return true;
				}
			}
		}
		return false;
	}

}
