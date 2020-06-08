package sem13_proxy.clase;

public class ProxySpital implements ISpital{

	private Spital spital;
	
	public ProxySpital(Spital spital) {
		super();
		this.spital = spital;
	}

	@Override
	public void interneazaPacient(Pacient pacient) {
		if(pacient.isEsteAsigurat()) {
			spital.interneazaPacient(pacient);
		}
		else {
			System.out.println(pacient.getNume()+" nu se poate interna!");
		}
		
	}

}
