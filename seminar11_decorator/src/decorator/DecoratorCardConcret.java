package decorator;

public class DecoratorCardConcret extends DecoratorCardAbstract{

	public DecoratorCardConcret(ICard cardAbstract) {
		super(cardAbstract);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void efectuarePlataContactless() {
		// TODO Auto-generated method stub
		System.out.println("S-a efectuat o plata contactless!");
	}

}
