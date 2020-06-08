package clase;

public interface IOptiune {
	void stergereNod(IOptiune optiune);
	void adaugaNod(IOptiune optiune);
	void descriere(String identare);
	IOptiune getChild(int index);
}
