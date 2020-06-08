package clase;

public class Bancomat extends TemplateRetragereCard {

	public Bancomat(String nrCard) {
		super(nrCard);
	}

	@Override
	public void introducereCard() {
		System.out.println("A fost introduc cardul cu numarul: "+nrCard);
		
	}

	@Override
	public void introducerePIN(String pin) {
		System.out.println("A fost introduc PIN-ul: "+pin);
		sumaSpecificata=0;
		
	}

	@Override
	public void introducereSuma(int suma) {
			if(suma>0) {
				System.out.println("Se doreste retragerea sumei de: "+suma);
				sumaSpecificata=suma;
			}
			else {
				System.out.println("Va rugam introduceti o suma valida!");
				sumaSpecificata=0;
			}
		
	}

	@Override
	public int retragereSuma() {
		
		if(sumaSpecificata!=0) {
		System.out.println("A fost retrasa suma de "+sumaSpecificata);
		return sumaSpecificata;	
		}
		return 0;
	}

	@Override
	public void retragereCard() {
		System.out.println("A fost retras cardul cu numarul "+nrCard);
		
	}

}
