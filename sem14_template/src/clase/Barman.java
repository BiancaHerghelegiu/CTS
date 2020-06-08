package clase;

public class Barman extends TemplateRestaurant{

	@Override
	public void curataMasa(int codMasa) {
		System.out.println("Picol te rog curata masa "+codMasa);
		
	}

	@Override
	public void aseazaServetele(int codMasa) {
		System.out.println("Barmanul a asezat servetele pe masa: "+codMasa);
		
	}

	@Override
	public void aseazaTacamuri(int codMasa) {
		System.out.println("Picol te rog aseaza tacamurile pe masa: "+codMasa);
		
	}

	@Override
	public void invitaPersoanaLaMasa(int codMasa) {
		System.out.println("Barmanul a invitat persoanele la masa: "+codMasa);
		
	}

	@Override
	public void asezareTacamuri(int codMasa) {
		// TODO Auto-generated method stub
		
	}

}
