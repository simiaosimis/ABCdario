package fga.mds.abcdario.control.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fga.mds.abcdario.R;
import fga.mds.abcdario.control.ScoreController;

public class TestScoreController {

	@Test
	public void testCalculaPorcentagemAcertos() {
		ScoreController teste = new ScoreController();
		double porcentagem;
		double resultado = 50.0;
		
		porcentagem = (double) teste.calculaPorcentagemAcertos(5, 5);
		
		assertEquals(resultado, porcentagem, 1.0);
	}

	@Test
	public void testDefinirImgEstrelas(){
		ScoreController teste = new ScoreController();
		int id;
		
		id = teste.definirImgEstrelas(100);
		
		assertEquals(R.drawable.img_5_estrelas, id);
	}
}
