package fga.mds.abcdario.model;

public class AprenderModel {

	private String nome;
	private int imagem;
	private int audio;
	
	public AprenderModel(String nome, int imagem, int audio){
		this.nome = nome;
		this.imagem = imagem;
		this.audio = audio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getImagem() {
		return imagem;
	}

	public void setImagem(int imagem) {
		this.imagem = imagem;
	}

	public int getAudio() {
		return audio;
	}

	public void setAudio(int audio) {
		this.audio = audio;
	}
}
