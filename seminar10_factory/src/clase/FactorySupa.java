package clase;

public class FactorySupa {
	public ISupa creareSupa(TipSupa tipSupa) {
		switch(tipSupa) {
		case supaLegume:
			return new SupaLegume();
		case supaVita:
			return new SupaVita();
		case supaCiuperci:
			return new SupaCiuperci();
		default:
			return null;
	}
}
}

