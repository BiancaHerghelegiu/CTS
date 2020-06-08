package seminar10_FactoryMethod.clase;

public class FactorySupaCiuperci implements Factory{

	@Override
	public ISupa creareSupa() {
		return new SupaCiuperci();
	}

}
