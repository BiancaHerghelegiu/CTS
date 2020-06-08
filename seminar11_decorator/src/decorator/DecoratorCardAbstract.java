package decorator;

public abstract class DecoratorCardAbstract implements ICard {
	
	ICard cardAbstract=null;
	
	@Override
	public void efectuarePlataOnline() {
		cardAbstract.efectuarePlataOnline();
		
	}

	@Override
	public void efectuarePlataNormala() {
		cardAbstract.efectuarePlataNormala();
		
	}
	
	

	public DecoratorCardAbstract(ICard cardAbstract) {
		super();
		this.cardAbstract = cardAbstract;
	}
	
	public abstract void efectuarePlataContactless();
	
	
}
