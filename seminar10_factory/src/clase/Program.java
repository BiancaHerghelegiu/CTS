package clase;

public class Program {
	public static void afisareSupa(ISupa supa) {
		supa.descriere();
	}
	
	public static void main(String[] args) {
		FactorySupa factorySupa=new FactorySupa();
		ISupa iSupa=factorySupa.creareSupa(TipSupa.supaCiuperci);
		afisareSupa(factorySupa.creareSupa(TipSupa.supaLegume));
	}

}
