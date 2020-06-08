package sem13_observer.clase;

public interface Notificator {
	public void adaugaObserver(Observer observer);
	public void stergeObserver(Observer observer);
	public Observer getObserver(int index);
	public void notificare(String mesaj);

}
