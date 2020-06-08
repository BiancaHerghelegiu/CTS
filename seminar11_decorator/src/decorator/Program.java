package decorator;

public class Program {

	public static void main(String[] args) {
		Card card=new Card();
		card.efectuarePlataNormala();
		card.efectuarePlataOnline();
		
		DecoratorCardAbstract card1=new DecoratorCardConcret(card);
		card1.efectuarePlataNormala();
		card1.efectuarePlataOnline();
		card1.efectuarePlataContactless();
		

	}

}
