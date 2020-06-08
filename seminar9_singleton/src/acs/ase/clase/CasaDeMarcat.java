package acs.ase.clase;

public class CasaDeMarcat {
	
	private double suma;
	private static CasaDeMarcat instanta=new CasaDeMarcat();//Eager initialization
	private CasaDeMarcat() { //!!!!CONSTRUCTORUL TREBUIE SA FIE PRIVAT
		super();
		this.suma=0;
	}
	public void incaseazaNota(double suma) {
		this.suma+=suma;
	}
	public static CasaDeMarcat getInstance() {
		return instanta;
	}
	public double getSuma() {
		return suma;
	}
	

}
