package seminar10_Builder;

public class Program {
	
	public static void main(String[] args) {
		Rezervare rezervare=new Rezervare();
		rezervare.setMuzicaAmbientala(true);
		rezervare.setGenMuzica("pop");
		 System.out.println(rezervare.toString()); 
		 
		 RezervareBuilder rezervareBuilder=new RezervareBuilder().setMuzicaAmbientala(true).setGenMuzica("pop");
		 Rezervare rezervare2=rezervareBuilder.build();
		 System.out.println(rezervare2.toString());
		 
		 Rezervare rezervareBuild=new RezervareBuilder().setMuzicaAmbientala(true).setGenMuzica("rock").build();
		 System.out.println(rezervareBuild.toString());
	}
	
	

}
