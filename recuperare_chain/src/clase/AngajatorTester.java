package clase;

public class AngajatorTester extends Angajator{

	@Override
	public void angajare(Candidat candidat) {
		if( candidat.isCompetenteTestare()) {
			System.out.println("Candidatul "+candidat.getNume()+" este angajat pe pozitia de tester");
		}
		else {
			super.getAngajator().angajare(candidat);
		}
		
	}

}
