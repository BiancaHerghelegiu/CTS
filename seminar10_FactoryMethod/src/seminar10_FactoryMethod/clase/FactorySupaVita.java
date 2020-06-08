package seminar10_FactoryMethod.clase;

public class FactorySupaVita implements Factory {

	@Override
	public ISupa creareSupa() {
		return new SupaVita();
	}

}
