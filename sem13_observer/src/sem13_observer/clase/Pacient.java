package sem13_observer.clase;

public class Pacient implements Observer {

	private String numePacient;
	private String nrTelefon;
	private String email;
	
	public Pacient(String numePacient) {
		super();
		this.numePacient = numePacient;
		nrTelefon=null;
		email=null;
	}

	public Pacient(String numePacient, String nrTelefon, String email) {
		super();
		this.numePacient = numePacient;
		this.nrTelefon = nrTelefon;
		this.email = email;
	}

	@Override
	public void notifica(String mesaj) {
		System.out.println(numePacient+" ai primite mesajul: "+mesaj);
		
	}

	@Override
	public String getNume() {
		return numePacient;
	}

	@Override
	public String getNrTelefon() {
		return nrTelefon;
	}

	@Override
	public String getEmail() {
		return email;
	}

}
