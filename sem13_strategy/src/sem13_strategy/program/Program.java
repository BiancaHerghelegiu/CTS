package sem13_strategy.program;

import sem13_strategy.clase.Card;
import sem13_strategy.clase.Pacient;

public class Program {

	public static void main(String[] args) {
		Pacient pacient=new Pacient("Gigi");
		pacient.setModalitatePlata(new Card());
		pacient.platesteSpitalizare(1000.0);

	}

}
