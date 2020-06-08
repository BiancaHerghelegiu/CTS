package sem13_proxy.clase;

public class Pacient {
private String nume;
private boolean esteAsigurat;
public Pacient(String nume, boolean esteAsigurat) {
	super();
	this.nume = nume;
	this.esteAsigurat = esteAsigurat;
}
public String getNume() {
	return nume;
}
public void setNume(String nume) {
	this.nume = nume;
}
public boolean isEsteAsigurat() {
	return esteAsigurat;
}
public void setEsteAsigurat(boolean esteAsigurat) {
	this.esteAsigurat = esteAsigurat;
}

}
