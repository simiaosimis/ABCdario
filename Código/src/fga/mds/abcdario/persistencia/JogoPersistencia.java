package fga.mds.abcdario.persistencia;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.Random;

import fga.mds.abcdario.R;
import fga.mds.abcdario.model.JogoModel;

public class JogoPersistencia {

	//declaração de variável para instanciar o objeto JogoPersistencia
	private static JogoPersistencia instance;
	
	//Declarando e Intanciando um ArrayList que conterá todos os objetos do tipo JogoModel relacionados aos números
	ArrayList<JogoModel> cadastroNumero = new ArrayList<JogoModel>();
	ArrayList<JogoModel> cadastroLetra = new ArrayList<JogoModel>();
	
	//Padrão Singleton - Apenas uma instância
	private JogoPersistencia(){}
	
	public static JogoPersistencia getInstance(){
		if(instance == null)
			instance = new JogoPersistencia();
		
		return instance;
	}
	
	//método cujo qual será sempre chamado para inicializar/atualizar o cadastro
	public void atualizaCadastro(){
		
	//Declarando e instanciando os objetos do tipo JogoModel relacionados as letras
	JogoModel letra_a_01 = new JogoModel("a", R.drawable.abelha, R.drawable.bt_a); 
	
	//Declarando e instanciando os objetos do tipo JogoModel relacionados aos números
	JogoModel numero_1_01 = new JogoModel("1",R.drawable.num_1_01, R.drawable.bt_1 );
	JogoModel numero_1_02 = new JogoModel("1",R.drawable.num_1_02, R.drawable.bt_1 );
	JogoModel numero_1_03 = new JogoModel("1",R.drawable.num_1_03, R.drawable.bt_1 );
	JogoModel numero_1_04 = new JogoModel("1",R.drawable.num_1_04, R.drawable.bt_1 );
	JogoModel numero_1_05 = new JogoModel("1",R.drawable.num_1_05, R.drawable.bt_1 );
	JogoModel numero_1_06 = new JogoModel("1",R.drawable.num_1_06, R.drawable.bt_1 );
	
	JogoModel numero_2_01 = new JogoModel("2",R.drawable.num_2_01, R.drawable.bt_2 );
	JogoModel numero_2_02 = new JogoModel("2",R.drawable.num_2_02, R.drawable.bt_2 );
	JogoModel numero_2_03 = new JogoModel("2",R.drawable.num_2_03, R.drawable.bt_2 );
	JogoModel numero_2_04 = new JogoModel("2",R.drawable.num_2_04, R.drawable.bt_2 );
	JogoModel numero_2_05 = new JogoModel("2",R.drawable.num_2_05, R.drawable.bt_2 );
	JogoModel numero_2_06 = new JogoModel("2",R.drawable.num_2_06, R.drawable.bt_2 );
	
	JogoModel numero_3_01 = new JogoModel("3",R.drawable.num_3_01, R.drawable.bt_3 );
	JogoModel numero_3_02 = new JogoModel("3",R.drawable.num_3_02, R.drawable.bt_3 );
	JogoModel numero_3_03 = new JogoModel("3",R.drawable.num_3_03, R.drawable.bt_3 );
	JogoModel numero_3_04 = new JogoModel("3",R.drawable.num_3_04, R.drawable.bt_3 );
	JogoModel numero_3_05 = new JogoModel("3",R.drawable.num_3_05, R.drawable.bt_3 );
	JogoModel numero_3_06 = new JogoModel("3",R.drawable.num_3_06, R.drawable.bt_3 );
	
	JogoModel numero_4_01 = new JogoModel("4",R.drawable.num_4_01, R.drawable.bt_4 );
	JogoModel numero_4_02 = new JogoModel("4",R.drawable.num_4_02, R.drawable.bt_4 );
	JogoModel numero_4_03 = new JogoModel("4",R.drawable.num_4_03, R.drawable.bt_4 );
	JogoModel numero_4_04 = new JogoModel("4",R.drawable.num_4_04, R.drawable.bt_4 );
	JogoModel numero_4_05 = new JogoModel("4",R.drawable.num_4_05, R.drawable.bt_4 );
	JogoModel numero_4_06 = new JogoModel("4",R.drawable.num_4_06, R.drawable.bt_4 );
	
	JogoModel numero_5_01 = new JogoModel("5",R.drawable.num_5_01, R.drawable.bt_5 );
	JogoModel numero_5_02 = new JogoModel("5",R.drawable.num_5_02, R.drawable.bt_5 );
	JogoModel numero_5_03 = new JogoModel("5",R.drawable.num_5_03, R.drawable.bt_5 );
	JogoModel numero_5_04 = new JogoModel("5",R.drawable.num_5_04, R.drawable.bt_5 );
	JogoModel numero_5_05 = new JogoModel("5",R.drawable.num_5_05, R.drawable.bt_5 );
	JogoModel numero_5_06 = new JogoModel("5",R.drawable.num_5_06, R.drawable.bt_5 );
	
	JogoModel numero_6_01 = new JogoModel("6",R.drawable.num_6_01, R.drawable.bt_6 );
	JogoModel numero_6_02 = new JogoModel("6",R.drawable.num_6_02, R.drawable.bt_6 );
	JogoModel numero_6_03 = new JogoModel("6",R.drawable.num_6_03, R.drawable.bt_6 );
	JogoModel numero_6_04 = new JogoModel("6",R.drawable.num_6_04, R.drawable.bt_6 );
	JogoModel numero_6_05 = new JogoModel("6",R.drawable.num_6_05, R.drawable.bt_6 );
	JogoModel numero_6_06 = new JogoModel("6",R.drawable.num_6_06, R.drawable.bt_6 );
	
	JogoModel numero_7_01 = new JogoModel("7",R.drawable.num_7_01, R.drawable.bt_7 );
	JogoModel numero_7_02 = new JogoModel("7",R.drawable.num_7_02, R.drawable.bt_7 );
	JogoModel numero_7_03 = new JogoModel("7",R.drawable.num_7_03, R.drawable.bt_7 );
	JogoModel numero_7_04 = new JogoModel("7",R.drawable.num_7_04, R.drawable.bt_7 );
	JogoModel numero_7_05 = new JogoModel("7",R.drawable.num_7_05, R.drawable.bt_7 );
	JogoModel numero_7_06 = new JogoModel("7",R.drawable.num_7_06, R.drawable.bt_7 );
	
	JogoModel numero_8_01 = new JogoModel("8",R.drawable.num_8_01, R.drawable.bt_8 );
	JogoModel numero_8_02 = new JogoModel("8",R.drawable.num_8_02, R.drawable.bt_8 );
	JogoModel numero_8_03 = new JogoModel("8",R.drawable.num_8_03, R.drawable.bt_8 );
	JogoModel numero_8_04 = new JogoModel("8",R.drawable.num_8_04, R.drawable.bt_8 );
	JogoModel numero_8_05 = new JogoModel("8",R.drawable.num_8_05, R.drawable.bt_8 );
	JogoModel numero_8_06 = new JogoModel("8",R.drawable.num_8_06, R.drawable.bt_8 );
	
	JogoModel numero_9_01 = new JogoModel("9",R.drawable.num_9_01, R.drawable.bt_9 );
	JogoModel numero_9_02 = new JogoModel("9",R.drawable.num_9_02, R.drawable.bt_9 );
	JogoModel numero_9_03 = new JogoModel("9",R.drawable.num_9_03, R.drawable.bt_9 );
	JogoModel numero_9_04 = new JogoModel("9",R.drawable.num_9_04, R.drawable.bt_9 );
	JogoModel numero_9_05 = new JogoModel("9",R.drawable.num_9_05, R.drawable.bt_9 );
	JogoModel numero_9_06 = new JogoModel("9",R.drawable.num_9_06, R.drawable.bt_9 );
	
	//Armazenando no cadastroNumero
	cadastroNumero.add(numero_1_01);
	cadastroNumero.add(numero_1_02);
	cadastroNumero.add(numero_1_03);
	cadastroNumero.add(numero_1_04);
	cadastroNumero.add(numero_1_05);
	cadastroNumero.add(numero_1_06);
	
	//Armazenando no cadastroLetra
	cadastroLetra.add(letra_a_01);
	
	}
	
	//Função para retornar objeto do tipo JogoModel a partir do envio de um número desejada
	public JogoModel getModelNumero(String numero){
		
		Iterator<JogoModel> i = cadastroNumero.iterator();
		
		JogoModel vetor[] = new JogoModel[6];
		int cont = 0;
		
		while(i.hasNext()){
			
			JogoModel jm = (JogoModel) i.next();
			
			String nome = jm.getNome();
			
			if(nome.equalsIgnoreCase(numero)){
				vetor[cont] = jm;
				cont++;
			}
		}
		
		Random num = new Random();
		int indice = Math.abs(num.nextInt() % 6) + 1  ;
		
		return vetor[indice];
	}
	
	//Função para retornar objeto do tipo JogoModel a partir do envio de uma letra desejada
		public JogoModel getModelLetra(String letra){
			
			Iterator<JogoModel> i = cadastroLetra.iterator();
			
			//JogoModel vetor[] = new JogoModel[6];
			//int cont = 0;
			
			while(i.hasNext()){
				
				JogoModel jm = (JogoModel) i.next();
				
				String nome = jm.getNome();
				
				if(nome.equalsIgnoreCase(letra)){
					//vetor[cont] = jm;
					//cont++;
					return jm;
				}
			}
			
			//Random num = new Random();
			//int indice = Math.abs(num.nextInt() % 6) + 1  ;
			
			//return vetor[indice];
			return null;
		}
}
