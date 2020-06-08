package clase;

public class AngajatorProgramare extends Angajator{

	@Override
	public void angajare(Candidat candidat) {
		if(candidat.isCompetenteProgramare()&& candidat.isCompetenteTestare()) {
			System.out.println("Candidatul "+candidat.getNume()+" este angajat pe pozitia de programator");
		}
		else {
			super.getAngajator().angajare(candidat);
		}
		
	}

}
