package clase;

public class AngajatorManager extends Angajator{

	@Override
	public void angajare(Candidat candidat) {
		if(candidat.isCompetenteManageriale()&&candidat.isCompetenteProgramare()&&candidat.isCompetenteTestare()) {
			System.out.println("Candidatul "+candidat.getNume()+" este angajat pe pozitia manager");
		}
		else {
			super.getAngajator().angajare(candidat);
		}
	}

}
