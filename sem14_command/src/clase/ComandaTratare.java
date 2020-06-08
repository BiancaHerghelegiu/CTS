package clase;

public class ComandaTratare implements ICommand{
	private Medic medic;
	

	public ComandaTratare(Medic medic) {
		super();
		this.medic = medic;
	}

	@Override
	public void executa(String numePacient) {
		medic.tratareImediata(numePacient);
		
	}

}
