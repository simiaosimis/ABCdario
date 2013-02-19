package fga.mds.abcdario.persistencia;
import java.util.ArrayList;
import fga.mds.abcdario.R;
import fga.mds.abcdario.model.ScoreModel;

public class ScorePersistencia {

		private static ScorePersistencia instance;
		ArrayList<ScoreModel> cadastroImgEstrela = new ArrayList<ScoreModel>();
		
		private ScorePersistencia(){}
		public static ScorePersistencia getInstance(){
			if(instance == null)
				instance = new ScorePersistencia();
			
			return instance;
		}
		
		public int criaEarmazenaArrayListDeImagens(){
			
			ScoreModel img_0_estrelas = new ScoreModel(0,R.drawable.img_0_estrelas);
			ScoreModel img_1_estrela = new ScoreModel(1,R.drawable.img_1_estrela);
			ScoreModel img_2_estrelas = new ScoreModel(2,R.drawable.img_2_estrelas);
			ScoreModel img_3_estrelas = new ScoreModel(3,R.drawable.img_3_estrelas);
			ScoreModel img_4_estrelas = new ScoreModel(4,R.drawable.img_4_estrelas);
			ScoreModel img_5_estrelas = new ScoreModel(5,R.drawable.img_5_estrelas);
		
			cadastroImgEstrela.add(img_0_estrelas);
			cadastroImgEstrela.add(img_1_estrela);
			cadastroImgEstrela.add(img_2_estrelas);
			cadastroImgEstrela.add(img_3_estrelas);
			cadastroImgEstrela.add(img_4_estrelas);
			cadastroImgEstrela.add(img_5_estrelas);		
			
			if(cadastroImgEstrela.isEmpty())
				return -1;
			
			return 0;
		
		}
		
		public int getModelImagemEstrela(int nome){
			
				return cadastroImgEstrela.get(nome).getImg_estrela();
									
		}
	}
