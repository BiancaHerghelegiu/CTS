package clase;

public abstract class TemplateRestaurant {
	
	public abstract void curataMasa(int codMasa);
	public abstract void aseazaServetele(int codMasa);
	public abstract void aseazaTacamuri(int codMasa);
	public abstract void invitaPersoanaLaMasa(int codMasa);
	public abstract void asezareTacamuri(int codMasa);
	
	public final void asezarePersoanaLaMasa(int codMasa) {
		curataMasa(codMasa);
		aseazaServetele(codMasa);
		aseazaTacamuri(codMasa);
		invitaPersoanaLaMasa(codMasa);
	}

}
