package Exceptii;

public class ExceptieWrongFormat extends IllegalArgumentException {
	public String mesaj;

	public ExceptieWrongFormat(String mesaj) {
		this.mesaj=mesaj;
	}

	public String getMesaj() {
		return mesaj;
	}
	
}
