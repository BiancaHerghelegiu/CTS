package clase;

public class Ospatar extends TemplateRestaurant {

	@Override
	public void curataMasa(int codMasa) {
		System.out.println("Masa: "+codMasa+" este curatata");
		
	}

	@Override
	public void aseazaServetele(int codMasa) {
		System.out.println("Masa: "+codMasa+" are servetele");
		
	}

	@Override
	public void aseazaTacamuri(int codMasa) {
		System.out.println("Masa: "+codMasa+" are tacamuri");
		
	}

	@Override
	public void invitaPersoanaLaMasa(int codMasa) {
		System.out.println("La masa: "+codMasa+" au fost asezate persoane");
		
	}

	@Override
	public void asezareTacamuri(int codMasa) {
		// TODO Auto-generated method stub
		
	}

}
