package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.PachetTuristic;
import clase.Persoana;
import teste.categorii.CategorieTestePacheteTuristiceIeftine;
import teste.categorii.CategorieTestePacheteTuristiceScumpe;
import teste.categorii.CategorieTestePersoaneMajore;
import teste.categorii.CategorieTestePersoaneMinore;
import teste.categorii.CategorieTestePersoaneTinere;
import teste.categorii.CategorieTestePersoaneVarstnice;
import teste.dubluri.PersoanaFake;
import teste.dubluri.PersoanaStub;

public class PachetTuristicTests {

	@Test
	@Category(CategorieTestePersoaneVarstnice.class)
	public void testAplicaDiscount() {
		PersoanaStub persoana=new PersoanaStub();
		PachetTuristic pachet=new PachetTuristic(persoana, "Bahamas", 2000.0);
		pachet.aplicaDiscountVarstnici(10);
		assertEquals(1800.0, pachet.getPret(),0.01);
	}
	
	@Test
	@Category(CategorieTestePersoaneVarstnice.class)
	public void testDiscountPersoanaInvarsta() {
		PersoanaFake persoana=new PersoanaFake();
		persoana.setVarsta(80);
		PachetTuristic pachet=new PachetTuristic(persoana, "Bahamas", 2000.0);
		pachet.aplicaDiscountVarstnici(10);
		assertEquals(1800.0, pachet.getPret(),0.01);
	}
	
	@Test
	@Category(CategorieTestePersoaneTinere.class)
	public void testDiscountPersoanaTanara() {
		PersoanaFake persoana=new PersoanaFake();
		persoana.setVarsta(40);
		PachetTuristic pachet=new PachetTuristic(persoana, "Bahamas", 2000.0);
		pachet.aplicaDiscountVarstnici(10);
		assertEquals(2000.0, pachet.getPret(),0.01);
	}
	
	@Test
	public void testOrderingPretPachete() {
		PersoanaFake pers=new PersoanaFake();
		PersoanaFake pers2=new PersoanaFake();
		pers.setVarsta(20);
		pers2.setVarsta(22);
		PachetTuristic pachet1=new PachetTuristic(pers, "Bahamas", 1000.0);
		PachetTuristic pachet2=new PachetTuristic(pers2, "Bahamas", 2000.0);
		pachet1.aplicaDiscountVarstnici(10);
		pachet2.aplicaDiscountVarstnici(15);
		assertTrue(pachet1.getPret()<pachet2.getPret());
	}
	@Test
	@Category({CategorieTestePersoaneMinore.class,CategorieTestePacheteTuristiceIeftine.class})
	public void testPoateRezervaPersoaneMinore() {
		PersoanaFake persoana=new PersoanaFake();
		persoana.setVarsta(17);
		PachetTuristic pachet=new PachetTuristic(persoana, "Barlad", 100.0);
		assertFalse(pachet.poateRezerva());
	}
	
	@Test
	@Category({CategorieTestePersoaneMajore.class,CategorieTestePacheteTuristiceIeftine.class})
	public void testPoateRezervaPersoaneMajore() {
		PersoanaFake persoana=new PersoanaFake();
		persoana.setVarsta(22);
		PachetTuristic pachet=new PachetTuristic(persoana, "Barlad", 100.0);
		assertTrue(pachet.poateRezerva());
	}
	
	@Test(timeout =100)
	@Category(CategorieTestePersoaneMajore.class)
	public void testPerformancePoateRezerva() {
		PersoanaFake persoana=new PersoanaFake();
		persoana.setVarsta(20);
		PachetTuristic pachet=new PachetTuristic(persoana, "Barlad", 100.0);
		pachet.poateRezerva();
	}
	@Test
	@Category({CategorieTestePersoaneMinore.class,CategorieTestePacheteTuristiceScumpe.class})
	public void testGetClient() {
		PersoanaFake persoana=new PersoanaFake();
		PersoanaFake persoanaNou=new PersoanaFake();
		persoana.setVarsta(12);
		persoanaNou.setVarsta(16);
		PachetTuristic pachet=new PachetTuristic(persoana,"Bucuresti",1000.0);
		pachet.setClient(persoanaNou);
		assertEquals(persoanaNou, pachet.getClient());
	}

	@Test
	@Category({CategorieTestePersoaneMinore.class,CategorieTestePacheteTuristiceScumpe.class})
	public void testGetDestinatie() {
		PersoanaFake persoana=new PersoanaFake();
		persoana.setVarsta(12);
		PachetTuristic pachet=new PachetTuristic(persoana,"Bucuresti",1000.0);
		pachet.setDestinatie("Brasov");
		assertEquals("Brasov", pachet.getDestinatie());
	}
	
	@Test
	@Category({CategorieTestePacheteTuristiceScumpe.class})
	public void testSetPret() {
		PersoanaFake persoana=new PersoanaFake();
		persoana.setVarsta(12);
		PachetTuristic pachet=new PachetTuristic(persoana,"Bucuresti",1000.0);
		pachet.setPret(2000.0);
		assertEquals(2000.0, pachet.getPret(),0.01);
	}
}
