package sem13_proxy.clase;

public class Program {

	public static void main(String[] args) {
		
		Pacient pacientAsigurat=new Pacient("Popescu", true);
		Pacient pacientNeasigurat=new Pacient("John", false);
		Spital spital=new Spital();
		spital.interneazaPacient(pacientAsigurat);
		spital.interneazaPacient(pacientNeasigurat);
		
		ProxySpital proxySpital=new ProxySpital(spital);
		proxySpital.interneazaPacient(pacientAsigurat);
		proxySpital.interneazaPacient(pacientNeasigurat);

	}

}
