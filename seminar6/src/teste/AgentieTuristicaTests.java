package teste;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import clase.AgentieTurism;
import clase.PachetTuristic;
import teste.dubluri.PersoanaFake;

public class AgentieTuristicaTests {

	@Test
	public void testRightCalculareSumaPachete() {
		PersoanaFake persoana1=new PersoanaFake();
		persoana1.setVarsta(22);
		PersoanaFake persoana2=new PersoanaFake();
		persoana1.setVarsta(20);
		PersoanaFake persoana3=new PersoanaFake();
		persoana1.setVarsta(30);
		PachetTuristic pachet1=new PachetTuristic(persoana1, "Barlad", 100.0);
		PachetTuristic pachet2=new PachetTuristic(persoana2, "Bahamas", 1000.0);
		PachetTuristic pachet3=new PachetTuristic(persoana3, "Mexico", 700.0);
		AgentieTurism agentie=new AgentieTurism();
		agentie.adaugaPachet(pachet1);
		agentie.adaugaPachet(pachet2);
		agentie.adaugaPachet(pachet3);
		assertEquals(1800.0, agentie.calculareSumaTotalaPachete(),0.01);
	}
	
	@Test
	public void testRightAgentieGoala() {
		AgentieTurism agentie=new AgentieTurism();
		assertEquals(0.0, agentie.calculareSumaTotalaPachete(),0.01);
	}

	@Test
	public void testOrderingPacheteDinAgentie() {
		PersoanaFake persoana1=new PersoanaFake();
		PersoanaFake persoana2=new PersoanaFake();
		PachetTuristic pachet1=new PachetTuristic(persoana1, "Barlad", 100.0);
		PachetTuristic pachet2=new PachetTuristic(persoana2, "Bahamas", 1000.0);
		AgentieTurism agentie=new AgentieTurism();
		agentie.adaugaPachet(pachet1);
		agentie.adaugaPachet(pachet2);
	
		List<PachetTuristic> pachete=agentie.getPacheteTuristice();
		assertTrue(pachete.get(0).getPret()<pachete.get(1).getPret());
	}
	@Test(timeout = 100)
	public void testPerformanceCalculeazaSumaPachete() {
		PersoanaFake persoana1=new PersoanaFake();
		PachetTuristic pachet1=new PachetTuristic(persoana1, "Barlad", 100.0);
		AgentieTurism agentie=new AgentieTurism();
		agentie.adaugaPachet(pachet1);
		agentie.calculareSumaTotalaPachete();
	}
}
