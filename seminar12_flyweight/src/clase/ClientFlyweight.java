package clase;

public class ClientFlyweight implements IClient {
	private int numarAsigurare;
	private String nume;

	public ClientFlyweight(int numarAsigurare, String nume) {
		super();
		this.numarAsigurare = numarAsigurare;
		this.nume = nume;
	}

	@Override
	public String toString() {
		return "ClientFlyweight [numarAsigurare=" + numarAsigurare + ", nume=" + nume + "]";
	}

	public int getNumarAsigurare() {
		return numarAsigurare;
	}

	public void setNumarAsigurare(int numarAsigurare) {
		this.numarAsigurare = numarAsigurare;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	@Override
	public void printareReteta(Reteta reteta) {
		System.out.println(this.toString()+"are urmatoare reteta"+reteta.toString());

	}

}

