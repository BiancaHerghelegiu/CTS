package Versiunea2_Builder;

public class Program {
	public static void main(String[] args) {
		RezervareBuilderV2 rezervareBuilderV2=new RezervareBuilderV2()
.setMuzicaAmbientala(true).setGenMuzica("rock");
		Rezervare rezervare=rezervareBuilderV2.build();
		Rezervare rezervare2=rezervareBuilderV2.build();
	}
}
