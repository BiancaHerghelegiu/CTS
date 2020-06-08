package acs.ase.clase;

public class Program {

	public static void main(String[] args) {
		CasaDeMarcat casaDeMarcat=CasaDeMarcat.getInstance();
		casaDeMarcat.incaseazaNota(90);
		System.out.println(casaDeMarcat.getSuma());
		CasaDeMarcat casa=CasaDeMarcat.getInstance();
		casa.incaseazaNota(50);
		System.out.println(casa.getSuma());
		
		CasaDeMarcatLazy casaLazy=CasaDeMarcatLazy.getInstance();
		casaLazy.incaseazaNota(100);
		System.out.println("Suma "+casaLazy.getSuma());
		CasaDeMarcatLazy casaLazy2=CasaDeMarcatLazy.getInstance();
		casaLazy.incaseazaNota(70);
		System.out.println("Suma "+casaLazy2.getSuma());
		
		Manager manager1=Manager.getInstance("Ion", 9, 10);
		Manager manager2=Manager.getInstance("Pop", 12, 5);
		manager1.angajeaza();
		System.out.println(manager1.toString());
		manager2.angajeaza();
		System.out.println(manager2.toString());
	}

}
