package clase;

public class ComandaInternare implements ICommand{

	private Medic medic;

	public ComandaInternare(Medic medic) {
		super();
		this.medic = medic;
	}

	@Override
	public void executa(String numePacient) {
		medic.internare(numePacient);
		
	}
	
	
}
