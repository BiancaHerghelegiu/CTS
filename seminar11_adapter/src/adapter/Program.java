package adapter;

import adapter.framework_achizitionat.CreditLeasing;

public class Program {

	public static void descrieCredit(ICredit credit) {
		credit.ofertaCredit();
		System.out.println("rata lunara " + credit.rataLunara());
	}
	
	public static void main(String[] args) {
		CreditNevoi creditPersonal=new CreditNevoi(12, 2000);
		descrieCredit(creditPersonal);
		
		CreditLeasing creditLeasing=new CreditLeasing(1200, 6);
//		descrieCredit(creditLeasing);
		
		ICredit creditAdapter=new AdapterCredit(creditLeasing);
		descrieCredit(creditAdapter);
		
		//adapter clase
		AdapterCreditClase adapterCreditClase=new AdapterCreditClase(2000, 10);
		descrieCredit(adapterCreditClase);
	}

}
