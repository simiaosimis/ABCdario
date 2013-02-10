package fga.mds.abcdario.model.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fga.mds.abcdario.model.JogoModel;

public class TestJogoModel {

	@Test
	public void testJogoModel() {
		JogoModel instancia = new JogoModel("nome", 1, 2);
		
		assertEquals("nome", instancia.getNome());
		assertEquals(1, instancia.getImagem());
		assertEquals(2, instancia.getBotao());
	}

	@Test
	public void testGetNome() {
		JogoModel instancia = new JogoModel("nome", 1, 2);
		
		String nome = instancia.getNome();
		
		assertEquals("nome", nome);
	}
	
	@Test
	public void testSetNome() {
		JogoModel instancia = new JogoModel("nome", 1, 2);
		
		String nome = "outro";
		
		instancia.setNome(nome);
		
		assertEquals("outro", instancia.getNome());
	}
	
	@Test
	public void testGetImagem() {
		JogoModel instancia = new JogoModel("nome", 1, 2);
		
		int imagem = instancia.getImagem();
		
		assertEquals(1, imagem);
	}
	
	@Test
	public void testSetImagem() {
		JogoModel instancia = new JogoModel("nome", 1, 2);
		
		int imagem = 2;
		
		instancia.setImagem(imagem);
		
		assertEquals(2, instancia.getImagem());
	}
	
	@Test
	public void testGetBotao() {
		JogoModel instancia = new JogoModel("nome", 1, 2);
		
		int botao = instancia.getBotao();
		
		assertEquals(2, botao);
	}
	
	@Test
	public void testSetBotao() {
		JogoModel instancia = new JogoModel("nome", 1, 2);
		
		int botao = 3;
		
		instancia.setBotao(botao);
		
		assertEquals(3, instancia.getBotao());
	}
}
