package clase;

public abstract class Angajator {

	private Angajator nextAngajator;

	public Angajator getAngajator() {
		return nextAngajator;
	}

	public void setAngajator(Angajator angajator) {
		this.nextAngajator = angajator;
	}
	
	public abstract void angajare(Candidat candidat);
	
}
