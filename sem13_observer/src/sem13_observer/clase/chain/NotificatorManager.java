package sem13_observer.clase.chain;

import sem13_observer.clase.Pacient;

public class NotificatorManager extends NotificatorHandler{

	@Override
	public void notifica(Pacient pacient, String mesaj) {
		System.out.println("Dl Manager "+pacient.getNume()+" nu a putut fi contactat!");
		
	}

}
