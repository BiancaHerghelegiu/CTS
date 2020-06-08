package program;

import clase.ComandaInternare;
import clase.ComandaTratare;
import clase.ICommand;
import clase.Medic;
import clase.OperatorPrimiriUrgente;

public class Program {

	public static void main(String[] args) {
		Medic medic1=new Medic("Medic internist");
		Medic medic2=new Medic("Medic generalist");
		
		OperatorPrimiriUrgente operator=new OperatorPrimiriUrgente();
		ICommand comanda1=new ComandaInternare(medic1);
		operator.invoca(comanda1, "Popescu");
		
		ICommand comanda2=new ComandaTratare(medic2);
		operator.invoca(comanda2, "Georgescu");
		
		operator.executaComenzi(1);
		ICommand comanda3=new ComandaTratare(medic2);
		operator.invoca(comanda3, "Ionel");

		operator.executaComenzi(3);
	}

}
