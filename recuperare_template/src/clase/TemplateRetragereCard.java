package clase;

public abstract class TemplateRetragereCard {
	
	protected String nrCard;
	protected int sumaSpecificata; //cat cere clientul de la bancomat

	public TemplateRetragereCard(String nrCard) {
		super();
		this.nrCard = nrCard;
	}
	
	public abstract void introducereCard();
	public abstract void introducerePIN(String pin);
	public abstract void introducereSuma(int suma);
	public abstract int retragereSuma();
	public abstract void retragereCard();
	
	public final int retragereBani(String pin, int suma) {
		int sumaRetrasa;
		introducereCard();
		introducerePIN(pin);
		introducereSuma(suma);
		sumaRetrasa=retragereSuma();
		retragereCard();
		
		return sumaRetrasa;
	}
	
	

}
