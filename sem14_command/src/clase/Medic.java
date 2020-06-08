package clase;

public class Medic {
	private String nume;

	public Medic(String nume) {
		super();
		this.nume = nume;
	}
	
	public void internare(String numePacient) {
		System.out.println("Medicul: "+nume +" interneaza pacientul: "+numePacient);
	}
	
	public void tratareImediata(String numePacient) {
		System.out.println("Medicul: "+nume+" trateaza imediat pacientu: "+numePacient);
	}

}
