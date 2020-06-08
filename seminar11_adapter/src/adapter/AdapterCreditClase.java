package adapter;

import adapter.framework_achizitionat.CreditLeasing;

public class AdapterCreditClase extends CreditLeasing implements ICredit {

	public AdapterCreditClase(float pretProdus, int nrLuniRestituire) {
		super(pretProdus, nrLuniRestituire);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ofertaCredit() {
		super.oferaLeasing();
		
	}

	@Override
	public float rataLunara() {
		// TODO Auto-generated method stub
		return super.calculSumaLunara();
	}

}
