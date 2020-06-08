package clase;

public class MedicamenteFrunza implements IOptiune {
	private String nume;
	
	public MedicamenteFrunza(String nume) {
		super();
		this.nume = nume;
	}
	
	@Override
	public void stergereNod(IOptiune optiune) {
		throw new IllegalArgumentException();
		
	}

	@Override
	public void adaugaNod(IOptiune optiune) {
		throw new IllegalArgumentException();
		
	}

	@Override
	public void descriere(String identare) {
		System.out.println(identare+"Medicament: "+nume);
		
	}

	@Override
	public IOptiune getChild(int index) {
		throw new IllegalArgumentException();
	}

}

