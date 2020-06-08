package seminar10_FactoryMethod.clase;

public class FactorySupaPui implements Factory {

	@Override
	public ISupa creareSupa() {
		return new SupaPui();
	}

}
