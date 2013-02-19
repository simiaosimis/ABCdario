package fga.mds.abcdario.model.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fga.mds.abcdario.R;
import fga.mds.abcdario.model.ScoreModel;

public class TestScoreModel {

	@Test
	public void testScoreModel() {
		ScoreModel teste = new ScoreModel(2, R.drawable.img_2_estrelas);
		
		assertNotNull(teste);
	}
	
	@Test
	public void testGetQuantidade() {
		ScoreModel teste = new ScoreModel(2, R.drawable.img_2_estrelas);
		int quantidade;
		
		quantidade = teste.getQuantidade();
		
		assertEquals(2, quantidade);
	}
	
	@Test
	public void testGetImg_estrela() {
		ScoreModel teste = new ScoreModel(2, R.drawable.img_2_estrelas);
		int id;
		
		id = teste.getImg_estrela();
		
		assertEquals(R.drawable.img_2_estrelas, id);
	}
	
	@Test
	public void testSetQuantidade() {
		ScoreModel teste = new ScoreModel(2, R.drawable.img_2_estrelas);
		int quantidade;
		
		teste.setQuantidade(3);
		quantidade = teste.getQuantidade();
		
		assertEquals(3, quantidade);
	}
	
	@Test
	public void testSetImg_estrela() {
		ScoreModel teste = new ScoreModel(2, R.drawable.img_2_estrelas);
		int id;
		
		teste.setImg_estrela(R.drawable.img_0_estrelas);
		id = teste.getImg_estrela();
		
		assertEquals(R.drawable.img_0_estrelas, id);
	}
	
}
