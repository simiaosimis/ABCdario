package fga.mds.abcdario.persistencia.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fga.mds.abcdario.R;
import fga.mds.abcdario.persistencia.ScorePersistencia;

public class TestScorePersistencia {

	@Test
	public void testScorePersistencia() {
		ScorePersistencia teste = ScorePersistencia.getInstance();
		
		assertNotNull(teste);
	}
	
	@Test
	public void testCriaEarmazenaArrayListDeImagens(){
		ScorePersistencia teste = ScorePersistencia.getInstance();
		int retorno;
		
		retorno = teste.criaEarmazenaArrayListDeImagens();
		
		assertEquals(0, retorno);
	}

	@Test
	public void testGetModelImagemEstrela(){
		ScorePersistencia teste = ScorePersistencia.getInstance();
		int id;
		
		id = teste.getModelImagemEstrela(2);
		
		assertEquals(R.drawable.img_2_estrelas, id);
	}
}
