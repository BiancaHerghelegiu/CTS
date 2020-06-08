package adapter;

import adapter.framework_achizitionat.CreditLeasing;

public class AdapterCredit implements ICredit{

	private CreditLeasing creditLeasing;
	
	public AdapterCredit(CreditLeasing creditLEasing) {
		super();
		this.creditLeasing = creditLEasing;
	}

	@Override
	public void ofertaCredit() {
		
		creditLeasing.oferaLeasing();
	}

	@Override
	public float rataLunara() {
		return creditLeasing.calculSumaLunara();
	}

}
