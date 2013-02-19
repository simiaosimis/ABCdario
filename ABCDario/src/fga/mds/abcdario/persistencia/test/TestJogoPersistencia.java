package fga.mds.abcdario.persistencia.test;

import static org.junit.Assert.*;

import org.junit.Test;
import fga.mds.abcdario.R;
import fga.mds.abcdario.model.JogoModel;
import fga.mds.abcdario.persistencia.JogoPersistencia;

public class TestJogoPersistencia {

	@Test
	public void testGetInstance() {
		
		JogoPersistencia instancia = JogoPersistencia.getInstance();
		JogoPersistencia instancia2 = JogoPersistencia.getInstance();
		
		assertEquals(instancia, instancia2);
	}

	@Test
	public void testCadastro(){
		JogoPersistencia teste = JogoPersistencia.getInstance();
		int retorno;
		
		retorno = teste.atualizaCadastro();
		
		assertEquals(0, retorno);
	}
	
	@Test
	public void testGetModelNumero(){
		
		JogoPersistencia instancia = JogoPersistencia.getInstance();
		
		instancia.atualizaCadastro();
		JogoModel objeto = instancia.getModelNumero("1");
		
		assertEquals("1", objeto.getNome());
		assertEquals(R.drawable.bt_1 , objeto.getBotao());
	}
	
	@Test
	public void testGetModelLetra(){
		
		JogoPersistencia instancia = JogoPersistencia.getInstance();
		
		instancia.atualizaCadastro();
		JogoModel objeto = instancia.getModelLetra("a");
		
		assertEquals("a", objeto.getNome());
		
		JogoModel objeto2 = instancia.getModelLetra("1");
		
		assertNull(objeto2);
	}
}
