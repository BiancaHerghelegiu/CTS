package program;

import clase.CategorieComposite;
import clase.IOptiune;
import clase.MedicamenteFrunza;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IOptiune cAntibiotice=new CategorieComposite("Antibiotice");
		IOptiune cAdulti=new CategorieComposite("Adulti");
		IOptiune cCopii=new CategorieComposite("Copii");
		
		cAntibiotice.adaugaNod(cAdulti);
		cAntibiotice.adaugaNod(cCopii);
		IOptiune mMedicament=new MedicamenteFrunza("Augumentin");
		IOptiune mMedicament2=new MedicamenteFrunza("Augumentin2");
		
		cAntibiotice.adaugaNod(mMedicament);
		cAdulti.adaugaNod(mMedicament2);
		
		//cAntibiotice.descriere("");
		
		cAntibiotice.stergereNod(mMedicament);
		cCopii.adaugaNod(mMedicament);
		//cAntibiotice.descriere("");
		
		cAntibiotice.getChild(0).adaugaNod(cAntibiotice.getChild(1).getChild(0));
		cAntibiotice.getChild(1).stergereNod(cAntibiotice.getChild(1).getChild(0));
		
		cAntibiotice.descriere("");


	}

}
