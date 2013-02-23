package fga.mds.abcdario.persistencia;

import java.util.ArrayList;
import java.util.Iterator;

import fga.mds.abcdario.R;
import fga.mds.abcdario.model.AprenderModel;

public class AprenderPersistencia {

	private ArrayList<AprenderModel> cadastroNumero= new ArrayList<AprenderModel>();
	private ArrayList<AprenderModel> cadastroLetra= new ArrayList<AprenderModel>();
	
	private static AprenderPersistencia instance;
	
	private AprenderPersistencia(){}
	
	public static AprenderPersistencia getInstance(){
		if(instance == null){
			instance = new AprenderPersistencia();
			instance.atualizaCadastro();
		}
		return instance;
	}

	private int atualizaCadastro() {
		
		//Declarando e instanciando os objetos do tipo AprenderModel relacionados as letras
		AprenderModel letra_a = new AprenderModel("a",R.drawable.a_abelha, R.raw.a_aviao);		
		AprenderModel letra_b = new AprenderModel("b", R.drawable.b_de_borboleta, R.raw.b_borboleta); 		
		AprenderModel letra_c = new AprenderModel("c", R.drawable.c_casa, R.raw.c_casa);
		AprenderModel letra_d = new AprenderModel("d", R.drawable.d_de_dinossauro, R.raw.d_dinossauro);
		AprenderModel letra_e = new AprenderModel("e", R.drawable.e_de_esquilo, R.raw.e_esquilo);
		AprenderModel letra_f = new AprenderModel("f", R.drawable.f_de_foca, R.raw.f_foca);
		AprenderModel letra_g = new AprenderModel("g", R.drawable.g_de_goiaba, R.raw.g_goiaba);
		AprenderModel letra_h = new AprenderModel("h", R.drawable.h_de_hipopotamo, R.raw.h_hipopotamo);
		AprenderModel letra_i = new AprenderModel("i", R.drawable.i_indio, R.raw.i_indio);
		AprenderModel letra_j = new AprenderModel("j", R.drawable.j_jacare, R.raw.j_jacare);
		AprenderModel letra_k = new AprenderModel("k", R.drawable.k_de_ketchup, R.raw.k_ketchup);
		AprenderModel letra_l = new AprenderModel("l", R.drawable.l_leao, R.raw.l_leao);
		AprenderModel letra_m = new AprenderModel("m", R.drawable.m_de_maca, R.raw.m_maca);
		AprenderModel letra_n = new AprenderModel("n", R.drawable.n_navio, R.raw.n_navio);
		AprenderModel letra_o = new AprenderModel("o", R.drawable.o_de_onibus, R.raw.o_onibus);
		AprenderModel letra_p = new AprenderModel("p", R.drawable.p_de_patins, R.raw.p_patins);
		AprenderModel letra_q = new AprenderModel("q", R.drawable.q_queijo, R.raw.q_queijo);
		AprenderModel letra_r = new AprenderModel("r", R.drawable.r_rato, R.raw.r_rato);
		AprenderModel letra_s = new AprenderModel("s", R.drawable.s_sapo, R.raw.s_sapo);
		AprenderModel letra_t = new AprenderModel("t", R.drawable.t_tatu, R.raw.t_tatu);
		AprenderModel letra_u = new AprenderModel("u", R.drawable.u_de_urso, R.raw.u_urso);
		AprenderModel letra_v = new AprenderModel("v", R.drawable.v_vaca, R.raw.v_vaca);
		AprenderModel letra_w = new AprenderModel("w", R.drawable.w_de_wafer, R.raw.w_wafer);
		AprenderModel letra_x = new AprenderModel("x", R.drawable.x_xicara, R.raw.x_xicara);
		AprenderModel letra_y = new AprenderModel("y", R.drawable.y_yakult, R.raw.y_yakult);
		AprenderModel letra_z = new AprenderModel("z", R.drawable.z_zebra, R.raw.z_zebra);
		
		//Declarando e instanciando os objetos do tipo AprenderModel relacionados aos números
		AprenderModel numero_1 = new AprenderModel("1", R.drawable.num_1_um, R.raw.um);
		AprenderModel numero_2 = new AprenderModel("2", R.drawable.num_2_dois, R.raw.dois);
		AprenderModel numero_3 = new AprenderModel("3", R.drawable.num_3_tres, R.raw.tres);
		AprenderModel numero_4 = new AprenderModel("4", R.drawable.num_4_quatro, R.raw.quatro);
		AprenderModel numero_5 = new AprenderModel("5", R.drawable.num_5_cinco, R.raw.cinco);
		AprenderModel numero_6 = new AprenderModel("6", R.drawable.num_6_seis, R.raw.seis);
		AprenderModel numero_7 = new AprenderModel("7", R.drawable.num_7_sete, R.raw.sete);
		AprenderModel numero_8 = new AprenderModel("8", R.drawable.num_8_oito, R.raw.oito);
		AprenderModel numero_9 = new AprenderModel("9", R.drawable.num_9_nove, R.raw.nove);
		
		//Armazenando no cadastroLetra
		cadastroLetra.add(letra_a);		
		cadastroLetra.add(letra_b);		
		cadastroLetra.add(letra_c);
		cadastroLetra.add(letra_d);
		cadastroLetra.add(letra_e);
		cadastroLetra.add(letra_f);
		cadastroLetra.add(letra_g);
		cadastroLetra.add(letra_h);
		cadastroLetra.add(letra_i);
		cadastroLetra.add(letra_j);
		cadastroLetra.add(letra_k);
		cadastroLetra.add(letra_l);
		cadastroLetra.add(letra_m);
		cadastroLetra.add(letra_n);
		cadastroLetra.add(letra_o);
		cadastroLetra.add(letra_p);
		cadastroLetra.add(letra_q);
		cadastroLetra.add(letra_r);
		cadastroLetra.add(letra_s);
		cadastroLetra.add(letra_t);
		cadastroLetra.add(letra_u);
		cadastroLetra.add(letra_v);
		cadastroLetra.add(letra_w);
		cadastroLetra.add(letra_x);
		cadastroLetra.add(letra_y);
		cadastroLetra.add(letra_z);
		
		//Armazenando no cadastroNumero
		cadastroNumero.add(numero_1);
		cadastroNumero.add(numero_2);
		cadastroNumero.add(numero_3);
		cadastroNumero.add(numero_4);
		cadastroNumero.add(numero_5);
		cadastroNumero.add(numero_6);
		cadastroNumero.add(numero_7);
		cadastroNumero.add(numero_8);
		cadastroNumero.add(numero_9);
		
		//verificação
		if(cadastroLetra.isEmpty() /*|| cadastroNumero.isEmpty()*/)
			return -1;
				
		return 0;
	}
	
	//Função para retornar objeto do tipo AprenderModel - letras
	public AprenderModel getModelLetra(String letra){
			
		Iterator<AprenderModel> i = cadastroLetra.iterator();
		
		while(i.hasNext()){
			
			AprenderModel am = (AprenderModel) i.next();
			
			String nome = am.getNome();
			
			if(nome.equalsIgnoreCase(letra))
				return am;
		}
		
		return null;
	}

	//Função para retornar objeto do tipo AprenderModel - numeros
	public AprenderModel getModelNumero(String numero) {
		
		Iterator<AprenderModel> i = cadastroNumero.iterator();
		
		while(i.hasNext()){
			
			AprenderModel am = (AprenderModel) i.next();
			
			String nome = am.getNome();
			
			if(nome.equalsIgnoreCase(numero))
				return am;
		}
		
		return null;
	}
}
