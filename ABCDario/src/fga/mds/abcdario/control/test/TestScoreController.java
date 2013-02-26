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
	public void testDefinirImgEstrelas5(){
		ScoreController teste = new ScoreController();
		int id;
		
		id = teste.definirImgEstrelas(100);
		
		assertEquals(R.drawable.img_5_estrelas, id);
	}
	
	@Test
	public void testDefinirImgEstrelas4(){
		ScoreController teste = new ScoreController();
		int id;
		
		id = teste.definirImgEstrelas(70);
		
		assertEquals(R.drawable.img_4_estrelas, id);
	}
	
	@Test
	public void testDefinirImgEstrelas3(){
		ScoreController teste = new ScoreController();
		int id;
		
		id = teste.definirImgEstrelas(50);
		
		assertEquals(R.drawable.img_3_estrelas, id);
	}
	
	@Test
	public void testDefinirImgEstrelas2(){
		ScoreController teste = new ScoreController();
		int id;
		
		id = teste.definirImgEstrelas(30);
		
		assertEquals(R.drawable.img_2_estrelas, id);
	}
	
	@Test
	public void testDefinirImgEstrelas1(){
		ScoreController teste = new ScoreController();
		int id;
		
		id = teste.definirImgEstrelas(15);
		
		assertEquals(R.drawable.img_1_estrela, id);
	}
	
	@Test
	public void testDefinirImgEstrelas0(){
		ScoreController teste = new ScoreController();
		int id;
		
		id = teste.definirImgEstrelas(0);
		
		assertEquals(R.drawable.img_0_estrelas, id);
	}
	
	@Test
	public void testDefinirImgEstrelas(){
		ScoreController teste = new ScoreController();
		int id;
		
		id = teste.definirImgEstrelas(-1);
		
		assertEquals(R.drawable.img_0_estrelas, id);
	}
}
