package clase;

import java.util.ArrayList;
import java.util.List;

public class CategorieComposite  implements IOptiune{
	private String nume;
	private List<IOptiune> lista;
	
	public CategorieComposite(String nume) {
		super();
		this.nume = nume;
		this.lista = new ArrayList<IOptiune>();
	}

	@Override
	public void stergereNod(IOptiune optiune) {
		lista.remove(optiune);
		
	}

	@Override
	public void adaugaNod(IOptiune optiune) {
		// TODO Auto-generated method stub
		lista.add(optiune);
		
	}

	@Override
	public void descriere(String identare) {
		// TODO Auto-generated method stub
		System.out.println(identare+"Categorie: "+nume);
		for(IOptiune optiune:lista) {
			optiune.descriere(identare+" ");
		}
	}

	@Override
	public IOptiune getChild(int index) {
		// TODO Auto-generated method stub
		return lista.get(index);
	}

}
