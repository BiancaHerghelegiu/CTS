package seminar10_FactoryMethod.clase;

public class Program {

	public static void afisareSupa(Factory factory) {
		ISupa supa=factory.creareSupa();
		supa.descriere();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		afisareSupa(new FactorySupaCiuperci());
		afisareSupa(new FactorySupaLegume());
		afisareSupa(new FactorySupaPui());
	}

}
