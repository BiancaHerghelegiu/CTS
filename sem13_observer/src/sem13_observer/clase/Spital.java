package sem13_observer.clase;

import java.util.ArrayList;
import java.util.List;

import sem13_observer.clase.chain.NotificareEmail;
import sem13_observer.clase.chain.NotificatorHandler;
import sem13_observer.clase.chain.NotificatorManager;
import sem13_observer.clase.chain.NotificatorSms;

public class Spital implements Notificator{

	private List<Observer> observeri;
	
	
	
	public Spital() {
		super();
		this.observeri = new ArrayList<Observer>();
	}

	@Override
	public void adaugaObserver(Observer observer) {
		observeri.add(observer);
		
	}

	@Override
	public void stergeObserver(Observer observer) {
		observeri.remove(observer);
		
	}

	@Override
	public Observer getObserver(int index) {
		return observeri.get(index);
	}

	@Override
	public void notificare(String mesaj) {
		NotificatorHandler notificatorSms= new NotificatorSms();
		NotificatorHandler notificatorEmail=new NotificareEmail();
		NotificatorHandler notificatorManager=new NotificatorManager();
		notificatorSms.setUrmatorulNotificator(notificatorEmail);
		notificatorEmail.setUrmatorulNotificator(notificatorManager);
		
		for(Observer observer:observeri) {
		notificatorSms.notifica((Pacient)observer, mesaj);
		}
		
	}

}
