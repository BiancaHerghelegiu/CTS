package seminar10_FactoryMethod.clase;

public class FactorySupaLegume implements Factory{

	@Override
	public ISupa creareSupa() {
		return new SupaLegume();
	}

}
