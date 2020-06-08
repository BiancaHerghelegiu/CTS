package sem13_observer.clase.chain;

import sem13_observer.clase.Pacient;

public abstract class NotificatorHandler {

	private NotificatorHandler urmatorulNotificator;

	public NotificatorHandler getUrmatorulNotificator() {
		return urmatorulNotificator;
	}

	public void setUrmatorulNotificator(NotificatorHandler urmatorulNotificator) {
		this.urmatorulNotificator = urmatorulNotificator;
	}
	
	public abstract void notifica(Pacient pacient,String mesaj);
}
