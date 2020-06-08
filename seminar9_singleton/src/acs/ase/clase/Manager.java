package acs.ase.clase;

public class Manager {
	
	private String nume;
	private int nrAngajati;
	private int aniExperienta;
	private static Manager instanta=null;
	
	private Manager(String nume, int nrAngajati, int aniExperienta) {
		super();
		this.nume = nume;
		this.nrAngajati = nrAngajati;
		this.aniExperienta = aniExperienta;
	}
	
	public static synchronized Manager getInstance(String nume, int nrAngajati, int aniExperienta)
	{
		if(instanta==null) {
			instanta=new Manager(nume,nrAngajati,aniExperienta);
		}
		return instanta;
	}
	
	public void angajeaza() {
		this.nrAngajati++;
	}

	@Override
	public String toString() {
		return "Manager [nume=" + nume + ", nrAngajati=" + nrAngajati + ", aniExperienta=" + aniExperienta + "]";
	}	

	
}
