package teste;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Persoana;
import teste.categorii.CategorieTestePersoaneTinere;
import teste.categorii.CategorieTestePersoaneVarstnice;

public class PersoanaGetVarstaTests {

	
	@Test
	@Category(CategorieTestePersoaneTinere.class)
	public void testGetVarstaRight1900() {
		Persoana persoana=new Persoana("Bianca","2980802675432");
		assertEquals(21, persoana.getVarsta());
	}
	@Test
	@Category(CategorieTestePersoaneTinere.class)
	public void testGetVarstaRight2000() {
		Persoana persoana=new Persoana("Herghelegiu","5030802675674");
		assertEquals(16, persoana.getVarsta());
	}
	@Test
	public void testGetVarstaRight1800() {
		Persoana persoana=new Persoana("Herghelegiu","3890802675674");
		assertEquals(130, persoana.getVarsta());
	}
	@Test
	public void testGetVarstaBoundary1800() {
		Persoana persoana=new Persoana("Herghelegiu","3000101675674");
		assertEquals(220, persoana.getVarsta());
	}
	@Test
	public void testGetVarstaRight1899() {
		Persoana persoana=new Persoana("Herghelegiu","3991231675674");
		assertEquals(120, persoana.getVarsta());
	}
	@Test
	@Category(CategorieTestePersoaneVarstnice.class)
	public void testGetVarstaBoudary1900() {
		Persoana persoana=new Persoana("Bianca","2000101565467");
		assertEquals(120, persoana.getVarsta());
	}
	
	@Test
	public void testGetVarstaBoundary1999() {
		Persoana persoana=new Persoana("Biancaa","2991231768654");
		assertEquals(20, persoana.getVarsta());
	}
	
	@Test
	public void testGetVarstaBoundary2000() {
		Persoana persoana=new Persoana("Hergheleigu","6000101676543");
		assertEquals(20, persoana.getVarsta());
	}
	
	@Test
	public void testGetVarstaBoudarySuperior() {
		Calendar calendar=Calendar.getInstance();
		int an=calendar.get(Calendar.YEAR);
		int luna=1+calendar.get(Calendar.MONTH);
		int zi=calendar.get(Calendar.DAY_OF_MONTH);
		int anCNP=an-2000;
		String cnp="5"+convertInCorrectFormat(anCNP)+convertInCorrectFormat(luna)+convertInCorrectFormat(zi)+"564543";
		Persoana pers=new Persoana("Bianca",cnp);
		assertEquals(0, pers.getVarsta());
		
	}
	
	private String convertInCorrectFormat(int value) {
		if(value<10) {
			return "0"+value;
		}
		else return ""+value;
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	@Category({CategorieTestePersoaneTinere.class,CategorieTestePersoaneVarstnice.class})
	public void testGetVarstaError() {
		Persoana persoana=new Persoana("Flori","0020831676543");
		persoana.getVarsta();
		
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testGetVarstaErrorCurrentDate() {
		Calendar calendar=Calendar.getInstance();
		int an=calendar.get(Calendar.YEAR);
		int luna=1+calendar.get(Calendar.MONTH);
		int zi=calendar.get(Calendar.DAY_OF_MONTH)+1;
		int anCNP=an-2000;
		String cnp="5"+convertInCorrectFormat(anCNP)+convertInCorrectFormat(luna)+convertInCorrectFormat(zi)+"564543";
		Persoana pers=new Persoana("Bianca",cnp);
		pers.getVarsta();
		
	}
	
	@Test(timeout =80)
	public void testPerformanta() {
		Persoana persoana=new Persoana("Flori","2980802675432");
		persoana.getVarsta();
		
	}
	
	@Test
	public void testOrdering() {
		Persoana pers=new Persoana("Lori","2980802675432");
		Persoana pers2=new Persoana("Pers2","2960608675432");
		
		assertTrue(pers.getVarsta()<pers2.getVarsta());
	}
	

}
