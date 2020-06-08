package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Persoana;

public class PersoanaGetSexTests {

	@Test
	public void testGetSexRightFemale90() {
		Persoana persoana=new Persoana("Bianca","2980802675432");
		assertEquals("F", persoana.getSex());
	}
	
	@Test
	public void testGetSexRightMale90() {
		Persoana persoana=new Persoana("Ion","1980802675432");
		assertEquals("M", persoana.getSex());
	}
	
	@Test
	public void testGetSexRightMale2000() {
		Persoana persoana=new Persoana("Ion","5030802675674");
		assertEquals("M", persoana.getSex());
	}
	
	@Test
	public void testGetSexRightFemale2000() {
		Persoana persoana=new Persoana("Bianca","6030802675674");
		assertEquals("F", persoana.getSex());
	}
	
	@Test
	public void testGetSexRightMale1800() {
		Persoana persoana=new Persoana("Ion","3890802675674");
		assertEquals("M", persoana.getSex());
	}
	@Test
	public void testGetSexRightFemale1800() {
		Persoana persoana=new Persoana("Ion","4890802675674");
		assertEquals("F", persoana.getSex());
	}
	@Test
	public void testGetSexNecunoscut() {
		Persoana persoana=new Persoana("Gigi","7890802675674");
		assertEquals("N/A", persoana.getSex());
	}
	
	@Test
	public void testCrossCheckGetSexMale() {
		Persoana persoana = new Persoana("Gigi", "1980825376129");
		assertEquals(((Integer.parseInt(persoana.CNP.substring(0, 1)) % 2 == 1) ? "M" : "F"), persoana.getSex());
		
	}
	@Test
	public void testCrossCheckGetSexFemale() {
		Persoana persoana = new Persoana("Bibi", "2980825376129");
		assertEquals(((Integer.parseInt(persoana.CNP.substring(0, 1)) % 2 == 1) ? "M" : "F"), persoana.getSex());
		
	}
	
	@Test
	public void testCrossCheckGetSex() {
		Persoana persoanaMale = new Persoana("Gigi", "5030802675674");
		Persoana persoanaFemale=new Persoana("Lili","6030802675674");
		assertEquals(((Integer.parseInt(persoanaMale.CNP.substring(0, 1)) % 2 == 1) ? "M" : "F"), persoanaMale.getSex());
		assertEquals(((Integer.parseInt(persoanaFemale.CNP.substring(0, 1)) % 2 == 1) ? "M" : "F"), persoanaFemale.getSex());
	}
	@Test(timeout =100)
	public void testPerformantaGetSex() {
		Persoana persoana=new Persoana("Flori","2980802675432");
		persoana.getSex();
		
	}

}
