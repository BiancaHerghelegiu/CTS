package acs.ase.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import acs.ase.clase.CasaDeMarcat;

public class TestsCasaDeMarcatGetInstance {

	@Test
	public void testGetInstance() {
		CasaDeMarcat instance1=CasaDeMarcat.getInstance();
		CasaDeMarcat inscance2=CasaDeMarcat.getInstance();
		assertSame(instance1, inscance2);
	}

}
