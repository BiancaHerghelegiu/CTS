package sem13_observer.clase.chain;

import sem13_observer.clase.Pacient;

public class NotificareEmail extends NotificatorHandler{


	@Override
	public void notifica(Pacient pacient, String mesaj) {
		if(pacient.getEmail() !=null) {
			pacient.notifica("Email"+ mesaj);
		}
		else {
			super.getUrmatorulNotificator().notifica(pacient, mesaj);
		}
		
	}

}
