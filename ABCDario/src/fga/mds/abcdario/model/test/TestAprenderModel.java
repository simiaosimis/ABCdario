package fga.mds.abcdario.model.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fga.mds.abcdario.model.AprenderModel;

public class TestAprenderModel {

	@Test
	public void testAprenderModel() {
		AprenderModel teste = new AprenderModel("nome", 1, 2);
		
		assertEquals("nome", teste.getNome());
		assertEquals(1, teste.getImagem());
		assertEquals(2, teste.getAudio());
	}
	
	@Test
	public void testGetNome() {
		AprenderModel instancia = new AprenderModel("nome", 1, 2);
		
		String nome = instancia.getNome();
		
		assertEquals("nome", nome);
	}
	
	@Test
	public void testSetNome() {
		AprenderModel instancia = new AprenderModel("nome", 1, 2);
		
		String nome = "outro";
		
		instancia.setNome(nome);
		
		assertEquals("outro", instancia.getNome());
	}
	
	@Test
	public void testGetImagem() {
		AprenderModel instancia = new AprenderModel("nome", 1, 2);
		
		int imagem = instancia.getImagem();
		
		assertEquals(1, imagem);
	}
	
	@Test
	public void testSetImagem() {
		AprenderModel instancia = new AprenderModel("nome", 1, 2);
		
		int imagem = 2;
		
		instancia.setImagem(imagem);
		
		assertEquals(2, instancia.getImagem());
	}
	
	@Test
	public void testGetAudio() {
		AprenderModel instancia = new AprenderModel("nome", 1, 2);
		
		int botao = instancia.getAudio();
		
		assertEquals(2, botao);
	}
	
	@Test
	public void testSetAudio() {
		AprenderModel instancia = new AprenderModel("nome", 1, 2);
		
		int botao = 3;
		
		instancia.setAudio(botao);
		
		assertEquals(3, instancia.getAudio());
	}

}
