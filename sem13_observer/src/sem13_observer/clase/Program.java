package sem13_observer.clase;

public class Program {

	public static void main(String[] args) {
		Pacient pacient=new Pacient("Ion");
		Pacient pacient2=new Pacient("Pop",null,"ion@gmail.com");
		Pacient pacient3=new Pacient("Gigi","0765456765",null);
		Spital spital=new Spital();
		spital.adaugaObserver(pacient);
		spital.notificare("Stati in casa!");
		spital.adaugaObserver(pacient2);
		spital.adaugaObserver(pacient3);
		spital.notificare("Totul va fi bine!");
		
	}

}
