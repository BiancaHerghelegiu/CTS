package Versiunea2_Builder;

public class Rezervare {
	
	private boolean asezareGeam;
	private boolean scauneErgonomice;
	private String decorareMasa;
	private boolean muzicaAmbientala;
	private String genMuzica;
	
	public Rezervare(boolean asezareGeam, boolean scauneErgonomice, String decorareMasa, boolean muzicaAmbientala,
			String genMuzica) {
		super();
		this.asezareGeam = asezareGeam;
		this.scauneErgonomice = scauneErgonomice;
		this.decorareMasa = decorareMasa;
		this.muzicaAmbientala = muzicaAmbientala;
		this.genMuzica = genMuzica;
	}
	
	public Rezervare() {
		super();
		this.asezareGeam = false;
		this.scauneErgonomice = false;
		this.decorareMasa = "flori";
		this.muzicaAmbientala = false;
		this.genMuzica = "";
	}

	@Override
	public String toString() {
		return "Rezervare [asezareGeam=" + asezareGeam + ", scauneErgonomice=" + scauneErgonomice + ", decorareMasa="
				+ decorareMasa + ", muzicaAmbientala=" + muzicaAmbientala + ", genMuzica=" + genMuzica + "]";
	}

	public boolean isAsezareGeam() {
		return asezareGeam;
	}

	public boolean isScauneErgonomice() {
		return scauneErgonomice;
	}

	public String getDecorareMasa() {
		return decorareMasa;
	}

	public boolean isMuzicaAmbientala() {
		return muzicaAmbientala;
	}

	public String getGenMuzica() {
		return genMuzica;
	}

	public void setAsezareGeam(boolean asezareGeam) {
		this.asezareGeam = asezareGeam;
	}

	public void setScauneErgonomice(boolean scauneErgonomice) {
		this.scauneErgonomice = scauneErgonomice;
	}

	public void setDecorareMasa(String decorareMasa) {
		this.decorareMasa = decorareMasa;
	}

	public void setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
	}

	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}
	
	

}
