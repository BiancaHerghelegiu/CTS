package sem13_proxy.clase;

public class Spital implements ISpital {

	@Override
	public void interneazaPacient(Pacient pacient) {
		System.out.println(pacient.getNume()+" a fost internat!");
		
	}

}
