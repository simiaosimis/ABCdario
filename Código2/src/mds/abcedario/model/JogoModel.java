package fga.mds.abcdario.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class JogoModel implements Serializable{

	private String nome;
	private int imagem;
	private int botao;
	
	public JogoModel(String nome, int imagem, int botao){
		setNome(nome);
		setImagem(imagem);
		setBotao(botao);
	}

	public int getImagem() {
		return imagem;
	}

	public void setImagem(int imagem) {
		this.imagem = imagem;
	}

	public int getBotao() {
		return botao;
	}

	public void setBotao(int botao) {
		this.botao = botao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}

