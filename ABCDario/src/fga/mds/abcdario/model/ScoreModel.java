package fga.mds.abcdario.model;

//Classe Modelo Score

public class ScoreModel{
	
	private int quantidade; //Variável que armazena a quantidade de estrelas da imagem.
	private int img_estrela; // Variável que armazena o ID da imagem (drawable).
	
	//Contrutor da Classe.
	public ScoreModel(int quantidade, int imgEstrela) {
		setImg_estrela(imgEstrela);
		setQuantidade(quantidade);
	}

	//Get retorna a quantidade de estrelas da imagem. 
	public int getQuantidade() {
		return quantidade;
	}

	//Seta quantidade de estrelas.
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	//Get retorna o ID da imagem (drawable).
	public int getImg_estrela() {
		return img_estrela;
	}

	//Set o ID da imagem (drawable).
	public void setImg_estrela(int img_estrela) {
		this.img_estrela = img_estrela;
	}

}

