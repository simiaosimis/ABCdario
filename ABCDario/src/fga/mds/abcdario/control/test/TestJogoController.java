package fga.mds.abcdario.control.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fga.mds.abcdario.control.JogoController;

public class TestJogoController {

	@Test
	public void testJogoController() {
		JogoController teste = new JogoController();
		
		assertNotNull(teste);
	}
	
	@Test
	public void testGetModelNumero(){
		JogoController teste = new JogoController();
		int id[] = new int[2];
		
		id = teste.getModelNumero();
		
		assertNotNull(id);
	}
	
	@Test
	public void testGetModelLetra(){
		JogoController teste = new JogoController();
		int id[] = new int[2];
		
		id = teste.getModelLetra();
		
		assertNotNull(id);
	}

	@Test
	public void testGetIdBotaoNumero(){
		JogoController teste = new JogoController();
		int id;
		
		id = teste.getIdBotaoNumero();
		
		assertNotNull(id);
	}
	
	@Test
	public void testGetIdBotaoLetra(){
		JogoController teste = new JogoController();
		int id;
		
		id = teste.getIdBotaoLetra();
		
		assertNotNull(id);
	}
}
