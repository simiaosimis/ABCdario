package fga.mds.abcdario.persistencia;

import java.util.ArrayList;

import fga.mds.abcdario.model.JogoModel;

public class JogoPersistencia {
	
	private static JogoPersistencia instance;
	
	private ArrayList <JogoModel> cadastroLetra;
	private ArrayList <JogoModel> cadastroNumero;

	/*padrao singleton*/
	private JogoPersistencia(){}
 	private JogoPersistencia getInstance(){
 		if (instance== null)
 			instance=new JogoPersistencia();
 		return instance;
 	}
 	
 	//*********antigo inserirImagemBotao()********//
 	
 	/*declaracao e instanciacao dos objs jogoModel relacionados a letra*/
 	
 	//static JogoModel letra_a=new JogoModel();
 	
 	/*declaracao e instanciacao dos objs jogoModel relacionados a numero*/
 	
 	//static JogoModel numero_1=new JogoModel();
 	
 	
}
