package program;

import clase.Angajator;
import clase.AngajatorManager;
import clase.AngajatorProgramare;
import clase.AngajatorTester;
import clase.Candidat;
import clase.RaspunsNegativ;

public class Program {

	public static void main(String[] args) {
		Angajator angajatorManager=new AngajatorManager();
		Angajator angajatorProgramator=new AngajatorProgramare();
		Angajator angajatorTester=new AngajatorTester();
		Angajator raspunsNegativ=new RaspunsNegativ();
		
		angajatorManager.setAngajator(angajatorProgramator);
		angajatorProgramator.setAngajator(angajatorTester);
		angajatorTester.setAngajator(raspunsNegativ);
		
		Candidat candidat1=new Candidat("Popescu",true,true, true);
		Candidat candidat2=new Candidat("Itachi",false,false, false);
		Candidat candidat3=new Candidat("Sachir",false,true, true);
		Candidat candidat4=new Candidat("Dutu",false,false, true);
		
		angajatorManager.angajare(candidat1);
		angajatorManager.angajare(candidat2);
		angajatorManager.angajare(candidat3);
		angajatorManager.angajare(candidat4);

	}

}
