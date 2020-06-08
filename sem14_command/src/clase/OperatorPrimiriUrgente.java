package clase;

import java.util.ArrayList;
import java.util.List;

public class OperatorPrimiriUrgente {
	
	List<ICommand> comenzi=new ArrayList<ICommand>();
	List<String> pacienti=new ArrayList<String>();
	
	public void invoca(ICommand comanda, String numePacient) {
		comenzi.add(comanda);
		pacienti.add(numePacient);
		
	}
	
	public void executaComenzi(int nrComenzi) {
		for(int i=0;i<nrComenzi;i++) {
			if(comenzi.size()>0) {
				comenzi.get(0).executa(pacienti.get(0));
				comenzi.remove(0);
				pacienti.remove(0);
			}
			
		}
		
	}

}
