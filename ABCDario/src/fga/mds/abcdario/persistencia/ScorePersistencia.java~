package fga.mds.abcdario.persistencia;
import java.util.ArrayList;
import fga.mds.abcdario.R;
import fga.mds.abcdario.model.ScoreModel;

//Classe Persistencia Score.

public class ScorePersistencia {


		//Instanciando a classe.
		private static ScorePersistencia instance;
		
		//Criando arraylist do tipo ScoreModel.
		ArrayList<ScoreModel> cadastroImgEstrela = new ArrayList<ScoreModel>();
		
		//Construtor Classe
		private ScorePersistencia(){}
		
		public static ScorePersistencia getInstance(){
			if(instance == null)
				instance = new ScorePersistencia();
			
			return instance;
		}
		
		//Método que cria e amarzena as Imagens no Array
		public void criaEarmazenaArrayListDeImagens(){
			
			//Criando objetos e atribuindo a quantidade e o ID do drawable:
			ScoreModel img_0_estrelas = new ScoreModel(0,R.drawable.img_0_estrelas);
			ScoreModel img_1_estrela = new ScoreModel(1,R.drawable.img_1_estrela);
			ScoreModel img_2_estrelas = new ScoreModel(2,R.drawable.img_2_estrelas);
			ScoreModel img_3_estrelas = new ScoreModel(3,R.drawable.img_3_estrelas);
			ScoreModel img_4_estrelas = new ScoreModel(4,R.drawable.img_4_estrelas);
			ScoreModel img_5_estrelas = new ScoreModel(5,R.drawable.img_5_estrelas);
		
			//Adicionando os objetos no Array:
			cadastroImgEstrela.add(img_0_estrelas);
			cadastroImgEstrela.add(img_1_estrela);
			cadastroImgEstrela.add(img_2_estrelas);
			cadastroImgEstrela.add(img_3_estrelas);
			cadastroImgEstrela.add(img_4_estrelas);
			cadastroImgEstrela.add(img_5_estrelas);		
		
		}
		
		//Método que retorna o ID do drawable de acordo com o índice obtido pelo parâmetro.
		public int getModelImagemEstrela(int nome){
			
			return cadastroImgEstrela.get(nome).getImg_estrela();
									
		}
	}

	
	

