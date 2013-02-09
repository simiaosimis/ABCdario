package fga.mds.abcdario.persistencia;

import java.util.ArrayList;

import fga.mds.abcdario.R;
import fga.mds.abcdario.model.JogoModel;

public class JogoPersistencia {

	//declaração de variável para instanciar o objeto JogoPersistencia
	private static JogoPersistencia instance;
	
	//Padrão Singleton - Apenas uma instância
	private JogoPersistencia(){}
	
	public static JogoPersistencia getInstance(){
		if(instance == null)
			instance = new JogoPersistencia();
		
		return instance;
	}
	
	//Declarando e instanciando os objetos do tipo JogoModel relacionados as letras
	//static JogoModel letra_a = new JogoModel(); 
	
	//Declarando e instanciando os objetos do tipo JogoModel relacionados aos números
	static JogoModel numero_1_01 = new JogoModel("1",R.drawable.num_1_01, R.drawable.bt_1 );
	static JogoModel numero_1_02 = new JogoModel("1",R.drawable.num_1_02, R.drawable.bt_1 );
	static JogoModel numero_1_03 = new JogoModel("1",R.drawable.num_1_03, R.drawable.bt_1 );
	static JogoModel numero_1_04 = new JogoModel("1",R.drawable.num_1_04, R.drawable.bt_1 );
	static JogoModel numero_1_05 = new JogoModel("1",R.drawable.num_1_05, R.drawable.bt_1 );
	static JogoModel numero_1_06 = new JogoModel("1",R.drawable.num_1_06, R.drawable.bt_1 );
	
	//Declarando e Intanciando um ArrayList que conterá todos os objetos do tipo JogoModel relacionados aos números
	static private ArrayList<JogoModel> cadastroNumero = new ArrayList<JogoModel>();
	static private ArrayList<JogoModel> cadastroLetra = new ArrayList<JogoModel>();
	
	//Armazenando estaticamente
	static{
		cadastroNumero.add(numero_1_01);
		cadastroNumero.add(numero_1_02);
		cadastroNumero.add(numero_1_03);
		cadastroNumero.add(numero_1_04);
		cadastroNumero.add(numero_1_05);
		cadastroNumero.add(numero_1_06);
	}
}

