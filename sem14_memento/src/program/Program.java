package program;

import clase.ManagerSpital;
import clase.MementoSpital;
import clase.Spital;

public class Program {

	public static void main(String[] args) {
		Spital spital=new Spital("GreenClinic", "adresa", 2);
		
		ManagerSpital manager=new ManagerSpital();
		manager.adaugareMemento(spital.creeazaMemento());
		
		spital.setNrPacienti(20);
		System.out.println(spital.toString());
		manager.adaugareMemento(spital.creeazaMemento());
		
		spital.restaurareMemento(manager.extragereMemento(0));
		
		System.out.println(spital.toString());
	}
}
