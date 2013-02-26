package fga.mds.abcdario.control.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fga.mds.abcdario.control.AprenderController;

public class TestAprenderController {

	@Test
	public void testAprenderController() {
		AprenderController teste = new AprenderController();
		
		assertNotNull(teste);
	}
	
	@Test
	public void testDefinirNumero(){
		AprenderController teste = new AprenderController();
		int id[] = new int[2];
		
		id = teste.definirNumero(1);
		
		assertNotNull(id);
	}
	
	@Test
	public void testDefinirLetra(){
		AprenderController teste = new AprenderController();
		int id[] = new int[2];
		
		id = teste.definirLetra(1);
		
		assertNotNull(id);
	}

}
