package clase;

public class Candidat {
private String nume;
private boolean competenteProgramare;
private boolean competenteTestare;
private boolean competenteManageriale;

public Candidat(String nume, boolean competenteProgramare, boolean competenteTestare, boolean competenteManageriale) {
	super();
	this.nume = nume;
	this.competenteProgramare = competenteProgramare;
	this.competenteTestare = competenteTestare;
	this.competenteManageriale = competenteManageriale;
}

public boolean isCompetenteProgramare() {
	return competenteProgramare;
}

public boolean isCompetenteTestare() {
	return competenteTestare;
}

public boolean isCompetenteManageriale() {
	return competenteManageriale;
}

public String getNume() {
	return nume;
}


}
