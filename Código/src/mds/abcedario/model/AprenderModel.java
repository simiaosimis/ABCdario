package mds.tentandoasorte;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AprenderModel implements Serializable{

	int imagem;
	int audio;
	String nome;
	
	public AprenderModel(String nome, int imagem, int audio){
		this.setNome(nome);
		this.setImagem(imagem);
		this.setAudio(audio);
	}

	public AprenderModel() {
	
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "AprenderModel [imagem=" + imagem + ", audio=" + audio
				+ ", nome=" + nome + "]";
	}
	
}
