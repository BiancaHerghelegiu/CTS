package sem13_strategy.clase;

public class Pacient {
private String name;
private ModalitatePlata modalitatePlata;

public void setModalitatePlata(ModalitatePlata modalitatePlata) {
	this.modalitatePlata = modalitatePlata;
}

public Pacient(String name) {
	super();
	this.name = name;
}

public void platesteSpitalizare(double suma) {
	modalitatePlata.plateste(name, suma);
}

}
