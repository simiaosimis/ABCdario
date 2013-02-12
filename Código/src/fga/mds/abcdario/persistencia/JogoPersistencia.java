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
	JogoModel letra_a_01 = new JogoModel("a", R.drawable.letra_a_01, R.drawable.bt_a); 
	JogoModel letra_b_01 = new JogoModel("b", R.drawable.letra_b_01, R.drawable.bt_b); 
	JogoModel letra_c_01 = new JogoModel("c", R.drawable.letra_c_01, R.drawable.bt_c);
	JogoModel letra_d_01 = new JogoModel("d", R.drawable.letra_d_01, R.drawable.bt_d); 
	JogoModel letra_e_01 = new JogoModel("e", R.drawable.letra_e_01, R.drawable.bt_e); 
	JogoModel letra_f_01 = new JogoModel("f", R.drawable.letra_f_01, R.drawable.bt_f); 
	JogoModel letra_g_01 = new JogoModel("g", R.drawable.letra_g_01, R.drawable.bt_g); 
	JogoModel letra_h_01 = new JogoModel("h", R.drawable.letra_h_01, R.drawable.bt_h); 
	JogoModel letra_i_01 = new JogoModel("i", R.drawable.letra_i_01, R.drawable.bt_i); 
	JogoModel letra_j_01 = new JogoModel("j", R.drawable.letra_j_01, R.drawable.bt_j); 
	JogoModel letra_k_01 = new JogoModel("k", R.drawable.letra_k_01, R.drawable.bt_k); 
	JogoModel letra_l_01 = new JogoModel("l", R.drawable.letra_l_01, R.drawable.bt_l); 
	JogoModel letra_m_01 = new JogoModel("m", R.drawable.letra_m_01, R.drawable.bt_m); 
	JogoModel letra_n_01 = new JogoModel("n", R.drawable.letra_n_01, R.drawable.bt_n); 
	JogoModel letra_o_01 = new JogoModel("o", R.drawable.letra_o_01, R.drawable.bt_o); 
	JogoModel letra_p_01 = new JogoModel("p", R.drawable.letra_p_01, R.drawable.bt_p); 
	JogoModel letra_q_01 = new JogoModel("q", R.drawable.letra_q_01, R.drawable.bt_q); 
	JogoModel letra_r_01 = new JogoModel("r", R.drawable.letra_r_01, R.drawable.bt_r); 
	JogoModel letra_s_01 = new JogoModel("s", R.drawable.letra_s_01, R.drawable.bt_s); 
	JogoModel letra_t_01 = new JogoModel("t", R.drawable.letra_t_01, R.drawable.bt_t); 
	JogoModel letra_u_01 = new JogoModel("u", R.drawable.letra_u_01, R.drawable.bt_u); 
	JogoModel letra_v_01 = new JogoModel("v", R.drawable.letra_v_01, R.drawable.bt_v); 
	JogoModel letra_w_01 = new JogoModel("w", R.drawable.letra_w_01, R.drawable.bt_w); 
	JogoModel letra_x_01 = new JogoModel("x", R.drawable.letra_x_01, R.drawable.bt_x); 
	JogoModel letra_y_01 = new JogoModel("y", R.drawable.letra_y_01, R.drawable.bt_y); 
	JogoModel letra_z_01 = new JogoModel("z", R.drawable.letra_z_01, R.drawable.bt_z); 
	
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
	
	cadastroNumero.add(numero_2_01);
	cadastroNumero.add(numero_2_02);
	cadastroNumero.add(numero_2_03);
	cadastroNumero.add(numero_2_04);
	cadastroNumero.add(numero_2_05);
	cadastroNumero.add(numero_2_06);
	
	cadastroNumero.add(numero_3_01);
	cadastroNumero.add(numero_3_02);
	cadastroNumero.add(numero_3_03);
	cadastroNumero.add(numero_3_04);
	cadastroNumero.add(numero_3_05);
	cadastroNumero.add(numero_3_06);
	
	cadastroNumero.add(numero_4_01);
	cadastroNumero.add(numero_4_02);
	cadastroNumero.add(numero_4_03);
	cadastroNumero.add(numero_4_04);
	cadastroNumero.add(numero_4_05);
	cadastroNumero.add(numero_4_06);
	
	cadastroNumero.add(numero_5_01);
	cadastroNumero.add(numero_5_02);
	cadastroNumero.add(numero_5_03);
	cadastroNumero.add(numero_5_04);
	cadastroNumero.add(numero_5_05);
	cadastroNumero.add(numero_5_06);
	
	cadastroNumero.add(numero_6_01);
	cadastroNumero.add(numero_6_02);
	cadastroNumero.add(numero_6_03);
	cadastroNumero.add(numero_6_04);
	cadastroNumero.add(numero_6_05);
	cadastroNumero.add(numero_6_06);
	
	cadastroNumero.add(numero_7_01);
	cadastroNumero.add(numero_7_02);
	cadastroNumero.add(numero_7_03);
	cadastroNumero.add(numero_7_04);
	cadastroNumero.add(numero_7_05);
	cadastroNumero.add(numero_7_06);
	
	cadastroNumero.add(numero_8_01);
	cadastroNumero.add(numero_8_02);
	cadastroNumero.add(numero_8_03);
	cadastroNumero.add(numero_8_04);
	cadastroNumero.add(numero_8_05);
	cadastroNumero.add(numero_8_06);
	
	cadastroNumero.add(numero_9_01);
	cadastroNumero.add(numero_9_02);
	cadastroNumero.add(numero_9_03);
	cadastroNumero.add(numero_9_04);
	cadastroNumero.add(numero_9_05);
	cadastroNumero.add(numero_9_06);
	
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
