package Versiunea2_Builder;

import seminar10_Builder.RezervareBuilder;

public class RezervareBuilderV2 implements IBuilder{
	private boolean asezareGeam;
	private boolean scauneErgonomice;
	private String decorareMasa;
	private boolean muzicaAmbientala;
	private String genMuzica;
	
	public RezervareBuilderV2() {
		this.asezareGeam = false;
		this.scauneErgonomice = false;
		this.decorareMasa = "flori";
		this.muzicaAmbientala = false;
		this.genMuzica = "";
	}
	
	@Override
	public Rezervare build() {
		return new Rezervare(asezareGeam, scauneErgonomice, decorareMasa, muzicaAmbientala, genMuzica);
	}
	
	public RezervareBuilderV2 setAsezareGeam(boolean asezareGeam) {
		this.asezareGeam=asezareGeam;
		return this;
	}

	public RezervareBuilderV2 setScauneErgonomice(boolean scauneErgonomice) {
		this.scauneErgonomice=scauneErgonomice;
		return this;
	}

	public RezervareBuilderV2 setDecorareMasa(String decorareMasa) {
		this.decorareMasa=decorareMasa;
		return this;
	}

	public RezervareBuilderV2 setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala=muzicaAmbientala;
		return this;
	}

	public RezervareBuilderV2 setGenMuzica(String genMuzica) {
		this.genMuzica=genMuzica;
		return this;
	}

}
