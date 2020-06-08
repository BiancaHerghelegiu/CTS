package Exceptii;

public class ExceptieLitereCNP extends IllegalArgumentException {
	String mesaj;
	
	public ExceptieLitereCNP(String mesaj) {
		super(mesaj);
	}

	public String getMesaj() {
		return mesaj;
	}
	

}
