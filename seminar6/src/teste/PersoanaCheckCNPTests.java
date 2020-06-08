package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import Exceptii.ExceptieLitereCNP;
import Exceptii.ExceptiePrimaCifra;
import Exceptii.ExceptieWrongFormat;
import clase.Persoana;
import Exceptii.ExceptieCNPNull;

public class PersoanaCheckCNPTests {

	@Test(timeout = 10)
	public void testPerformance() {
	Persoana persoana =new Persoana("Ionel","2980802675432");
	persoana.checkCNP();
	}

	@Test(expected=ExceptieWrongFormat.class)
	public void testConformance() {
		Persoana persoana =new Persoana("Ionel","29808026754321");
		persoana.checkCNP();
	}	
	
	@Test(expected=ExceptieLitereCNP.class)
	public void testCheckConformance() {
		Persoana persoana =new Persoana("Ionel","298080267543a");
		persoana.checkCNP();
	}
	
	@Test(expected=ExceptiePrimaCifra.class)
	public void testConformancePrimaCifra()
	{
		Persoana persoana =new Persoana("Ionel","0980802675431");
		persoana.checkCNP();
	}
	
	@Test
	public void testFormatCorectCNPInvalid() {
		Persoana persoana=new Persoana("Ionel","1900129321791");
		assertFalse(persoana.checkCNP());
	}
	
	@Test
	public void testFormatCorectCNPValid() {
		Persoana persoana=new Persoana("Ionel","1900129321797");
		assertTrue(persoana.checkCNP());
	}
	
	@Test(expected =ExceptieCNPNull.class)
	public void testExistence() {
		Persoana persoana=new Persoana("Bianca",null);
		persoana.checkCNP();
	}
	@Test
	public void testCardinality() {
		Persoana persoana=new Persoana("Bianca","6190303567657");
		assertEquals(persoana.getVarsta(), 1);
	}
}
