package seminar10_Builder;

public class RezervareBuilder implements IBuilder {

	private Rezervare rezervare;
	public RezervareBuilder() {
		rezervare=new Rezervare();
	}
	@Override
	public Rezervare build() {
		return this.rezervare;
	}
	public RezervareBuilder setAsezareGeam(boolean asezareGeam) {
		this.rezervare.setAsezareGeam(asezareGeam);
		return this;
	}

	public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
		this.rezervare.setScauneErgonomice(scauneErgonomice);
		return this;
	}

	public RezervareBuilder setDecorareMasa(String decorareMasa) {
		this.rezervare.setDecorareMasa(decorareMasa);
		return this;
	}

	public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.rezervare.setMuzicaAmbientala(muzicaAmbientala);
		return this;
	}

	public RezervareBuilder setGenMuzica(String genMuzica) {
		this.rezervare.setGenMuzica(genMuzica);
		return this;
	}
}
