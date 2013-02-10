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
