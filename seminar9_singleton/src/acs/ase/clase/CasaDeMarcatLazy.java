package acs.ase.clase;

public class CasaDeMarcatLazy {
	
	private double suma;
	private static CasaDeMarcatLazy instanta=null;
	private CasaDeMarcatLazy() { //!!!!CONSTRUCTORUL TREBUIE SA FIE PRIVAT
		this.suma=0;
	}
	public void incaseazaNota(double suma) {
		this.suma+=suma;
	}
	public static synchronized CasaDeMarcatLazy getInstance() {
		if(instanta==null) {
			instanta=new CasaDeMarcatLazy();
		}
		return instanta;
	}
	public double getSuma() {
		return suma;
	}

}
