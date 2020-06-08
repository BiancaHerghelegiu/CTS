package adapter;

public class CreditNevoi implements ICredit {

	private Integer nrLuni;
	private float sumaCreditata;
	
	
	public CreditNevoi(Integer nrLuni, float sumaCreditata) {
		super();
		this.nrLuni = nrLuni;
		this.sumaCreditata = sumaCreditata;
	}

	@Override
	public void ofertaCredit() {
		System.out.println("A fost oferit creditul");
		
	}

	@Override
	public float rataLunara() {
		return this.sumaCreditata/this.nrLuni;
	}

}
