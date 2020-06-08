package sem13_observer.clase.chain;

import sem13_observer.clase.Pacient;

public class NotificatorSms extends NotificatorHandler{

	@Override
	public void notifica(Pacient pacient, String mesaj) {
		if(pacient.getNrTelefon()!=null) {
			pacient.notifica("SMS"+ mesaj);
		}
		else {
			super.getUrmatorulNotificator().notifica(pacient, mesaj);
		}
	}

}
