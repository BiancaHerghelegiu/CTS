package sem13_strategy.clase;

public class Card implements ModalitatePlata{

	@Override
	public void plateste(String numePacient, double sumaPlata) {
		System.out.println(numePacient+" a platit suma "+sumaPlata+" cu cardul!");
		
	}

}
