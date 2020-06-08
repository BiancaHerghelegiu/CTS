package decorator;

public class Card implements ICard{

	@Override
	public void efectuarePlataOnline() {
		System.out.println("A fost efectuata  o plata online!");
		
	}

	@Override
	public void efectuarePlataNormala() {
		System.out.println("A fost creata o plata normala!");
		
	}

}
