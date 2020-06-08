package adapter.framework_achizitionat;

public class CreditLeasing {
	public float pretProdus;
	public int nrLuniRestituire;
	
	
	public CreditLeasing(float pretProdus, int nrLuniRestituire) {
		super();
		this.pretProdus = pretProdus;
		this.nrLuniRestituire = nrLuniRestituire;
	}


	public void oferaLeasing() {
		System.out.println("A fost achizitionat produsul la pretul de "+ pretProdus);
	}
	
	public float calculSumaLunara() {
		return this.pretProdus/this.nrLuniRestituire;
	}
}
