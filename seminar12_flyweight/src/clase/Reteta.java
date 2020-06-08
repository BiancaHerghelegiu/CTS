package clase;

public class Reteta {
	private int nrReteta;
	private float sumaReteta;
	private int nrMedicamente;
	@Override
	public String toString() {
		return "Reteta [nrReteta=" + nrReteta + ", sumaReteta=" + sumaReteta + ", nrMedicamente=" + nrMedicamente + "]";
	}
	public int getNrReteta() {
		return nrReteta;
	}
	public void setNrReteta(int nrReteta) {
		this.nrReteta = nrReteta;
	}
	public float getSumaReteta() {
		return sumaReteta;
	}
	public void setSumaReteta(float sumaReteta) {
		this.sumaReteta = sumaReteta;
	}
	public int getNrMedicamente() {
		return nrMedicamente;
	}
	public void setNrMedicamente(int nrMedicamente) {
		this.nrMedicamente = nrMedicamente;
	}
	public Reteta(int nrReteta, float sumaReteta, int nrMedicamente) {
		super();
		this.nrReteta = nrReteta;
		this.sumaReteta = sumaReteta;
		this.nrMedicamente = nrMedicamente;
	}
	
	
	
}

